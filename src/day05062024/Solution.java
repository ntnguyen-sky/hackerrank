package day05062024;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Solution {

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        // Create Scanner to read the standard input (System.in)

        String fileName = "D:\\code\\Java\\hackerrank-git\\src\\day05062024\\input.txt";
        
//        Scanner scanner = new Scanner(System.in);
		
        Scanner scanner;
		try {
			scanner = new Scanner(new File(fileName));
			
	        // An integer lineNumber is initialized to 1 keep track of the current line number
	        int lineNumber = 1;
	        
	        // Reading Until EOF
	        // The hasNext() method returns true if there is another line of input
	        while (scanner.hasNext()){
	            String lineStr = scanner.nextLine();
	            System.out.println(lineNumber + " " + lineStr);
	            lineNumber++;
	        }
	        
	        // Close Scanner object to avoid memory leaks
	        scanner.close();
	        
		} catch (FileNotFoundException e) {
//			e.printStackTrace();
			System.err.println("File not found: " + fileName);
		}
        
	}

}
