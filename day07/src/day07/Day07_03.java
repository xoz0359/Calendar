package day07;

public class Day07_03 {

	public static void main(String[] args) {
		int j= 1;
		int sum = 0;
		for(int count=1;count<=10;count++){
			sum += count; 
			System.out.println(count+"번째 내 이름은 홍길동 입니다."+j);
			j++;
		}
		System.out.println(sum);
		System.out.println("j의 최종값:"+j);
	}

}