package hw;

import java.util.Scanner;

public class hw05_105021033 {

	public static void main(String[] args) {

	    	Scanner scn = new Scanner(System.in);
	    	System.out.println("請輸入一正整數");
	    	int n = scn.nextInt();
	    	int result = 0;
	    	for(int i=1;i<=n;i++) { 
	        	result += (i*(i+1));
	        }
	        System.out.println(result);
	    }
	   
	}
			