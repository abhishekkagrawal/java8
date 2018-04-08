package com.capgemini.jfs;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class FirstPredicate {

    public static void main(String[] args) {
	Stream<String> stream = Stream.of("one", "two", "three", "four", "five");
	Predicate<String> p1 = s -> s.length() >= 5;
	Predicate<String> p2 = Predicate.isEqual("two");
	Predicate<String> p3 = Predicate.isEqual("four");
	stream.filter(p1.or(p2).and(p3)).forEach(s -> System.out.println("Stream:" + s));
	//stream has already been operated upon or closed
	//stream can not hold any data
	//Stream can be used only once, so commented below line
	//stream.forEach(System.out::println);

    }

}
