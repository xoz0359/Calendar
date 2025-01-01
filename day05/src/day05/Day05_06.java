package day05;

import java.io.*;
public class Day05_06 {

	public static void main(String[] args) 
	throws IOException{
		// 하나의 값을 입력받은 후 짝수인지 홀수인지 판단하는 프로그램을 작성하시오
		// 입력값은 0~9
		// 프롬프트메세지 전송하고 입력값 받기
		System.out.println("정수를 입력해주세요");
		int num = System.in.read()-'0';
		System.in.skip(2);
		
		// num이 홀수인지 짝수인지 구분하기
		if(num%2==0) {
			System.out.println("짝수입니다");
		}

		else {
			System.out.println("홀수입니다");
		}
		
		

	}

}
