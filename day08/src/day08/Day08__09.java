package day08;

public class Day08__09 {

	public static void main(String[] args) {
		// for문을 이용해 1~20까지의 수 중 2의 배수만 출력할 수 있도록 만들어주세요
		// 그 대신 출력은 if문 밖에서 수행될 수 있도록!

		for (int j = 1; j <= 5; j++) {
			for (int i = j; i <= 5; i++) {
				System.out.println("j의 값은:"+j+"\t"+"i의 값은:"+i);
			}
		}
	}

}
