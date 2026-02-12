package sec06._package.pack3;

import sec06._package.pack1.Edu;
import sec06._package.pack2.Access2;

public class Access3Exam {

	public static void main(String[] args) {

		//public이 아니어서 생성 못함 
//		Access1();
	
		Access2 a2 = new Access2();
		
		Edu e1 = new Edu();
		
//		a2.d1 = 10;
		a2.p1 = 100;

		//퍼블릭 없음
//		a2.d();
		//퍼블릭 있음
		a2.p();
	
		// public이 없는 class
		// import조차 안됨
//	    Access3 a3 = new Access3();
	}
	
	
}


