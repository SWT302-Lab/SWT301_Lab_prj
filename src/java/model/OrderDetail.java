/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDateTime;

/**
 *
 * @author ADMIN
 */
public class OrderDetail {

    private int orderDetailId;
    private int orderId;
    private int tableId;
    private int dishId;
    private String dishName;
    private int quantity;
    private int price;
    private String status;
    private LocalDateTime orderTime;
    private String orderStatus;
    private boolean urgent;

    public OrderDetail() {
    }
    
    private OrderDetail(Builder builder) {
        this.orderDetailId = builder.orderDetailId;
        this.orderId = builder.orderId;
        this.tableId = builder.tableId;
        this.dishId = builder.dishId;
        this.dishName = builder.dishName;
        this.quantity = builder.quantity;
        this.price = builder.price;
    }

     public static class Builder {
        private int orderDetailId;
        private int orderId;
        private int tableId;
        private int dishId;
        private String dishName;
        private int quantity;
        private int price;

        public Builder orderDetailId(int orderDetailId) {
            this.orderDetailId = orderDetailId;
            return this;
        }

        public Builder orderId(int orderId) {
            this.orderId = orderId;
            return this;
        }

        public Builder tableId(int tableId) {
            this.tableId = tableId;
            return this;
        }

        public Builder dishId(int dishId) {
            this.dishId = dishId;
            return this;
        }

        public Builder dishName(String dishName) {
            this.dishName = dishName;
            return this;
        }

        public Builder quantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public Builder price(int price) {
            this.price = price;
            return this;
        }

        public OrderDetail build() {
            return new OrderDetail(this);
        }
    }

    public int getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId(int orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getTableId() {
        return tableId;
    }

    public void setTableId(int tableId) {
        this.tableId = tableId;
    }

    public int getDishId() {
        return dishId;
    }

    public void setDishId(int dishId) {
        this.dishId = dishId;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(LocalDateTime orderTime) {
        this.orderTime = orderTime;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public boolean isUrgent() {
        return urgent;
    }

    public void setUrgent(boolean urgent) {
        this.urgent = urgent;
    } 
    
}
