package hw;

import java.util.Scanner;

public class hw01_105021033 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
    	System.out.println("請輸入一個正整數值(不含 0)");
		long a = scn.nextLong();
		int b = 0;
		while (a > 0) {
			b++;
			a = a / 10;
		}
		System.out.println("此數為"+b+"位數");
	}
}