package com.sudano.namecheck.utils;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
	
	public static String readFile(String pathname) throws IOException {

	    File file = new File(pathname);
	    StringBuilder fileContents = new StringBuilder((int)file.length());        

	    try (Scanner scanner = new Scanner(file)) {
	        while(scanner.hasNextLine()) {
	            fileContents.append(scanner.nextLine() + System.lineSeparator());
	        }
	        return fileContents.toString();
	    }
	}

}
