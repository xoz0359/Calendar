package day07;

import java.io.*;

public class Day07_02 {

	public static void main(String[] args)
	throws IOException{
		// 사용자로부터 국어, 영어, 수학 점수를 입력받아 총점과 평균을 출력하시오
		// 그리고 평균에 따른 등급을 출력하시오
		// 프롬프트 메세지 출력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("국어 점수를 입력해주세요");
		int kor_score = Integer.parseInt(br.readLine());
		System.out.println("영어 점수를 입력해주세요");
		int eng_score = Integer.parseInt(br.readLine());
		System.out.println("수학 점수를 입력해주세요");
		int mat_score = Integer.parseInt(br.readLine());
		
		int sum = kor_score+eng_score+mat_score;
		int avg = sum/3;
		char tier = 'F';
		
		switch(avg/10) {
		case 10:// 인수 값 10을 지나서 9로 점프하기 때문에 10일 때 실행하는 구문과 break문을 지워놔도 잘 작동한다
		case 9: tier='A';break;
		case 8: tier='B';break;
		case 7: tier='C';break;
		case 6: tier='D';break;
		default: tier='F';
		}
		
		System.out.println("국어:"+kor_score);
		System.out.println("영어:"+eng_score);
		System.out.println("수학:"+mat_score);
		System.out.println("총점:"+sum);
		System.out.println("평균:"+avg);
		System.out.println("등급:"+tier);
	}

}
