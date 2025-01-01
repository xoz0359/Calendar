package day11;

import java.io.*;

public class Day11_05 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("정수를 입력하세요");
		int arr[][] = new int[3][3];
		for (int j = 0; j < arr.length; j++) {
			for (int i = 0; i < arr[j].length-1; i++) {							
				System.out.println((j+1) + "번째 " + (i+1) + "번째 수:");
				arr[j][i] = Integer.parseInt(br.readLine());
				arr[j][2] += arr[j][i];
			}
		}

		for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[j][0] + "+" + arr[j][1] + "=" + arr[j][2]);
		}

		
		// 사용자로부터 두 수를 입력 받아 더하는 프로그램
		// 위 행위를 3번 반복

	}

}
