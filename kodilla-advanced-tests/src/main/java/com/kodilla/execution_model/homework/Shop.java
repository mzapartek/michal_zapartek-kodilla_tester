package com.kodilla.execution_model.homework;

import java.util.HashSet;
import java.util.Set;
import java.time.LocalDate;
import java.util.stream.Collectors;

public class Shop {

    private Set<Order> orders = new HashSet<>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public Set<Order> getOrders(LocalDate from, LocalDate to) {
        return orders.stream()
                .filter(order -> !order.getDate().isBefore(from))
                .filter(order -> !order.getDate().isAfter(to))
                .collect(Collectors.toSet());
    }

    public Set<Order> getOrders(double minValue, double maxValue) {
        return orders.stream()
                .filter(order -> order.getValue() >= minValue)
                .filter(order -> order.getValue() <= maxValue)
                .collect(Collectors.toSet());
    }

    public int getOrdersCount() {
        return orders.size();
    }

    public double getTotalValue() {
        return orders.stream()
                .mapToDouble(Order::getValue)
                .sum();
    }
}

