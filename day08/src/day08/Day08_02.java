package day08;

public class Day08_02 {

	public static void main(String[] args) {
		for(int i=0;i<5;i++) {	
			System.out.println("O O O O O");
		}
		System.out.println("--------------------");
		for(int j=1;j<=5;j++) {
			for(int i=j;i<=5;i++) {
				System.out.print("O ");
			}
			System.out.println();
		}
	}

}
