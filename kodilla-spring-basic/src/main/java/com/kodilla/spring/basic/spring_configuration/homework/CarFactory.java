package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;
import java.time.LocalDate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CarFactory {

    @Bean
    public Car chooseCar() {
        int month = LocalDate.now().getMonthValue();
        int hour = LocalTime.now().getHour();

        return chooseCar(month, hour);
    }


    Car chooseCar(int month, int hour) {
        boolean headlightsTurnedOn = hour >= 20 || hour < 6;

        if (month >= 6 && month <= 8) {
            return new Cabrio(headlightsTurnedOn);
        }

        if (month == 12 || month <= 2) {
            return new SUV(headlightsTurnedOn);
        }

        return new Sedan(headlightsTurnedOn);
    }
}