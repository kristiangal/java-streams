package com.amigoscode.examples;

import com.amigoscode.beans.Person;
import com.amigoscode.mockdata.MockData;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class GettingStarted {

    @Test
    public void imperativeApproach() throws IOException {
        // 1. Find people aged less or equal 18
        // 2. Then change implementation to find first 10 people

        List<Person> people = MockData.getPeople();
        List<Person> peopleWithAgeLessThanEighteen = new ArrayList<>();
        int counter = 0;
        final int limit = 10;

        for (Person person : people) {
            if(person.getAge() <= 18) {
                peopleWithAgeLessThanEighteen.add(person);
                counter++;
            }
            if(counter == limit){
                break;
            }
        }
        peopleWithAgeLessThanEighteen.forEach(System.out::println);
    }

    @Test
    public void declarativeApproachUsingStreams() throws Exception {
        List<Person> people = MockData.getPeople();

        //        * 1. task

        List<Person> peopleWithAgeLessThanEighteen = people.stream()
                .filter(person -> person.getAge() <= 18)
                .toList();

//        * 2. task

        List<Person> firstTenPeople = people
                .stream()
                .filter(person -> person.getAge() <= 18)
                .limit(10)
                .toList();
        firstTenPeople.forEach(System.out::println);
    }
}
