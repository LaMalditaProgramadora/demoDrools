package com.lmp.demoDrools;

import com.lmp.demoDrools.model.Customer;
import com.lmp.demoDrools.service.CustomerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemoDroolsApplicationTests {

    @Autowired
    CustomerService customerService;

    @Test
    public void whenCustomer_ThenApplyVIPCategory() {
        Customer customer = new Customer("1234", "Jimena Ruiz", 25, 12000);
        customerService.applyCategoryToCustomer(customer);
        assertEquals("VIP", customer.getCategory());
    }

    @Test
    public void whenCustomer_ThenApplyRegularCategory() {
        Customer customer = new Customer("1234", "Jimena Ruiz", 18, 3500);
        customerService.applyCategoryToCustomer(customer);
        assertEquals("Regular", customer.getCategory());
    }

    @Test
    public void whenCustomer_ThenApplyOccasionalCategory() {
        Customer customer = new Customer("1234", "Jimena Ruiz", 8, 1000);
        customerService.applyCategoryToCustomer(customer);
        assertEquals("Occasional", customer.getCategory());
    }
}
