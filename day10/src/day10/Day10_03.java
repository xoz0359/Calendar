package day10;

public class Day10_03 {

	public static void main(String[] args) {
		int x[]	= {10,20,30,40,50};
		int y[] = {100,200,300};
		
		for(int i=0;i<x.length;i++) {
			System.out.println(x[i]+" ");
		}
		for(int i=0;i<y.length;i++) {
			System.out.println(y[i]+" ");
		}
		System.out.println("\n------------------------");

		int temp[]=x;
		x=y;
		y=temp;//주소값 스왑이 된다 ㅋㅋㅋㅋㅋㅋ
		
		for(int i=0;i<x.length;i++) {
			System.out.println(x[i]+" ");
		}
		for(int i=0;i<y.length;i++) {
			System.out.println(y[i]+" ");
		}
		System.out.println("\n------------------------");
	}

}
