package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ShippingCenterTestSuite {

    @Autowired
    private ShippingCenter shippingCenter;

@Test
public void shouldDeliverPackage() {
    String result = shippingCenter.sendPackage("Hill Street 11, New York", 18.2);

    assertEquals("Package delivered to: Hill Street 11, New York", result);
}
    @Test
    public void shouldNotDeliverTooHeavyPackage () {
        String result = shippingCenter.sendPackage("Hill Street 11, New York", 35.0);

        assertEquals("Package not delivered to: Hill Street 11, New York", result);
    }
}