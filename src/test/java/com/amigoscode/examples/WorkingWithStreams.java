package com.amigoscode.examples;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WorkingWithStreams {

    @Test
    @Disabled
    void steams() {
        List<String> names = List.of("Amigoscode", "Alex", "Zara");

//        Create a stream from a list
        Stream<String> stream = names.stream();
        
        String[] nameArr = {};
//        Create a stream from an array
        Stream<String> stringStream = Arrays.stream(nameArr).filter(null);


    }
}
