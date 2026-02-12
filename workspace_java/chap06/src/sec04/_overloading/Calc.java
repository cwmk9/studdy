package sec04._overloading;

public class Calc {

	int plus(int a, int b) {
		System.out.println("int int 실행");
		return a + b;
	}
	
	double plus(double a, double b) {
		System.out.println("doublr double 실행");
		return a + b;
	}
	
	//타입이 같아서 안됨 변수와는 무관
//	double plus(double x, double y) {
//		System.out.println("doublr double 실행");
//		return x + y;
//	}
	
	
	double plus(int a, double b) {
		System.out.println("int double 실행");
		return a + b;
	}
	
	//타입뿐만 아니라 매게변수의 수도 본다
	int plus(int x) {
//		return x+x; 
		return plus(x,x); 
	}
	
	//오늘 운동
	String type;
	int min;
	int set;
	void fitness(String t, int m , int s) {
		type = t;
		min = m;
		set = s;
	}
	void fitness(String t, int m ) {
//		type = t;
//		min = m;
//		set = 5;
		
		fitness(t, m, 5);
	}
	
	void fitness(String t) {
		fitness(t, 3, 5);
	}
	
	Calc newCalc() { 
		Calc c = new Calc();
		return c;
	}
	
	int[] newInt3() {
		int[] a = new int [3];
		return a;
	}
	
	Calc[] newCalc5 () {
		Calc[] a = new Calc [3];
		return a;
	}
	
	
	
	
	
	
	
	
	
	
}
