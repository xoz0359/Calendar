package day06;

import java.io.*;

public class Day06_02 {

	public static void main(String[] args)
	throws IOException {
		// 사용자에게 문자 하나를 입력 받아 해당하는 단어를 출력하는 프로그램 작성
		// 입력 포맷 f,F(Father) m,M(Mather) b,B(Brother) s,S(Sisther)
		// 출력 포맷
		/*
		 * 문자입력 ()
		 */
		// 프롬프트 메세지
		System.out.println("다음 알파벳 중 하나를 골라 입력해주세요");
		System.out.println("f, m, b, s");
		int eng = System.in.read();
		
		if (eng == 'f'||eng == 'F') {
			System.out.println("문자 입력: "+(char)eng);
			System.out.println("Father");
		}
		else if (eng == 'm'||eng == 'M') {
			System.out.println("문자 입력: "+(char)eng);
			System.out.println("Mather");
		}
		else if (eng == 'b'||eng == 'B') {
			System.out.println("문자 입력: "+(char)eng);
			System.out.println("Brother");
		}
		else if (eng == 's'||eng == 'S') {
			System.out.println("문자 입력: "+(char)eng);
			System.out.println("Sister");
		}
		else {
			System.out.println("잘못입력하셨어요!");
		}
	}

}
