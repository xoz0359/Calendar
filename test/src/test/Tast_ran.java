package test;

public class Tast_ran {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[][]=new int[3][3];
		
		/*
		 * for(int i=0;i<3;i++) { for(int j=0;j<3;j++) { num[i][j] =
		 * (int)(Math.random()*3+1); } }
		 */
		
		for(int i=0; i<num.length;i++) {
			System.out.println("i:"+i);
			num[0][i] = (int)(Math.random()*6+1);
			for(int j=i;j<num.length;j++) {// j가 i보다 작을 때가 조건 즉 i0일 때는 실행되지 않고 끝남
				System.out.println("i2:"+i);
				System.out.println("j:"+(j-1));
				System.out.println(num[0][i]+" "+num[0][j-1]);
				if(num[0][i]==num[0][j-1]) {//
					i--;//i의 값 감소
					break;//반복문이 끝나면서 i의 값 증가
					//주선택자가 오른쪽 끝에 고정되고 보조선택자가 인덱스 순서대로 올라가면서 비교
					//난수 테이브을 미리 생성하지 않고 중복값을 없애는 과정에서는 주 선택자가 오른쪽 끝에 고정되는 형태가 자연스럽다
					//보조 선택자를 인덱스 반대로 내리면서 비교하는 것도 가능(당연한 소리)
					//테이블을 미리 생성하고 비교하면 주선택자를 왼쪽에 고정시키고 비교하는 것도 가능할듯
					//난수 테이블을 미리 생성하고 정렬하는 알고리즘에 활용할 수는 없을까?
					//난수 테이블을 미리 생성하고 정렬하려면 인덱스가 지나가다가 주 선택자를 참조하게 됨
					//난수 테이블을 만들면서 중복값을 제거하는 게 정답에 가까운 알고리즘 같다
					//미리 만들어진 테이블에서 중복값을 제거하려면 for문을 회귀시키는 방법 하나만으로는 구현이 안 된다
			
				}
			}
		}
		int arr[]=num[0]; //여기에 배열 안의 값을 바로 저장 가능?

		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(num[i][j]);
			}
			System.out.println();
		}
		
	}

}
