package day10;

import java.io.*;

public class Day10_05 {

	public static void main(String[] args) 
	throws IOException{
		// 사용자로부터 6개의 시험점수를 입력받아 단순하게 출력하는 프로그램 작성
		// 출력결과 1번 시험점수 90, 2번 시험점수 .. 6번 시험 점수 70
		// 입력 데이터를 순서대로 출력하기
		System.out.println("시험점수를 정수로 입력하세요");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int score[] = new int[6];
		for (int i = 0;i<score.length;i++) {
				System.out.print((i+1)+"번 시험점수:");
			score[i] = Integer.parseInt(br.readLine());
		}
		for (int j=0;j<score.length;j++) {
			System.out.print(score[j]+"\t");
		}
	}

}
