package com.capgemini.jfs;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class IntermediaryAndFinal {

    public static void main(String[] args) {
	Stream<String> stream = Stream.of("one", "two", "three", "four", "five");
	Predicate<String> p1 = Predicate.isEqual("two");
	Predicate<String> p2 = Predicate.isEqual("four");

	List<String> list = new ArrayList<>();
	//Only Intermediary operation, no Final Operation 
	stream.peek(System.out::println).filter(p1.or(p2)).peek(list::add);
	System.out.println("Done!");
	System.out.println("Size of List:" + list.size());
	//Intermediary operation and then Final Operation
	Stream<String> s2 = Stream.of("one", "two", "three", "four", "five");
	s2.peek(System.out::println).filter(p1.or(p2)).forEach(list::add);
	//stream.filter(p1.or(p2)).peek(System.out::println).forEach(s -> System.out.println("Stream:" + s));
	System.out.println("Done!");
	System.out.println("Size of List:" + list.size());

	//stream.filter(e -> e.length() > 3).peek(e -> System.out.println("Filtered value: " + e));//.map(String::toUpperCase).peek(e -> System.out.println("Mapped value: " + e)).collect(Collectors.toList());

    }

}
