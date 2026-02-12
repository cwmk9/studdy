package sec05._Static;

public class Calc {

	String color;
	// 언급 되는순간
	// static을 모두 로딩한다(처리한다)
	//정적 맴버, 공용 변수, 클래스 변수
	static double pi = 3.14;
	
	int max_int = Integer.MAX_VALUE;
	
	
	static int price;
	
	
	
	
	
	
	{
		System.out.println("필드에 있는 실행 블럭");
	}
	
	
	
	
	
	static {
		System.out.println("필드에 있는 static 실행 블럭");
	}
	//	price = 100;
	
	Calc(){
		System.out.println("Calc 생성자 실행");	 
		this.price = 100;
	}
	
		static void test() {
		System.out.println("미나엄");
	}
		
		
}
