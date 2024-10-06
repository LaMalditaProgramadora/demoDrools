package com.lmp.demoDrools.service;

import com.lmp.demoDrools.config.DroolsBeanFactory;
import com.lmp.demoDrools.model.Customer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    DroolsBeanFactory droolsBeanFactory;

    public Customer applyCategoryToCustomer(Customer customer) {
        KieSession kieSession = droolsBeanFactory.getKieSession();
        try {
            kieSession.insert(customer);
            kieSession.fireAllRules();
        } finally {
            kieSession.dispose();
        }
        System.out.println(customer);
        return customer;
    }
}
