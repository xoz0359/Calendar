package day15;

public class TestA {
	static int classnum = 0;
	public TestA() {
		classnum++;
	}
	
	public static void getinfo() {
		System.out.println("현재까지 만들어진 객체는 총 "+classnum+"개 입니다.");
	}
}
