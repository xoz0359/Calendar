package day12;

import java.io.*;

public class LottoGame {

	public static void main(String[] args) throws IOException {
		// 사용자의 입력값에 따라 6개가 한 세트인 1부터 45까지의 난수를 한 개의 행으로 출력하는 프로그램
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num[] = new int[6];// 로또 번호 행을 만드는데 쓰일 난수를 저장할 배열 선언
		System.out.println("몇 개의 로또 번호를 생성하시겠습니까?");
		int input = Integer.parseInt(br.readLine());
		for (int j = 0; j < input; j++) {
			for (int i = 0; i < num.length; i++) {
				num[i] = (int) (Math.random() * 45 + 1);// 1부터 45까지의 난수를 생성한다
			}

			// 비즈니스 로직
			boolean duplicate = true;
			int temp = 0;
			for (int i = 0; i < num.length; i++) {
				for (int k = i + 1; k < num.length; k++) {
					if (num[i] == num[k]) {//한 개의 행에서 반복되는 난수발생시 true
						duplicate = true;
						while (duplicate) {//난수가 중복될 때만 반복문 실행
							temp = (int) (Math.random() * 45 + 1);// 새로운 난수 후보 선언
							for (int n = 0; n < num.length; n++) {
								duplicate = false;
								if (temp == num[n]) {//새로운 난수가 이미 겹치는 값이면 true
									temp = (int) (Math.random() * 45 + 1);
									duplicate = true;
									break;
								}
							}							
						}
						num[k] = temp;
					}
				}
			}


			
			for (int i = 0; i < num.length; i++) {
				System.out.print(num[i] + "\t");
			}
			System.out.println();
		}

	}
}
