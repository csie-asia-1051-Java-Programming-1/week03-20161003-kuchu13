package hw;

import java.util.Scanner;

public class hw04_105021033 {

	public static void main(String[] args) {
	
			    	Scanner scn = new Scanner(System.in);
			    	System.out.println("請輸入一整數");
			    	int n = scn.nextInt();
			    	int result = 1;
			    	
			        while(n>0) { 
			        	result = result * n;
			        	n--;
			        }
			        System.out.println("結果:"+result);
			    }
			   
			}