package hw;

import java.util.Scanner;

public class hw02_105021033 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int a = 0 ;
		int b = 0 ;
		int c = 0 ;
		System.out.print("請問要輸入幾個數:");
		int d = scn.nextInt();
		System.out.print("請輸入"+d+"個數:");
		for(int i = 0;i<d;i++){
			int n = scn.nextInt();
			if(n>0)
				a++;
			else if(n<0)
				c++;
			else
				b++;
			}
			scn.close();
				System.out.println("正數"+a+"個，負數"+c+"個，零"+b+"個");
			}
		}



