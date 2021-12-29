package curs6;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {

		int i;
		int sum = 0;
		int array[] = new int[10];

		System.out.println("Introdu 10 numere: ");

		Scanner sc = new Scanner(System.in);

		for (i = 0; i < 10; ++i)
			array[i] = sc.nextInt();

		for (i = 0; i < 10; ++i)
			sum = sum + array[i];

		System.out.println("Suma numerelor din array este: " + sum);
	}
}
