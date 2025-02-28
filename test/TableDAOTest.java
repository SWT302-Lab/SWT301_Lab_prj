
import dal.TableDAO;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Table;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TableDAOTest {

    @Mock
    private Connection connection;

    @Mock
    private PreparedStatement preparedStatement;

    @Mock
    private ResultSet resultSet;

    @InjectMocks
    private TableDAO tableDAO;

    @Before
    public void setUp() throws SQLException {
        MockitoAnnotations.openMocks(this);
        when(connection.prepareStatement(anyString())).thenReturn(preparedStatement);
        when(preparedStatement.executeQuery()).thenReturn(resultSet);
    }

    @Test
    public void testFindTableById_Found() throws SQLException {
        int tableId = 1;
        String status = "occupied";

        when(resultSet.next()).thenReturn(true);
        when(resultSet.getInt(1)).thenReturn(tableId);
        when(resultSet.getString(2)).thenReturn(status);

        Table result = tableDAO.findTableById(tableId);

        assertNotNull(result);
        assertEquals(tableId, result.getId());
        assertEquals(status, result.getStatus());
    }

    @Test
    public void testFindTableById_NotFound() throws SQLException {
        when(resultSet.next()).thenReturn(false);

        Table result = tableDAO.findTableById(2);

        assertNull(result);
    }

    @Test
    public void testInsertTable() throws SQLException {
        Table table = new Table(1, "Available");

        when(connection.prepareStatement(anyString())).thenReturn(preparedStatement);

        tableDAO.insertTable(table);

        verify(preparedStatement, times(1)).setInt(1, table.getId());
        verify(preparedStatement, times(1)).setString(2, table.getStatus());
        verify(preparedStatement, times(1)).executeUpdate();
    }
}
