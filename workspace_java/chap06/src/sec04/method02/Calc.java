package sec04.method02;

public class Calc {
	// 메소드 선언
	void powerOn() {
		int a;
		a = 10;

		System.out.println("전원을 켭니다");
	}

	// return 배우고 옴
	int plus(int x, int y) {
		System.out.println("x:" + x);
		System.out.println("y:" + y);

		int result = x + y;
		return result;
	}			//빨간줄은 리턴을 안줘서
	double divide (int x, int y) {
		System.out.println("X: " + x);
		System.out.println("Y: " + y);
		if(y==0) {
			System.out.println("y0안됨");
			return 0;
		}
		double result = x / y; 
								// x y 를 받아서 주어진 일 함 
		return result; //리턴타입으로 반환
	}

		
		
	
	/*
	 * javadoc 주석
	 * 두 정수를 입력 받아서
	 * 나누기한 결과를 x/y
	 * double로 돌려주는 메소드
	 * 단y가 0일때는
	 * 		"0으로 나눌 수 없다" 고 출력하고
	 * 		0을 돌려 줌
	 * 
	 * 메소드 명: divide     ()앞에 붙히기
	 * 전달인자 : int x, int y ()안에 넣기
	 * 리턴타입 : double 	메소드 명 앞에 
	 * 
	 * @param int x, int y
	 * @return double
	 * @author todair@naver.com
	 */
}
