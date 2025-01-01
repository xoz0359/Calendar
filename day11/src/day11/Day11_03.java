package day11;

public class Day11_03 {

	public static void main(String[] args) {
		double arr1[];
		arr1 = new double[7];
		double arr2[];
		arr2 = new double[3];
		double arr3[];
		arr3 = new double[3];
		
		int a[];
		
		double arr4[][]=new double[3][];
		arr4[0]=arr1;
		arr4[1]=arr2;
		arr4[2]=arr3;
		
		for (int i=0; i<arr4.length;i++) {
			for (int j=0; j<arr4[i].length;j++) {
				System.out.print(arr4[i][j]+" ");
			}
			System.out.println();
		}

	}

}
