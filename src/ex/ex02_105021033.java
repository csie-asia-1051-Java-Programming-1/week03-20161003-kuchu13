package ex;
/*
 * Topic: 輸入一個字元，判斷是大寫或小寫或是其他字元。
 * Date: 2016/10/03
 * Author: 105021033 黃苡珊
 */

import java.util.Scanner;

public class ex02_105021033 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		char ch1 = scn.next().charAt(0);
		
		if(ch1>=65&&ch1<=90){
			System.out.print("大寫");
		}else if(ch1>=97&&ch1<=122){
			System.out.print("小寫");
			}else{
				System.out.print("其他字元");
			}
		}
	}

