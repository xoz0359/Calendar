package day15;

import java.io.*;

public class StudentTest2 {

	public static void main(String[] args) 
	throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int i=1; i<=5; i++) {
		System.out.println("학생"+i+"정보");
		Student s1 = new Student();
		System.out.println("이름");
		s1.setname(br.readLine()); 
		System.out.println("국어 점수");
		s1.setkor(Integer.parseInt(br.readLine()));;
		System.out.println("영어 점수");
		s1.seteng(Integer.parseInt(br.readLine()));
		System.out.println("수학 점수");
		s1.setmat(Integer.parseInt(br.readLine()));
		System.out.println(s1.getname()+" "+s1.getkor()+" "+s1.geteng()+" "+s1.getmat());
		}
		
		

	}

}
