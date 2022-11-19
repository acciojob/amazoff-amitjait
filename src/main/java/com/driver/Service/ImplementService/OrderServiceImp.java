package com.driver.Service.ImplementService;


import com.driver.Order;
import com.driver.Repository.OrderRepo;
import com.driver.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImp implements OrderService {

    @Autowired
    OrderRepo orderRepo;

    @Override
    public Order addOrder(Order order) {
        order = orderRepo.addOrder(order);

        return order;
    }

    @Override
    public Order getOrderById(String id) {
        return orderRepo.getOrder(id);
    }

    @Override
    public List<String> getAllOrders() {
        List<String> list = orderRepo.getAllOrders();
        return list;
    }

    @Override
    public void deleteOrderById(String orderId) {
        orderRepo.deleteOrderById(orderId);
    }
}
