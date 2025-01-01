package day10;

public class Day10_02 {

	public static void main(String[] args) {
		int arr[]= {10, 20, 30, 40, 50};
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("\n-----------------------");
		
		arr=new int[3];//new라는 동적메모리 할당 키워드가 선언 됐으므로 새로운 메모리 공간을 할당 받았다
		//c언어와의 차별점이 생기는 부분이 c는 배열을 포인터 상수 취급하며
		//선언된 배열이 참조하는 주소값을 변경하지 못하지만
		//java는 배열을 변수 취급해서 주소값을 바꿀 수 있다
		for(int i = 0;i<arr.length;i++) {
			arr=new int[3];
		}
	}

}
