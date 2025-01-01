package day15;

public class TestATest {

	public static void main(String[] args) {
		TestA t1 = new TestA();
		TestA t2 = new TestA();
		TestA t3 = new TestA();
		TestA.classnum = 0;
		TestA.getinfo();
		//출력결과
		//현재까지 만들어진 객체는 총 3개 입니다
	}

}
