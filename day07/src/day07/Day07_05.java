package day07;

import java.io.*;

public class Day07_05 {
	public static void main(String[] args) 
	throws IOException{
		// 사용자로부터 단 하나를 입력 받아 해당하는 단의 구구단을 출력하는 프로그램 작성
		System.out.println("정수 하나를 입력해주세요");
		
		int input = System.in.read()-'0';
		System.out.println("단 입력:"+input);
		int mul = 0;
		
		for(int i=1;i<=9;i++) {
			mul = input*i;
			System.out.println(input+"x"+i+"="+mul);
		}

	}

}
