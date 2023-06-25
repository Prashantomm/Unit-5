package com.masai.p3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {
	public static void main(String[] args) {
        PrintList printList = (List<String> city) -> {
            Consumer<String> cityConsumer = (String cityName) -> System.out.println(cityName);
            city.forEach(cityConsumer);
        };

        List<String> cities = Arrays.asList("Delhi", "Lucknow", "Pune", "Bangaluru", "Mumbai");
        printList.display(cities);
    }

}
