package ex;
/*
 * Topic: 讓使用者輸入x，並計算y值輸出，其公式如下：
 * y = 3*x2				若 x < -1
 * y = x3+3*x-3			若 -1 <= x <= 1
 * y = 2*x+3			若 x > 1
 * Date: 2016/10/03
 * Author: 105021033 黃苡珊
 */

import java.util.Scanner;

public class ex06_105021033 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int x =scn.nextInt();
		if(x<-1){
			System.out.print(3*x*x);
		}else if(-1<=x&&x<=1){
			System.out.print(x*x*x+3*x-3);
		}else{
			System.out.print(2*x+3);
		}
	}
}
