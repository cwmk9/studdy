package sec06._package.pack2;

public class Access2 {
	
	// 내 class 한정
	private int hp = 100;

	public Access2(){
		System.out.println("Access2 생성자 실행");
		this.hp = 200;
	}
	// 기본 생성자는 public이 있다
	//public Access2(){}
	
	int d1 = 10;
	public int p1 = 20;
	//디폴트 접근
	void d() {
		System.out.println("d() 실행: ");
	}
	//퍼블릭 접근 
	public void p() {
		System.out.println("p() 실행: ");
	}
}
