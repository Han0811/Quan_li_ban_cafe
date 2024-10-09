package com.project.quan_li_ban_cafe.controllers;

import com.project.quan_li_ban_cafe.models.Order_detail;
import com.project.quan_li_ban_cafe.services.order_detail.IOrder_detailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order_detail")
public class Order_detailController {
    @Autowired
    private IOrder_detailService order_detailService;

    @PostMapping("/add")
    public Order_detail add(@RequestBody Order_detail order_detail) {
        return order_detailService.createOrder_detail(order_detail);
    }

    @PutMapping("/update")
    public Order_detail update(@PathVariable long id,@RequestBody Order_detail order_detail) {
        return order_detailService.updateOrder_detail(id, order_detail);
    }

    @DeleteMapping("/delete")
    public boolean delete(@PathVariable long id) {
        return order_detailService.deleteOrder_detail(id);
    }

    @GetMapping("/list")
    public List<Order_detail> list() {
        return order_detailService.getAllOrder_detail();
    }

    @GetMapping("/oneorderdail")
    public Order_detail oneOrderDetail(@PathVariable long id) {
        return order_detailService.getOrder_detail(id);
    }
}
