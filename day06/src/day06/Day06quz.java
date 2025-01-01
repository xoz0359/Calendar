package day06;

import java.io.*;

public class Day06quz {

	public static void main(String[] args)
	throws IOException {
		System.out.println("디저트로 커피를 드시겠습니까? y/n");
		int take = System.in.read();
		System.in.skip(2);
		System.out.println("원하는 커피의 번호를 선택해주세요.");
		System.out.println("1. 아메리카노");
		System.out.println("2. 캬라멜마끼아또");
		System.out.println("3. 바닐라라떼");
		System.out.println("4. 아망추");
		System.out.println("5. 카페라떼");
		int cof = System.in.read()-'0';
		System.in.skip(2);
		System.out.println("원하는 온도를 선택해주세요");
		System.out.println("0. ICE	1. HOT");
		int hot = System.in.read()-'0';

		
		if (take=='y') {
			if (cof==1) {
				if (hot=='1') {
					System.out.println("뜨거운 아메리카노 나왔습니다~");
				}
				else {
					System.out.println("차가운 아메리카노 나왔습니다~");
				}
			}
			else if (cof==2) {
				if (hot=='1') {
					System.out.println("뜨거운 캬라멜마끼아또 나왔습니다~");
				}
				else {
					System.out.println("차가운 캬라멜마끼아또 나왔습니다~");
				}
			}
			else if (cof==3) {
				if (hot=='1') {
					System.out.println("뜨거운 바닐라라떼 나왔습니다~");
				}
				else {
					System.out.println("차가운 바닐라라떼 나왔습니다~");
				}
			}
			else if (cof==4) {
				if (hot=='1') {
					System.out.println("정말 뜨거운 아망추로 만들어드려요?");
				}
				else {
					System.out.println("차가운 아망추 나왔습니다~");
				}
			}
			else if (cof==5) {
				if (hot=='1') {
					System.out.println("뜨거운 카페라떼 나왔습니다~");
				}
				else {
					System.out.println("차가운 카페라떼 나왔습니다~");
				}
			}
		}
		else {
			System.out.println("저희 식당을 이용해주셔서 감사합니다 안녕히 가세요~");
		}

	}

}
