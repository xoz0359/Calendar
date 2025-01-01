package day12;

import java.io.*;

public class BaseBallGame {

	public static void main(String[] args) throws IOException {
		// 중복되지 않는 난수 3개를 생성하고 사용자가 10회의 기회를 가지고 이 난수를 맞춘다
		// 사용자는 3 자리의 수를 입력해 답을 제출하고
		// 자리와 수가 모두 맞을 경우에는 스트라이크, 값만 맞았을 경우에는 볼을 출력한다
		// 야구게임에 사용되는 난수는 1~9 단, 같은 게임에서 중복되는 난수는 사용하지 않는다
		System.out.println("==숫자야구게임 v1.0==");
		int num[][] = new int[3][3];
		for (int i = 0; i < 3; i++) {
			num[0][i] = (int) (Math.random() * 9 + 1);
		}

		//비즈니스 로직
		boolean duplicate = true;
		int temp = 0;
		for (int i = 0; i < num[0].length; i++) {
			for (int j = i; j < num[0].length - 1; j++) {
				if (num[0][i] == num[0][j + 1]) {
					duplicate = true;
					while (duplicate) {
						temp = (int) (Math.random() * 9 + 1);
						for (int k = 0; k < num.length; k++) {
							duplicate = false;
							if (temp == num[0][k]) {
								temp = (int) (Math.random() * 9 + 1);
								duplicate = true;
								break;
							}
						}
					}
					num[0][j+1] = temp;
				}

			}
		}
		
		for(int i=0; i<num.length;i++) {
			num[0][i] = (int)(Math.random()*6+1);
			for(int j=0;j<i;j++) {
				if(num[0][i]==num[0][j]) {//
					i--;//주 선택자를 고정하는 역할 i값이 마이너스 됨으로써 생성된 난수가 중복값이면 무한루프가 구현된다!
					break;
				}
			}
		}


		int round = 10;
		int s = 0, b = 0, sum = 0;
		for (int i = 0; i < round; i++) {
			System.out.println((i + 1) + "회차 입력:");
			s = 0;
			b = 0;
			sum = 0;
			for (int j = 0; j < 3; j++) {
				num[1][j] = System.in.read() - '0';
			}
			System.in.skip(2);
			
			// 채점 로직
			// 2중for문각 잘 보기 (데이터를 실제로 가공하는 부분과 가공하는 부분을 관리하는 반복문이 필요한가?)
			// 알고리즘적 사고하기
			// 로직을 먼저 생각하고 코드로는 구현만 하기
			for (int j = 0; j < 3; j++) {
				if (num[0][j] == num[1][j]) {
					num[2][j] = 2;// 2점 스트라이크 1점 볼 0점 점수 없음
					s++;
					sum += num[2][j];
				} else {
					for (int k = 0; k < 3; k++) {
						if (num[0][j] == num[1][k]) {
							num[2][j] = 1;
							b++;
							sum += num[2][j];
							break;
						} else {
							num[2][j] = 0;
						}
					}
				}
			}

			if (sum < 6) {
				System.out.println("힌트:" + s + "스트라이크 " + b + "볼");
			} else {
				break;
			}
		}
		if (sum > 5) {
			System.out.println("게임 결과: 승리!");
		} else if (sum < 6) {
			System.out.println("게임 결과: 패배!");
		}

	}

}
