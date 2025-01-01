package day10;

public class Day10_01 {

	public static void main(String[] args) {
		//1변수 선언
		int var;
		//2변수 초기화
		var = 10;
		
		//1배열 선언(구청에 신고)
		int arr[];
		//2메모리에 생성(새 건물 짓기) new는 '동적메모리 할당 키워드' '[]'(지정 연산자)
		arr=new int[3];// 3개의 요소를 가진 배열 int arr을 메모리 영역에 만들었다
		//3초기화(입주)
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		
		char arr_2[];
		arr_2=new char[4];
		arr_2[0]='a';
		arr_2[1]='b';
		
		for(int i=0;i<4;i++) {
			System.out.println(arr_2[i]+"");
			System.out.println();
		}
		
		
		
		System.out.println("arr[0]:" + arr[0]);
		System.out.println("arr[1]:" + arr[1]);
		System.out.println("arr[2]:" + arr[2]);
		System.out.println("arr의 크기" + arr.length);
		// 자바에서 해당 배열의 인덱스를 초과한 값을 불러오면 오류를 반환한다
		// c++에는 null값이 들어있던가..?
		// 자바에서는 배열부터 객체 개념을 사용하는데

		// 배열 선언 초기화를 한 줄에서 하기
		double arr2[]=new double[5];
		arr2[0]=10.1;
		arr2[1]=20.2;
		arr2[2]=30.3;
		System.out.println("arr2[0]:"+arr2[0]);
		System.out.println("arr2[1]:"+arr2[1]);
		System.out.println("arr2[4]:"+arr2[4]);//객체에 대한 정보는 만들어질 때 모두 기본값으로 초기화 된다
		// 배열 선언 생성 초기화 한 줄에서 하기(권장하지 않음)
		// 한 줄에서 모두 처리하면 데이터의 변동성을 활용하기 어렵다(유지보수가 어렵다)
		int arr3[] = {10,20,30,40,50,60,70};
		
		for(int i=0;i<arr3.length;i++) {//length가 반복 실행되지 않도록 위쪽에 변수를 따로 저장해서 활용하면 메모리 누수를 줄일 수 있다 ㅎㅎㅎ
			System.out.println(arr3[i]);
		}
		
		for(int i:arr3){
		System.out.println(i);
		}
		
		
		
	}

}
