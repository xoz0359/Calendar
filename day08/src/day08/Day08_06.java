package day08;

public class Day08_06 {

	public static void main(String[] args) {
		
		boolean sw=true;
		int cnt=0;
		
		while(sw){	
		System.out.println("II");
		cnt++;
			if(cnt==5) {
			sw=false;
			}
		}
		//인위적인 초기식
		char temp='A';
		while(temp<=90) {
			System.out.print(temp+" ");
			temp++;
		}
		System.out.println();
		
		int temp2=1;
		
		do {
			System.out.println("temp2:"+temp2);
			temp2++;
		}
		while(temp2<=2);
	}
}
