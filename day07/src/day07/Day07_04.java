package day07;

public class Day07_04 {

	public static void main(String[] args) {
		// 0~50까지의 수 중 5의 배수의 값을 출력하고 마지막으로 그 출력한 배수의 합을 출력하는 프로그램 작성
		int sum=0;
		for(int i=0;i<=50;i++) {
			if (i%5==0) {
				sum+=i;
				System.out.println("지금"+sum+"과 "+i+"를 더했어요!");
			}
		}
		System.out.println("5의 배수의 합은 "+sum+"입니다!");

	}

}



