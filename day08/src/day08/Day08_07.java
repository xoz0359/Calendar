package day08;

import java.io.*;

public class Day08_07 {

	public static void main(String[] args)
	throws IOException{
		// 사용자로부터 값을 입력받아 출력하는 프로그램
		System.out.println("==숫자 입력 확인 프로그램==");
		
		// 프롬프트 메세지
		System.out.println("숫자입력:");
		int input=0;
		do{
			input=System.in.read();
			System.in.skip(2);
			System.out.println("입력한 문자:"+(char)input);
		}
		while(!(input>=48 && input<=57));
		
		if(input=='0') {
			System.out.println("프로그램을 종료합니다");
			System.exit(0);
		}
		System.out.println("입력한 숫자:"+(char)input);
		}
	}

