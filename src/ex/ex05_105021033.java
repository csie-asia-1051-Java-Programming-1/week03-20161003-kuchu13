package ex;
/*
 * Topic: 輸入一正整數，判斷其奇偶數。
 * Date: 2016/10/03
 * Author: 105021033 黃苡珊
 */

import java.util.Scanner;

public class ex05_105021033 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a =scn.nextInt();
		if(a%2==0){
			System.out.print("偶數");
		}else{
			System.out.print("奇數");
		}
				
	}

}
