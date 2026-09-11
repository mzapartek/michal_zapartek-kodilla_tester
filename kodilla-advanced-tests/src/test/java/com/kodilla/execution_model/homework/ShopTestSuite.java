package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShopTestSuite {

    private Shop shop;
    private Order order1;
    private Order order2;
    private Order order3;

    @BeforeEach
    public void setUp() {
        shop = new Shop();

        order1 = new Order(100.0, LocalDate.of(2026, 1, 10), "user1");
        order2 = new Order(200.0, LocalDate.of(2026, 2, 15), "user2");
        order3 = new Order(300.0, LocalDate.of(2026, 3, 20), "user3");

        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
    }

    @Test
    public void shouldReturnNumberOfOrders() {
        assertEquals(3, shop.getOrdersCount());
    }

    @Test
    public void shouldReturnTotalValueOfOrders() {
        assertEquals(600.0, shop.getTotalValue(), 0.01);
    }

    @Test
    public void shouldReturnOrdersFromDateRange() {
        Set<Order> result = shop.getOrders(
                LocalDate.of(2026, 2, 1),
                LocalDate.of(2026, 3, 1)
        );

        assertEquals(1, result.size());
    }

    @Test
    public void shouldReturnOrdersFromValueRange() {
        Set<Order> result = shop.getOrders(150.0, 250.0);

        assertEquals(1, result.size());
    }

    @Test
    public void shouldNotAddDuplicateOrder() {
        shop.addOrder(order1);

        assertEquals(3, shop.getOrdersCount());
    }

    @Test
    public void shouldReturnZeroForEmptyShop() {
        Shop emptyShop = new Shop();

        assertEquals(0, emptyShop.getOrdersCount());
        assertEquals(0.0, emptyShop.getTotalValue(), 0.01);
    }
}