package day08;

public class Day08_04 {

	public static void main(String[] args) {
		for(int j=4;j>=0;j--) {
			for(int i=1;i<=5;i++) {
				System.out.print(i+j);
			}
			System.out.println();
		}
		System.out.println();
		for(int j=5;j>0;j--) {
			for(int i=j;i<5+j;i++) {
				System.out.print(i);
			}
			System.out.println();
		}

	}

}
