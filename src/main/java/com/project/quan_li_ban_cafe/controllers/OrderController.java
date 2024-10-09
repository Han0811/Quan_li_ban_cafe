package com.project.quan_li_ban_cafe.controllers;

import com.project.quan_li_ban_cafe.models.Order;
import com.project.quan_li_ban_cafe.services.orderService.IOrderSerrvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private IOrderSerrvice orderSerrvice;

    @PostMapping("/addorder")
    public Order addOrder(@RequestBody Order order) {
        return orderSerrvice.createOrder(order);
    }

    @PutMapping("/update")
    public Order updateOrder(@PathVariable long id,@RequestBody Order order) {
        return orderSerrvice.updateOrder(id, order);
    }

    @DeleteMapping("/delete")
    public boolean deleteOrder(@PathVariable long id) {
        return orderSerrvice.deleteOrder(id);
    }

    @GetMapping("/list")
    public List<Order> getAllOrders() {
        return orderSerrvice.getAllOrders();
    }

    @GetMapping("/one order")
    public Order getOrderById(@PathVariable long id) {
        return orderSerrvice.getOneOrder(id);
    }
}
