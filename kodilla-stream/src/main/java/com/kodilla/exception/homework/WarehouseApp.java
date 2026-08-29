package com.kodilla.exception.homework;


public class WarehouseApp {


    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();

        warehouse.addOrder(new Order("1001"));
        warehouse.addOrder(new Order("1002"));
        warehouse.addOrder(new Order("1003"));

        try {
            warehouse.getOrder("9999");
        } catch (OrderDoesntExistException e) {
            System.out.println("Nie znaleziono zamówienia");
        }
    }
}