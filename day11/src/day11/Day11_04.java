package day11;

public class Day11_04 {

	public static void main(String[] args) {
		int arr[][];
		arr = new int[5][5];

		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 5; i++) {
				if (i==j) {
					arr[j][i]=2;
					System.out.print(arr[j][i]+"\t");
				}
				else {
					arr[j][i]=1;
					System.out.print(arr[j][i]+"\t");
				}
			}
			System.out.println();
		}

		System.out.println();
		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 5; i++) {
				if (i==j) {
					System.out.print(2+"\t");
				}
				else {
					System.out.print(1+"\t");
				}
			}
			System.out.println();
		}
	}

}
