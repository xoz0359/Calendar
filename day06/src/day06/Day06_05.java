package day06;

import java.io.*;

public class Day06_05 {

	public static void main(String[] args) 
	throws IOException {
		// 사용자로부터 국, 영, 수 점수를 입력받아 총점과 평균을 구하시오
		// 평균을 기준으로 등급을 출력하시오
		// 100-a, 99~90-a, 89~80-b, 79~70-c, 69~60-d, 그 이하는 f
		// 프롬프트 메세지 출력
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("국어 점수를 입력해주세요");
		int kor_score = Integer.parseInt(br.readLine());
		System.out.println("영어 점수를 입력해주세요");
		int eng_score = Integer.parseInt(br.readLine());
		System.out.println("수학 점수를 입력해주세요");
		int mat_score = Integer.parseInt(br.readLine());

		
		int sum = kor_score+eng_score+mat_score;
		double avg = sum/3.0;
		char tier = 'F';// 변수 선언할 때 최소값으로 초기화 해놓자 관습
		if(avg>=90) {// 최대 점수는 100점이므로 and 연산은 생략 가능하다
			tier = 'A';
		}
		else if(avg>=80) { // 한 번 if문을 거쳐왔기 때문에 and 연산 없이도 표현할 수 있다
			tier = 'B';
		}
		else if(avg>=70) {
			tier = 'C';
		}
		else if(avg>=60) {
			tier = 'D';
		}
		else {
			tier = 'F'; // 명확한 코드 명시를 위해 일부러 else문 안의 내용을 채워주자!
		}
		
		System.out.println("국어:"+kor_score);
		System.out.println("영어:"+eng_score);
		System.out.println("수학:"+mat_score);
		System.out.println("총점:"+sum+"점");
		System.out.println("평균:"+avg+"점");
		System.out.println("등급:"+tier);
	}

}
