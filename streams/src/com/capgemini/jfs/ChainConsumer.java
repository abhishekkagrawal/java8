package com.capgemini.jfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ChainConsumer {

    public static void main(String[] args) {
	List<String> list = Arrays.asList("one", "two", "three", "four", "five");

	List<String> result = new ArrayList<>();

	Stream<String> stream = list.stream();
	stream.forEach(str -> System.out.println("Stream:" + str));

	Consumer<String> c1 = list::add;
	Consumer<String> c2 = System.out::println;
	Consumer<String> c3 = c1.andThen(c2);
	System.out.println("-----------------");
	Consumer<String> conResult = result::add;
	result.stream().forEach(c1.andThen(c2).andThen(conResult));
	System.out.println(result.size());

    }

}
