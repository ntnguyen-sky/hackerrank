package test;

import java.util.Scanner;

public class Multiples {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
//        int N = scanner.nextInt();
		int N = 20;
        scanner.close();

        for (int i = 1; i <= 10; i++) {
            int result = N * i;
            System.out.println(N + " x " + i + " = " + result);
        }
	}

}
