package day08;

public class Day08_01 {

	public static void main(String[] args) {
		// 교수님이 내주신 과제
		int j=0;
		int sum=0;
		boolean swi=true;
	
		for(int i=1;i<=10;i++) {
			if (swi==true&&j==0) {
				sum= sum+i;
				//예외처리 해도 되지만 부호를 출력하는 방법도 고민해보자 j=i-i*2;
				//좀 더 멋있게 처리하는 방법도 고민해보자
				System.out.print(i);
				swi=false;
				j++;
			}
			else if (swi==true) {
				sum= sum+i;
				System.out.print("+"+i);
				swi=false;
			}
			else if (swi==false) {
				sum= sum-i;
				j=i-i*2;
				swi=true;
				System.out.print(j);
			}
		}
		System.out.println("="+sum);
	}

}
