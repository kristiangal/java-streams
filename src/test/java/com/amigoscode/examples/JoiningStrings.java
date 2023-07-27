package com.amigoscode.examples;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoiningStrings {

    @Test
    public void joiningStrings() throws Exception {
        List<String> names = List.of("anna", "john", "marcos", "helena", "yasmin");
        // "Anna, John, Marcos, Helena, Yasmin"
        String myString = "";
        String stringWithoutEndingComma = "";

        for (String name : names) {
            name = name.substring(0,1).toUpperCase() + name.substring(1);
            myString = myString.concat(name) + ", ";
            stringWithoutEndingComma = myString.substring(0, myString.length() - 2);
        }
        System.out.println(stringWithoutEndingComma);
    }

    @Test
    public void joiningStringsWithStream() throws Exception {
        List<String> names = List.of("anna", "john", "marcos", "helena", "yasmin");
        // "Anna, John, Marcos, Helena, Yasmin"

        String collect = names
                .stream()
                .map(name -> name.substring(0,1).toUpperCase() + name.substring(1) + ", ")
                .collect(Collectors.joining());

        System.out.println(collect.substring(0,collect.length() - 2));
    }
}
