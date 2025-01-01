package day10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day10_07 {

	public static void main(String[] args) 
	throws IOException{
		// 사용자의 입력 횟수에 따라 인덱스 값 지정하시오
		int sum=0;
		double avg = 0.0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("총 몇 명의 시험점수를 입력하시겠습니까?");
		int num = Integer.parseInt(br.readLine());
		System.out.println("시험점수를 정수로 입력하세요");
		int score[] = new int[num];
		for (int i = 0;i<score.length;i++) {
				System.out.print((i+1)+"번 시험점수:");
			score[i] = Integer.parseInt(br.readLine());
			sum += score[i];
		}
			avg = sum/score.length;
			
			System.out.println("총점:"+sum+"점");
			System.out.println("평균:"+avg+"점");
			
	}
}