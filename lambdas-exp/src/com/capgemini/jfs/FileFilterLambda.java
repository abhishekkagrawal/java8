package com.capgemini.jfs;

import java.io.File;
import java.io.FileFilter;
import java.util.List;
import java.util.function.Predicate;

public class FileFilterLambda {
    public static boolean checkList(List list, Predicate<List> p) {
	return p.test(list);
    }

    public static void main(String[] args) {

	//	FileFilter fileFilter = new FileFilter() {
	//
	//	    @Override
	//	    public boolean accept(File file) {
	//		return file.getName().endsWith(".java");
	//	    }
	//	};

	//FileFilter ffLambda = (File file) -> file.getName().endsWith(".java");
	FileFilter ffLambda = file -> file.getName().endsWith(".java");
	File dir = new File("D:\\projects\\crs\\crs_restructured\\crs-services\\authentication\\code\\src\\java\\com\\cibil\\crs\\authentication\\beans");
	File[] javaFiles = dir.listFiles(ffLambda);
	for (File file : javaFiles) {
	    System.out.println(file.getName());
	}

	//	boolean b = checkList(new ArrayList(), ArrayList a1 -> a1.isEmpty());
	//	System.out.println(b);
	//	b = checkList(new ArrayList(), ArrayList a1 -> a1.isEmpty());
	//	System.out.println(b);
	//	b = checkList(new ArrayList(), ArrayList a1 -> a1.isEmpty());
	//	System.out.println(b);
	//	b = checkList(new ArrayList(), ArrayList a1 -> a1.isEmpty());
	System.out.println(1 % 2);
    }
}
