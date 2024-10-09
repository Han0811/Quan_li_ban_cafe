package com.project.quan_li_ban_cafe.services.orderService;

import com.project.quan_li_ban_cafe.models.Order;
import com.project.quan_li_ban_cafe.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService implements IOrderSerrvice{
    @Autowired
    private OrderRepository orderRepository;

    @Override
    public Order createOrder(Order order) {
        if(order != null) {
            return orderRepository.save(order);
        }
        return null;
    }

    @Override
    public Order updateOrder(long id, Order order) {
        if(order != null) {
            Order result = orderRepository.getById(id);
            if(result != null) {
                result.setId_staff(order.getId_staff());
                result.setId_customer(order.getId_customer());
                result.setOrder_time(order.getOrder_time());

                return orderRepository.save(result);
            }
        }
        return null;
    }

    @Override
    public boolean deleteOrder(long id) {
        if(id > 0){
            Order result = orderRepository.getById(id);
            if(result != null) {
                orderRepository.delete(result);
                return true;
            }
        }
        return false;
    }

    @Override
    public Order getOneOrder(long id) {
        return orderRepository.getById(id) ;
    }

    @Override
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }
}
