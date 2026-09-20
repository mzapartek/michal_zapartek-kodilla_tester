package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class WeatherAlertServiceTestSuite {

    private WeatherAlertService service = new WeatherAlertService();

    private Client client = Mockito.mock(Client.class);
    private Client secondClient = Mockito.mock(Client.class);
    private Client thirdClient = Mockito.mock(Client.class);

    private Notification notification = Mockito.mock(Notification.class);

    @Test
    public void subscribedClientShouldReceiveNotification() {
        service.addSubscriber("Bialystok", client);

        service.sendNotificationToLocation("Bialystok", notification);

        Mockito.verify(client, Mockito.times(1)).receive(notification);
    }

    @Test
    public void notSubscribedClientShouldNotReceiveNotification() {
        service.sendNotificationToLocation("Bialystok", notification);

        Mockito.verify(client, Mockito.never()).receive(notification);
    }

    @Test
    public void notificationShouldBeSentToAllClientsInLocation() {
        service.addSubscriber("Bialystok", client);
        service.addSubscriber("Bialystok", secondClient);
        service.addSubscriber("Bialystok", thirdClient);

        service.sendNotificationToLocation("Bialystok", notification);

        Mockito.verify(client).receive(notification);
        Mockito.verify(secondClient).receive(notification);
        Mockito.verify(thirdClient).receive(notification);
    }

    @Test
    public void unsubscribedClientShouldNotReceiveNotificationFromLocation() {
        service.addSubscriber("Bialystok", client);
        service.removeSubscriber("Bialystok", client);

        service.sendNotificationToLocation("Bialystok", notification);

        Mockito.verify(client, Mockito.never()).receive(notification);
    }

    @Test
    public void clientRemovedFromAllLocationsShouldNotReceiveNotifications() {
        service.addSubscriber("Bialystok", client);
        service.addSubscriber("Warszawa", client);

        service.removeSubscriberFromAllLocations(client);

        service.sendNotificationToLocation("Bialystok", notification);
        service.sendNotificationToLocation("Warszawa", notification);

        Mockito.verify(client, Mockito.never()).receive(notification);
    }

    @Test
    public void notificationShouldBeSentOnlyToSelectedLocation() {
        service.addSubscriber("Bialystok", client);
        service.addSubscriber("Warszawa", secondClient);

        service.sendNotificationToLocation("Bialystok", notification);

        Mockito.verify(client).receive(notification);
        Mockito.verify(secondClient, Mockito.never()).receive(notification);
    }

    @Test
    public void notificationShouldBeSentToAllClients() {
        service.addSubscriber("Bialystok", client);
        service.addSubscriber("Warszawa", secondClient);
        service.addSubscriber("Krakow", thirdClient);

        service.sendNotificationToAll(notification);

        Mockito.verify(client).receive(notification);
        Mockito.verify(secondClient).receive(notification);
        Mockito.verify(thirdClient).receive(notification);
    }

    @Test
    public void removedLocationShouldNotReceiveNotifications() {
        service.addSubscriber("Bialystok", client);
        service.addSubscriber("Bialystok", secondClient);

        service.removeLocation("Bialystok");

        service.sendNotificationToLocation("Bialystok", notification);

        Mockito.verify(client, Mockito.never()).receive(notification);
        Mockito.verify(secondClient, Mockito.never()).receive(notification);
    }
}