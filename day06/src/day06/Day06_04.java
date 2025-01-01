package day06;

import java.io.*;

public class Day06_04 {

	public static void main(String[] args)
		throws IOException {
		// 사용자로부터 년도를 입력받아 해당 입력 년도가 윤년인지 평년인지 판단하는 프로그램 작성
		/*
		 * 출력결과 년도입력: 윤년평년을 계산하는 계산식 
		 * 윤년 2/29 
		 * 평년 2/28 
		 * 4년마다 윤년 
		 * 100년마다 평년
		 * 400년 마다 윤년
		 */
		//프롬프트 메세지
		String y_year = "윤년", p_year = "평년", t_year;
		System.out.println("원하는 년도를 숫자만 입력하세요");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String uesr = br.readLine();
		int user_int = Integer.parseInt(uesr);
		if (user_int%4 == 0) {
			t_year = y_year;
			if (user_int%100 == 0) {
				t_year = p_year;
				if (user_int%400 == 0) {
					t_year = y_year;
				}
			}
			System.out.println(user_int+"년은 "+t_year+"입니다");
		}
		else {
				System.out.println(user_int+"년은 평년입니다.");
		}
	}		
}

