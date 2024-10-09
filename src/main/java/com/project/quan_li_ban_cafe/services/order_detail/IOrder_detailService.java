package com.project.quan_li_ban_cafe.services.order_detail;

import com.project.quan_li_ban_cafe.models.Order_detail;

import java.util.List;

public interface IOrder_detailService {
    public Order_detail createOrder_detail(Order_detail order_detail);
    public Order_detail updateOrder_detail(long id,Order_detail order_detail);
    public boolean deleteOrder_detail(long id);
    public Order_detail getOrder_detail(long id);
    public List<Order_detail> getAllOrder_detail();
}
