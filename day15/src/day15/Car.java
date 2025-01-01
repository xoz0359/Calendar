package day15;

public class Car {
	// 클래스 호출 순서 new를 통해 동적 메모리 할당을 한 후에 생성자를 호출
	// 이때 생성자가 없으면 jvm이 가상의 기본생성자를 생성해준다
	//변수선언 영역(멤버 변수)
	String ownername;
	String carname;
	String carcolor;
	int tire;
	
	//생성자선언 영역(멤버 변수의 초기화)
	public Car() {
		ownername="무명";
		carname="아반떼";
		carcolor="하얀색";
		tire=4;
	}
	
	//메서드선언 영역(멤버 변수)
	public void goCar() {
		System.out.println(carcolor+"색상의 "+carname+"이 앞으로 갑니다.");
	}
	public void backcar() {
		System.out.println(carcolor+"색상의 "+carname+"이 뒤로 갑니다.");
	}
	public void getinfo() {
		System.out.println("차주 이름:"+ownername);
		System.out.println("차 이름:"+carname);
		System.out.println("바퀴 수:"+tire);
	}
}
