package day07;

import java.io.*;

public class Day07_06 {

	public static void main(String[] args)
	throws IOException{
		// 소수인지 아닌지 구별하기
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int input=Integer.parseInt(br.readLine());
		
		for (int i=2;i<input;i++) {
			if (input%i==0) {
				System.out.println("입력한 "+input+"은 소수가 아닙니다");
				break;
			}
			if (i==input-1) {
				System.out.println("축하해요 소수를 발견했어요!");
			}
		}
	}

}
