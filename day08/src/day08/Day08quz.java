package day08;

import java.io.*;
public class Day08quz {
	
	public static void topSugar() {
		System.out.println("*_*_*_*_*_*_*_*");
	}
	public static void topCream() {
		System.out.println("@__@___@___@__@");
	}


	public static void main(String[] args) throws IOException {
		System.out.println("원하는 토핑을 선택하세요");
		System.out.println("1.슈가파우더 2.생크림장식");
		int order = System.in.read()-'0';
		for (int j = 1; j <= 5; j++) {
			for (int i = 1; i <= 7; i++) {
				if (j==1&&i==1) {// 케이크 뚜껑 출력부
					if(order==1) {
						topSugar();
					}
					else if(order==2){
						topCream();
					}
					else {
						System.out.println("잘못 입력했어요 프로그램을 종료합니다");
						System.exit(1);
					}
				}
				else if(j>1&&j<5) {//케이크 기둥 출력부
					if(i==1) {
						System.out.print("|             |");
					}
					continue;
				}
				
			}
			System.out.println();
			if(j==4) {//케이크 바닥 출력부
				System.out.println("-_-_-_-_-_-_-_-");
			}
		}
	}
}
