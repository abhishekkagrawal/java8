package com.capgemini.jfs;

import java.io.File;
import java.io.FileFilter;

public class JavaFileFilter implements FileFilter {

    public static void main(String[] args) {
	JavaFileFilter jff = new JavaFileFilter();
	File dir = new File("D:\\projects\\crs\\crs_restructured\\crs-services\\authentication\\code\\src\\java\\com\\cibil\\crs\\authentication\\beans");
	File[] javaFiles = dir.listFiles(jff);
	for (File file : javaFiles) {
	    System.out.println(file.getName());
	}

    }

    @Override
    public boolean accept(File file) {
	return file.getName().endsWith(".java");
    }

}
