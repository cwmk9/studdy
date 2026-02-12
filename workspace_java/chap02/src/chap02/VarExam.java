package chap02;

public class VarExam {

	public static void main(String[] args) {

		// 변수 선언
		int value;
		
		// 변수에 값 넣기
		// 변수에 할당
		value = 5;
		
		//value의 값을 출력해라
		System.out.println(value);
		
		value = 6; // 덮어 쓰기
		System.out.println(value);
		
		int result; //값이 없는데 실행하면 에러
//		System.out.println(result);
		result = value + 10;
		System.out.println(result);
		
		// 선언과 동시에 초기화 
		int hour = 3;
		int minute = 5;
		
		System.out.println(hour + "시" + minute + "분");
		System.out.println("value: " + value);
		
		int x = 10;
		{	// x는 두번째 중가로 y=세번째 중가로로 작동함
			System.out.println("x: " + x);
			int y = 5;
			System.out.println("y: "+ y);
			{	// y가 선언된 중가로 안에 있는 중가로라 작동됨
				System.out.println("y: "+ y);
			}
		}	//중가로가 끝나서 y는 선언되지않음	
//		System.out.println("y: "+ y);
//		nValue // 헝그리 어쩌구
	
	}

}


		