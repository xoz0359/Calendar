package day07;

public class Day07_quz {

	public static void main(String[] args) {
		// 월요일 : 5알, 화요일 : 4알, 수요일 : 3알, 목요일 : 4알, 금요일 : 5알, 토요일 : 굶는날 , 일요일 : 특식!
		// 기본 3알에 2개의 스위치 변수를 활용해서 월~금까지 구현 토, 일은 예외처리
		int meal=3;
		int more=0;
		boolean meal_1=true, meal_2=true, meal_3=false;
		for (int day=1;day<=21;day++) {
			meal = 3;
			more = 0;
			
			//주말 예외처리하기
			if (day%7==6) {
				System.out.println("\n"+day+"일차\n토요일은 굶는 날이에요 ㅠㅠ");
				continue;
			}
			else if (day%7==0) {
				System.out.println("\n"+day+"일차\n일요일은 특식!\n오늘의 특식은 장구벌레입니다!");
				continue;
			}
			//기본 사료 개수에 추가 사료개수 더하기
			if (meal_1==true) {
				more++;
			}
			if (meal_2==true) {
				more++;
			}
			
			// 여기서부터 경우의 수가 5개 필요해
			//meal_3을 스위치 1/1
			if ((meal_1==true && meal_2==true)&&meal_3==true) {
				meal_3=false;
			}
			//5를 4으로 1/0
			else if ((meal_1==true && meal_2==true)&&meal_3==false) {
				meal_1=false;
			}
			//4를 3으로 0/0
			else if (meal_1==false && meal_2==true) {
				meal_2=false;
			}
			//3을 4로 0/1
			else if (meal_1==false && meal_2==false) {
				meal_1=true;
			}
			//4일 때 5로 1/1
			else if (meal_1==true && meal_2==false) {
				meal_2=true;
				meal_3=true;
			}
			System.out.println("\n"+day+"일차\n오늘의 사료는 "+(int)(meal+more)+"알 입니다!");
		}
	}

}
