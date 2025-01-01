package day11;

public class Day11_02 {

	public static void main(String[] args) {
		// 1.선언
		int arr[][];
		// 2.생성
		arr = new int[3][2];//3행2열의 공간
		// 3.초기화
		arr[0][0]=10;
		arr[0][1]=20;
		//arr[0][2]=30;
		arr[1][0]=40;
		System.out.println("arr[0][0]:"+arr[0][0]);
		System.out.println("arr[1][0]:"+arr[1][0]);
		System.out.println("arr[2][0]:"+arr[2][0]);
		System.out.println();
		for(int i=0;i<arr.length;i++) {//length를 물어보면 가장 큰 차원의 요소 개수를 반환한다
			for(int j=0;j<arr[i].length;j++) {//배열의 인덱스를 지정해주면 해당 차원의 요소 개수를 반환한다
				System.out.println("arr["+i+"]["+j+"]:"+arr[i][j]);
			}
		}
	}

}
