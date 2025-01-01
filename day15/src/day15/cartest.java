package day15;

public class cartest {

	public static void main(String[] args) {
		System.out.println("프로그램의 시작");
		Car  car1 = new Car();
		car1.ownername="홍길동";
		car1.carname="스포티지";
		car1.carcolor="검정";
		car1.goCar();
		car1.backcar();
		System.out.println("--------------------------------");
		
		Car  car2 = new Car();
		car2.ownername="홍길동";
		car2.carname="포터";
		car2.carcolor="노랑";
		car2.goCar();
		car2.backcar();
		System.out.println("--------------------------------");
		
		Car Car3 = new Car();
		Car3.goCar();
		Car3.backcar();
		System.out.println("프로그램의 끝");

	}
}
