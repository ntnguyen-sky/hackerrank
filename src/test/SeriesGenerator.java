package test;

import java.util.Scanner;

public class SeriesGenerator {
	
	private static void generateAndPrintSeries(int a, int b, int n) {
		// Starting value of the series
		int currenTerm = a;
		
		// Calculate and print each term in the series
		for (int i = 0; i < n ; i++) {
			currenTerm += Math.pow(2, i) * b;
			System.out.print(currenTerm + " ");
		}
		// Print a newline after the series
		System.out.println();
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            generateAndPrintSeries(a, b, n);
        }
        
        in.close();
	}

}
