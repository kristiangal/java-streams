package com.amigoscode.examples;


import com.amigoscode.beans.Car;
import com.amigoscode.mockdata.MockData;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.DoubleStream;

public class StatisticsWithStreams {

    @Test
    public void count() throws Exception {
        List<Car> cars = MockData.getCars();

        long numberOfCars = cars.stream().count();
        System.out.println(numberOfCars);
    }

    @Test
    public void min() throws Exception {
        List<Car> cars = MockData.getCars();
        Optional<Car> min = cars.stream().min(Comparator.comparing(Car::getPrice));
        Double price = 0.00;

        if(min.isPresent()){
            price = min.get().getPrice();
        } else{
            throw new Exception("This is an exception message.");
        }

        System.out.println(min);
        System.out.println(price);
    }

    @Test
    public void max() throws Exception {
        List<Car> cars = MockData.getCars();

        Optional<Car> max = cars.stream().max(Comparator.comparing(Car::getPrice));
        double price = 0.00;

        if(max.isPresent()){
            price = max.get().getPrice();
        } else {
            throw new Exception("This is another exception message");
        }

        System.out.println(price);
    }


    @Test
    public void average() throws Exception {
        List<Car> cars = MockData.getCars();

        double average = cars.stream().mapToDouble(Car::getPrice).average().orElse(0.00);

        System.out.println(Math.floor(average));

    }

    @Test
    public void sum() throws Exception {
        List<Car> cars = MockData.getCars();

        double sum = cars.stream().mapToDouble(Car::getPrice).sum();

        System.out.println((int)sum);
    }

    @Test
    public void statistics() throws Exception {
        List<Car> cars = MockData.getCars();
    }

}