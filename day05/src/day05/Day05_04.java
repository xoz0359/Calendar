package day05;

import java.io.*;

public class Day05_04 {

	public static void main(String[] args) 
	
			throws IOException{
		//프롬프트 메세지
		System.out.println("첫 번째 수");
		int num1=System.in.read()-48;
		System.in.skip(2);
		System.out.println("두 번째 수");
		int num2=System.in.read()-'0';//오 이렇게도 구현 되네
		
		if(num2==0) {
			System.out.println("자연수는 0으로 나눌 수 없습니다!");
			System.exit(num2);
		}
		//프로그램이 종료될 때 0을 반환하는 행위는 JVM에게 프로그램의 정상종료를 알린다

		
		System.out.println(num1+"/"+num2+"="+num1/num2);
		//자연수를 0으로 나누면 무한대를 반환한다 이를 방지하기 위해 프로그램 언어는 오류를 제시한다

	}

}
