package com.driver.Service.ImplementService;

import com.driver.DeliveryPartner;
import com.driver.Repository.OrderRepo;
import com.driver.Service.PartnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PartnerServiceImp implements PartnerService {
    @Autowired
    OrderRepo orderRepo;

    @Override
    public DeliveryPartner addPartner(String partnerId) {

        DeliveryPartner deliveryPartner = orderRepo.addPartner(partnerId);

        return deliveryPartner;
    }

    @Override
    public DeliveryPartner getPartnerById(String id) {
        DeliveryPartner deliveryPartner = orderRepo.getPartner(id);
        return deliveryPartner;
    }

    @Override
    public void deletePartnerById(String partnerId) {
        orderRepo.deletePartnerBYId(partnerId);
    }
}
