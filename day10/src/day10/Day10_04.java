package day10;

public class Day10_04 {

	public static void main(String[] args) {
		int x[]= {10,20,30,40,50};
		
		for(int i=0;i<x.length;i++) {
			System.out.print(x[i]+" ");
		}
		System.out.println("\n-------------------------------");
		
		int y[]=x;
		y[2]=1004;
		for(int i=0;i<y.length;i++) {
			System.out.print(y[i]+" ");
			
		}
		System.out.println("\n-------------------------------");
		
		for(int i=0;i<x.length;i++) {
			System.out.print(x[i]+" ");
		}
		System.out.println("\n-------------------------------");
	}

}
