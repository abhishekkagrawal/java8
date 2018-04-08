package com.capgemini.jfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ChainConsumers {

    public static void main(String[] args) {
	List<String> list = Arrays.asList("one", "two", "three", "four", "five");

	List<String> result = new ArrayList<>();

	Consumer<String> con = System.out::println;
	list.forEach(con);
	System.out.println("-----------------");
	Consumer<String> conResult = result::add;
	list.forEach(con.andThen(conResult));
	System.out.println(result.size());

    }

}
