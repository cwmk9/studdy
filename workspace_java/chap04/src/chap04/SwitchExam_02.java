package chap04;

public class SwitchExam_02 {

	public static void main(String[] args) {

		int num100 = 1;
		if (num100 == 1) {
			System.out.println("1입니다");
		}else if(num100 == 2) {
			System.out.println("2입니다");
		}else{
			System.out.println("1 또는 2가 아닙니다");
		}
		//그대로 switch로 변환
		// 사용 가능 : byte, char, short, int, String
		// 사용불가능 : boolean, long, float, double
		switch(num100) {
			case 1 :
				System.out.println("1입니다");
//				break;
			case 2 :
				System.out.println("2입니다");
				break;
			default :
				System.out.println("1 또는 2가 아닙니다");
				break;
		}
		
		int month = 3;
		switch(month){
			case 3: 
			case 4:
			case 5:
				System.out.println("봄");
				break;
			case 6:
			case 7: 	
			case 8: 
				System.out.println("여름");
				break;
			case 9: 
			case 10: 
			case 11: 
				System.out.println("가을");
				break;
			case 12: 
			case 1:
			case 2: 
				System.out.println("겨울");
				break;
		}
	}

}
