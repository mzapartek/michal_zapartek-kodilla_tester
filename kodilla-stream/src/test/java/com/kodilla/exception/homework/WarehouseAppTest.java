package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTest {

    @Test
    public void testGetOrder() throws OrderDoesntExistException {
        // given
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("1001"));
        warehouse.addOrder(new Order("1002"));

        // when
        Order result = warehouse.getOrder("1002");

        // then
        assertEquals("1002", result.getNumber());
    }

    @Test
    public void testGetOrderThrowsExceptionWhenOrderDoesNotExist() {
        // given
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("1001"));

        // then
        assertThrows(
                OrderDoesntExistException.class,
                () -> warehouse.getOrder("9999")
        );
    }
}
