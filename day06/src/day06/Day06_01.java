package day06;

import java.io.*;

public class Day06_01 {

	public static void main(String[] args) 
	throws IOException{
		//안 보고 다중 if문 만들어보기
		// 다 하고 할 것
		// 예제
		// 두 정수 A, B가 주어졌을 때 두 수를 비교하는 프로그램을 만들어보자
		/*
		 * 첫째 줄에 다음 세 가지 중 하나를 출력한다. 
		 * A가 B보다 큰 경우에는 '>'를 출력한다. 
		 * A가 B보다 작은 경우에는 '<'를 출력한다. 
		 * A와 B가 같은 경우에는 '=='를 출력한다.
		 */

		int A = System.in.read()-48;
		System.out.println(A);
		int B = System.in.read()-'0';
		System.out.println((char)B);
		int C = System.in.read()-'0';
		System.out.println((char)C);
		int D = System.in.read()-'0';
		System.out.println(D);
		if (A<B) {
			System.out.println('<');
		}else if (A>B) {
			System.out.println('>');
		}else if (A==B) {
			System.out.println("==");
		}
		else {
		}
		
		
		
		
	}
}
