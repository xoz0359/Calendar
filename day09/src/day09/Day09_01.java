package day09;

import java.io.*;

public class Day09_01 {

	public static void main(String[] args) throws IOException {
		// 가위 바위 보 게임 v1.0
		// 1. 가위 2. 바위 3. 보 4. 종료(종료값이 있으니 종료를 원할 때까지 반복)
		// 사용자에게 2번을 입력 받으면 컴퓨터도 가위 바위 보 중의 하나를 제시 결과를 출력
		// 난수 배우는 날! 비즈니스 로직(사용자에게 받은 값으로 어떻게 출력값을 도출할 건가)
		// 스크린 클리어 없이 화면 넘김 구혀해보기 (시간 있으면)
		// (시간 있으면 주먹 가위 보 프린트문으로 표현해보기!)
		// 타이틀, 프롬프트 메세지 출력
		System.out.println("=============================================");
		System.out.println("\t      가위 바위 보 게임 v1.0");
		System.out.println("---------------------------------------------");
		System.out.println("\t1.가위\t2.바위\t3.보자기\t4.종료");
		System.out.println("=============================================");

		String com_s = "";// 컴퓨터의 패를 String으로 표현할 변수
		String input_s = "";// 사용자의 패를 String으로 표현할 변수
		int win = 3;// 승리와 패배 무승부를 표현할 변수 0:비김, 1:승리, 2:패배

		do {
			System.out.println("입력>");
			win = 3;
			int input = System.in.read() - '0';
			System.in.skip(2);

			// 4가 입력되면 프로그램 종료
			if (input == 4) {
				System.out.println("게임을 종료할게요");
				System.exit(0);
			}

			// input 받았으니 컴퓨터가 낼 패 숫자로 선언
			int com_n = (int) (Math.random() * 3 + 1);

			// 0~2까지의 변수를 가위 바위 보 패로 가공
			if (com_n == 1) {
				com_s = "가위!";
			} else if (com_n == 2) {
				com_s = "바위!";
			} else if (com_n == 3) {
				com_s = "보자기!";
			}

			// 사용자에게 받은 input도 String으로 가공
			if (input == 1) {
				input_s = "가위!";
			} else if (input == 2) {
				input_s = "바위!";
			} else if (input == 3) {
				input_s = "보자기!";
			}

			// 비즈니스 로직
			if(((input-com_n)+2)%3==0) {
				win = 1;
			}else if(((input-com_n)+2)%3==1) {
				win = 2;
			}else {
				win = 0;
			}
			
			if(!(input>0&&input<=4)) {
				//System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
					System.out.println("\n\n\n\n\n");
					System.out.print("히든 게임 모드:");
					for(long i=0;i<999999999;i++) {
						for(long j=0;j<3;j++) {
						}
					}
					System.out.print(" 묵!");
					for(long i=0;i<999999999;i++) {
						for(long j=0;j<3;j++) {
						}
					}
					System.out.print(" 찌!");
					for(long i=0;i<999999999;i++) {
						for(long j=0;j<3;j++) {
						}
					}
					System.out.print(" 빠!\n");
					
					
					System.out.println("=============================================");
					System.out.println("\t가위 바위 보 게임(묵찌빠 모드) v1.0");
					System.out.println("---------------------------------------------");
					System.out.println("\t1.가위\t2.바위\t3.보자기\t4.종료");
					System.out.println("=============================================");
					System.out.println("\n\n\n\n\n\n\n\n");
					
					int win_2 = 0;
					
				do {
					input = 0;
					System.out.println("입력>");
					
					input = System.in.read() - '0';
					System.in.skip(2);
					
					// 4가 입력되면 프로그램 종료
					if (input == 4) {
						System.out.println("게임을 종료할게요");
						System.exit(0);
					} else if(!(input>=0&&input<=4)) {
						System.out.println("비정상 입력으로 프로그램을 종료합니다");
						System.exit(0);
					}
					
					// input 받았으니 컴퓨터가 낼 패 숫자로 선언
					com_n = (int) (Math.random() * 3 + 1);

					// 0~2까지의 변수를 가위 바위 보 패로 가공
					if (com_n == 1) {
						com_s = "가위!";
					} else if (com_n == 2) {
						com_s = "바위!";
					} else if (com_n == 3) {
						com_s = "보자기!";
					}

					// 사용자에게 받은 input도 String으로 가공
					if (input == 1) {
						input_s = "가위!";
					} else if (input == 2) {
						input_s = "바위!";
					} else if (input == 3) {
						input_s = "보자기!";
					}

					// 비즈니스 로직
					if(((input-com_n)+2)%3==0) {
						win = 1;
					}else if(((input-com_n)+2)%3==1) {
						win = 2;
					}else {
						win = 0;
					}
					
					if (win == 1) {
						System.out.println("사용자:" + input_s);
						System.out.println("컴퓨터:" + com_s);
						System.out.println("공격!");
					} else if (win == 2) {
						System.out.println("사용자:" + input_s);
						System.out.println("컴퓨터:" + com_s);
						System.out.println("수비!");
					} else if (win == 0) {
						System.out.println("사용자:" + input_s);
						System.out.println("컴퓨터:" + com_s);
						System.out.println("무승부, 한 번 더!");
						win = 0;
						continue;
					}
					 do{
						win_2 = 3;
						System.out.println("입력>");
						input = System.in.read() - '0';
						System.in.skip(2);
						
						System.out.print(" 묵!");
						for(long i=0;i<999999999;i++) {
							for(long j=0;j<3;j++) {
							}
						}
						System.out.print(" 찌!");
						for(long i=0;i<999999999;i++) {
							for(long j=0;j<3;j++) {
							}
						}
						System.out.print(" 빠!\n");
						if (input == 1) {
							input_s = "가위!";
						} else if (input == 2) {
							input_s = "바위!";
						} else if (input == 3) {
							input_s = "보자기!";
						}
						com_n = (int) (Math.random() * 3 + 1);
						if (com_n == 1) {
							com_s = "가위!";
						} else if (com_n == 2) {
							com_s = "바위!";
						} else if (com_n == 3) {
							com_s = "보자기!";
						}
						// 비즈니스 로직
						if(((input-com_n)+2)%3==0) {
							win_2 = 1;
						}else if(((input-com_n)+2)%3==1) {
							win_2 = 2;
						}else {
							win_2 = 0;
						}
						if (win_2==0) {
							System.out.println("사용자:" + input_s);
							System.out.println("컴퓨터:" + com_s);
							System.out.println("재대결!");
							continue;	
						} else if (win_2 == 2) {
							if(win == 2) {
								System.out.println("사용자:" + input_s);
								System.out.println("컴퓨터:" + com_s);
								System.out.println("패배하였습니다");
								System.exit(0);
							}else if(win == 1) {
								System.out.println("사용자:" + input_s);
								System.out.println("컴퓨터:" + com_s);
								System.out.println("컴퓨터가 공격합니다.");
								win=2;
								win_2 = 0;
								continue;
							}
						}else if (win_2 == 1) {
							win_2 = 1;
							if(win == 1) {
								System.out.println("사용자:" + input_s);
								System.out.println("컴퓨터:" + com_s);
								System.out.println("승리하였습니다!!");
								System.exit(0);
							}else if(win == 2) {
								System.out.println("사용자:" + input_s);
								System.out.println("컴퓨터:" + com_s);
								System.out.println("당신이 공격할 차례입니다!");
								win=1;
								win_2 = 0;
								continue;
							}
						}
					 }while(win_2==0);
				} while(win==0);
		}
			if (win == 1) {
				System.out.println("사용자:" + input_s);
				System.out.println("컴퓨터:" + com_s);
				System.out.println("승리!");
			} else if (win == 2) {
				System.out.println("사용자:" + input_s);
				System.out.println("컴퓨터:" + com_s);
				System.out.println("패배!");
			} else if (win == 0) {
				System.out.println("사용자:" + input_s);
				System.out.println("컴퓨터:" + com_s);
				System.out.println("무승부, 한 번 더!");
			}
		} while (win == 0);
	}
}