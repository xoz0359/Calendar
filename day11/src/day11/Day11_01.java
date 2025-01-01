package day11;

import java.io.*;

public class Day11_01 {

	public static void main(String[] args) 
	throws IOException{
		/*
		 * 사용자로부터 5개의 정수를 입력받아 우선 입력 받은 데이터를 출력하고, 입력 받은 데이터를 내림차순정렬하여 다시 출력하시오 출력결과 1번
		 * 정수:50 2번 정수:50 . . . <입력받은 데이터 \t로 구분하여 정렬>
		 * ---------------------------------- <내림차순 정렬 출력> 사용할 알고리즘 선택정렬 선택 정렬의 특징 1. 주
		 * 선택자와 비교 선택자가 존재 2. 주 선택자는 처음부터 시작부터 시작하고 비교 선택자는 주 선택자 다음으로 부터 출발을 한다 3. 주
		 * 선택자는 고정상태에서 비교 선택자가 하나씩 비교하며 이동한다라는 특징을 가진다 4. 비교 선택자가 마지막까지 이동하면 주선택자가 다음으로
		 * 이동한다
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("정렬할 정수를 입력해주세요");
		int input[];
		input = new int[5];
		for (int i = 0; i < input.length; i++) {
			System.out.println((i + 1) + "번 정수:");
			input[i] = Integer.parseInt(br.readLine());
		}
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + "\t");
		}
		System.out.println("\n---------------------------------");
		
		// 비즈니스 로직
		int temp;
		for (int j = 0; j < input.length - 1; j++) { // 마지막 루프에서는 이전 루프에 이미 정렬이 완료된 상태이다
			for (int i = j + 1; i < input.length; i++) {//2. 주 선택자는 처음부터 시작부터 시작하고 비교 선택자는 주 선택자 다음으로 부터 출발을 한다
				if (input[j] < input[i]) {
					temp = input[j];
					input[j] = input[i];
					input[i] = temp;
				}
			}
		}

		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + "\t");
		}
		
	}
}

