package com.driver.Service.ImplementService;

import com.driver.Repository.OrderRepo;
import com.driver.Service.OrderPartnerPair;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderPartnerPairImp implements OrderPartnerPair {

    @Autowired
    OrderRepo orderRepo;

    @Override
    public void addOrderPartnerPair(String orderId, String partnerId) {
        orderRepo.addOrderPartnerPair(orderId, partnerId);
    }

    @Override
    public Integer getOrderCountByPartnerId(String partnerId) {
        Integer count = orderRepo.getOrderCountBYPartnerId(partnerId);
        return count;
    }

    @Override
    public List<String> getOrdersByPartnerId(String partnerId) {
        List<String> orderList= orderRepo.getOrdersByPartnerId(partnerId);
        return orderList;
    }

    @Override
    public Integer getCountOfUnassignedOrders() {
        Integer count = orderRepo.unassignedOrders();
        return count;
    }

    @Override
    public Integer getOrdersLeftAfterGivenTimeByPartnerId(String time, String partnerId) {
        Integer count =  orderRepo.getOrdersLeftAfterGivenTimeBYPartnerID(time, partnerId);
        return count;
    }

    @Override
    public String getLastDeliveryTimeByPartnerId(String partnerId) {
        String lastTime = orderRepo.getLastDeliveryTimeByPartner(partnerId);
        return lastTime;
    }
}
