package hw;

import java.util.Scanner;

public class hw04_105021033 {

	public static void main(String[] args) {
	
			    	Scanner scn = new Scanner(System.in);
			    	System.out.println("�п�J�@���");
			    	int n = scn.nextInt();
			    	int result = 1;
			    	
			        while(n>0) { 
			        	result = result * n;
			        	n--;
			        }
			        System.out.println("���G:"+result);
			    }
			   
			}