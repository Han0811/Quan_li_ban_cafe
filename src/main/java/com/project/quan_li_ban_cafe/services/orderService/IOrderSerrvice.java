package com.project.quan_li_ban_cafe.services.orderService;

import com.project.quan_li_ban_cafe.models.Order;

import java.util.List;

public interface IOrderSerrvice {
    public Order createOrder(Order order);
    public Order updateOrder(long id,Order order);
    public boolean deleteOrder(long id);
    public Order getOneOrder(long id);
    public List<Order> getAllOrders();
}
