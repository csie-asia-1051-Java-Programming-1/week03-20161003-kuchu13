package ex;
/*
 * Topic: 輸入一個字元，轉換其大小寫輸出 (大寫 ->小寫，小寫->大寫)
 * Date: 2016/10/03
 * Author: 105021033 黃苡珊
 */

import java.util.Scanner;

public class ex03_105021033 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		char ch1 = scn.next().charAt(0);
		if(ch1>=65&&ch1<=90){
			System.out.print( (char)((int)ch1+32));
		}else if(ch1>=97&&ch1<=122){
			System.out.print( (char)((int)ch1-32));
		}
			
	}

}
