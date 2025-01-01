package day11;

import java.io.*;

public class Day11_06 {

	public static void main(String[] args) 
	throws IOException{
		// 사용자로부터 학생 5명의 시험점수 3개를 입력받아 총점과 평균을 구해 내림차순으로 출력하시오.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int student[][]=new int[5][5];
		for(int i=0;i<student.length;i++) {
			for(int j=0;j<student.length-2;j++) {
				System.out.println((i+1)+"번 학생의 "+(j+1)+"번 시험점수:");
				student[i][j]=Integer.parseInt(br.readLine());
				student[i][3]+=student[i][j];
			}
			student[i][4]=student[i][3]/(student[i].length-2);
		}
		System.out.println("------------------------------------");
		
		for(int i=0;i<student.length;i++) {
			for(int j=0;j<student.length;j++) {
				System.out.print(student[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println("------------------------------------");
		int temp[];
		for(int i=0;i<student.length-1;i++) {
			for(int j=i+1;j<student.length;j++) {
				if (student[i][3]<student[j][3])
				{
					temp = student[i];
					student[i] = student[j];
					student[j] = temp;
					}
				
				}
		}
		
		
		for(int i=0;i<student.length;i++) {
			for(int j=0;j<student.length;j++) {
				System.out.print(student[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
