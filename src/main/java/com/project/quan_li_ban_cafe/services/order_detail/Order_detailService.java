package com.project.quan_li_ban_cafe.services.order_detail;

import com.project.quan_li_ban_cafe.models.Order_detail;
import com.project.quan_li_ban_cafe.repositories.Order_detailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Order_detailService implements IOrder_detailService{
    @Autowired
    private Order_detailRepository order_detailRepository;

    @Override
    public Order_detail createOrder_detail(Order_detail order_detail) {
        if(order_detailRepository != null){
            return order_detailRepository.save(order_detail);
        }
        return null;
    }

    @Override
    public Order_detail updateOrder_detail(long id, Order_detail order_detail) {
        if(order_detailRepository != null){
            Order_detail result = order_detailRepository.getById(id);
            if(result != null){
                result.setId_order(order_detail.getId_order());
                result.setId_product(order_detail.getId_product());
                result.setPrice(order_detail.getPrice());
                result.setAmount(order_detail.getAmount());

                return order_detailRepository.save(result);
            }
        }
        return null;
    }

    @Override
    public boolean deleteOrder_detail(long id) {
        if(id > 0){
            Order_detail order_detail = order_detailRepository.getById(id);
            if(order_detail != null){
                order_detailRepository.delete(order_detail);
                return true;
            }
        }
        return false;
    }

    @Override
    public Order_detail getOrder_detail(long id) {
        return order_detailRepository.getById(id);
    }

    @Override
    public List<Order_detail> getAllOrder_detail() {
        return order_detailRepository.findAll();
    }
}
