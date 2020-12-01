package com.sudano.namecheck.utils;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void writeFile(String text, String filename) {
        try {
            FileWriter writer = new FileWriter(filename + ".txt", true);
				writer.write(text + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
}
