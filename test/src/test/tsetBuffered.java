package test;

import java.io.*;
import java.util.*;

public class tsetBuffered {

	public static void main(String[] args) 
	throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int A = Integer.parseInt(br.readLine());// 래핑한 입력 버퍼랑 기본 입력스트림버퍼는 따로 관리 되는구나
		for (int i=0; i<A; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			// 입력 버퍼에서 한 줄을 읽어들인다고 생각해야 함
			// 줄이 넘어가면 새로은 토크나이저 생성
			int B = Integer.parseInt(st.nextToken());
			int C = Integer.parseInt(st.nextToken());
			String ss = B+C+"";
			bw.write(ss+"\n");// 출력스트림 작성?
		}
			bw.flush();
	}
}
