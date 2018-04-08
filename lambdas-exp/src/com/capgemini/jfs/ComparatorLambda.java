package com.capgemini.jfs;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorLambda {

    public static void main(String[] args) {
	Comparator<String> comp = new Comparator<String>() {

	    @Override
	    public int compare(String str1, String str2) {
		// TODO Auto-generated method stub
		return Integer.compare(str1.length(), str2.length());
	    }
	};

	//	Comparator<String> compLamdba = (String str1, String str2) -> Integer.compare(str1.length(), str2.length());
	// Class objectName = (Block of parameters) -> {Block of implementation};
	Comparator<String> compLamdba = (str1, str2) -> Integer.compare(str1.length(), str2.length());
	List<String> list = Arrays.asList("*****", "**", "****", "*", "***");
	Collections.sort(list, compLamdba);
	//Method Reference
	list.forEach(System.out::println);
	//	for (String string : list) {
	//	    System.out.println(string);
	//	}

    }

}
