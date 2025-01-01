package day15;

public class StudentTest1 {
//멤버변수로 이름, 나이, 주소, 전화번호, 국어, 영어, 수학, 총점, 평균
	private String name = "";
	private int age = 0;
	private String live = "";
	private String phonnum = "";
	private int kor = 0;
	private int eng = 0;
	private int mat = 0;
	private int sum = 0;
	private double avg = 0;
	
	public void setname(String name) {
		this.name = name;
	}
	public String getname() {
		return this.name;
	}
	
	public void setage(int age) {
		this.age = age;
	}
	public int getage() {
		return this.age;
	}
	
	public void setlive(String live) {
		this.live = live;
	}
	public String getlive() {
		return this.live;
	}
	
	public void setphonnum(String phonnum) {
		this.phonnum = phonnum;
	}
	public String getphonnum() {
		return this.phonnum;
	}
	
	public void setkor(int kor) {
		this.kor = kor;
	}
	public int getkor() {
		return this.kor;
	}
	
	public void seteng(int eng) {
		this.eng = eng;
	}
	public int geteng() {
		return this.eng;
	}
	
	public void setmat(int mat) {
		this.mat = mat;
	}
	public int getmat() {
		return this.mat;
	}
	
	public void setsum(int sum) {
		this.sum = sum;
	}
	public int getsum() {
		return this.sum;
	}
	
	public void setkor(double avg) {
		this.avg = avg;
	}
	public double getavg() {
		return this.avg;
	}

}
