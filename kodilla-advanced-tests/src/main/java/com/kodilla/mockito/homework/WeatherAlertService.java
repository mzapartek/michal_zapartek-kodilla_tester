package com.kodilla.mockito.homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WeatherAlertService {
    private Map<String, Set<Client>> subscribers = new HashMap<>();

    public void addSubscriber(String location, Client client) {
        subscribers
                .computeIfAbsent(location, key -> new HashSet<>())
                .add(client);
    }

    public void removeSubscriber(String location, Client client) {
        Set<Client> clients = subscribers.get(location);

        if (clients != null) {
            clients.remove(client);
        }
    }

    public void removeSubscriberFromAllLocations(Client client) {
        subscribers.values()
                .forEach(clients -> clients.remove(client));
    }

    public void sendNotificationToLocation(String location, Notification notification) {
        Set<Client> clients = subscribers.get(location);

        if (clients != null) {
            clients.forEach(client -> client.receive(notification));
        }
    }

    public void sendNotificationToAll(Notification notification) {
        Set<Client> allClients = new HashSet<>();

        subscribers.values()
                .forEach(allClients::addAll);

        allClients.forEach(client -> client.receive(notification));
    }

    public void removeLocation(String location) {
        subscribers.remove(location);
    }
}