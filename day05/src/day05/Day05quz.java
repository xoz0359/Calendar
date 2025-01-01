package day05;
import java.io.*;

public class Day05quz {

	public static void main(String[] args) 
	throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("주민번호를 뒷자리 첫 번째 자릿수까지만 입력해주세요\n\t- ******");
		String who1 = br.readLine();
		int who1_age = Integer.parseInt(who1);
		if (who1_age%2==0) {
			System.out.println("여성입니다");
		}
		else {
			System.out.println("남성입니다");
		}
		
		Mysub ms = new Mysub();
		ms.todaySubject();
	}
}
