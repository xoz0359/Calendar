package day05;

import java.io.*;

public class Day05_03 {

	public static void main(String[] args) 
	throws IOException {
		//반지름을 입력받아 원의 넓이를 구하는 프로그램 작성 소수점을 포함한 실수를 입력
		//공식 반지름*반지름*3.14
		//입력버퍼 br 생성
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		
		
		//사용자에게 프롬프트 메세지 보내기
		System.out.println("원의 반지름을 입력하세요.");
		//입력값 파싱, 저장
		Double num1=Double.parseDouble((br.readLine()));
		
		//데이터 가공
		double result = num1*num1*Math.PI;
		
		System.out.println("반지름 입력:"+num1);
		System.out.println("원의 넓이:"+result);
	}

}
