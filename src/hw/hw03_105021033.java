package hw;

import java.util.Scanner;

public class hw03_105021033 {

	public static void main(String[] args) {
    	Scanner scn = new Scanner(System.in);
    	System.out.println("請輸入一整數");
    	int n = scn.nextInt();
    	int result = 1;
        for (int i = n;i>0;i--) { 
        	result = result * i;
        }
        System.out.println("結果:"+result);
    }
   
}

