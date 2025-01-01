package day15;
import java.io.*;

public class Banktest {

	public static void main(String[] args) 
	throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Bank bk = new Bank();
		System.out.println("쌍용은행 이용을 감사드립니다");
		System.err.println("성함을 입력하세요");
		String ownername = br.readLine();
		System.out.println("계좌번호를 입력하세요");
		String ownernum = br.readLine();
		bk.ownername = ownername;
		bk.ownernum = ownernum;
		
		boolean bool_1 = true;
		while(bool_1) {
			System.out.println("메뉴를 입력하세요");
			System.out.println("입금: 1");
			System.out.println("출금: 2");
			System.out.println("잔액조회: 3");
			int input = Integer.parseInt(br.readLine()); 
			switch(input) {
			case 1:
				System.out.println("입금할 금액을 입력하세요");
				int depositwon = Integer.parseInt(br.readLine()); 
				bk.deposit(depositwon);
				bk.jango();
				break;
			case 2:
				System.out.println("출금할 금액을 입력하세요");
				int withdrawalwon = Integer.parseInt(br.readLine());
				bk.withdrawal(withdrawalwon);
				bk.jango();
				break;
			case 3:
				bk.jango();
				break;
			default:
				System.out.println("잘못입력하셨습니다 보안을 위해 프로그램을 종료합니다");
				System.exit(input);
			
			}
			
			System.out.println("뱅킹프로그램을 종료하시겠습니까?"); 
			System.out.println("프로그램 종료: 1");
			System.out.println("다른 업무 이용: 2"); 
			int input2 = Integer.parseInt(br.readLine()); 
			switch (input2) {
			case 1 : bool_1 = false;
			case 2 : continue;
			}
		}
			 
			
	}
}
