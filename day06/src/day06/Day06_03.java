package day06;

import java.io.*;

public class Day06_03 {

	public static void main(String[] args) 
	throws IOException {
		/*
		 * 입력 받은 문자의 타입을 출력하는 프로그램 
		 * 출력 포맷 
		 * 문자 입력: m 
		 * 입력한 m은 문자입니다
		 */
		// 문자 분류 변수
		String num = "숫자";
		String eng = "문자";
		String etg = "기타 문자";
		// 프롬프트 메세지 출력
		System.out.println("하나의 문자를 입력해주세요");
		int user = System.in.read();
		if(user >= 63 && user <= 90){
			System.out.println("문자 입력:"+(char)user);
			System.out.println("입력한 "+(char)user+"은(는) "+eng+"입니다");
		}
		else if(user >= 97 && user <= 122){
			System.out.println("문자 입력:"+(char)user);
			System.out.println("입력한 "+(char)user+"은(는) "+eng+"입니다");
		}
		else if(user >= 48 && user <= 57){
			user = user-'0';
			System.out.println("문자 입력:"+user);
			System.out.println("입력한 "+user+"은(는) "+num+"입니다");
		}
		else{
			System.out.println("문자 입력:"+(char)user);
			System.out.println("입력한 "+(char)user+"은(는) "+etg+"입니다");
		}
		
	}

}
