package day;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Solutionx {

	public static void main(String[] args) {
		try {
			 Scanner scanner = new Scanner(System.in);
		        double payment = scanner.nextDouble();
		        scanner.close();

		        // Write your code here.
		        // covert
		        System.out.println(payment);
		        String us = String.valueOf(payment);
		       us = NumberFormat.getCurrencyInstance().format(payment + "$");
		        
		        System.out.println("US: " + us);
		    //     System.out.println("India: " + india);
		    //     System.out.println("China: " + china);
		    //     System.out.println("France: " + france);
		} catch (Exception e) {
			e.printStackTrace();
		}
       
    }

}
