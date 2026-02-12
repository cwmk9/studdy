package chap02;

public class VarTypeExam {

	public static void main(String[] args) {

		byte b1;
		b1 = 127;
		System.out.println("b1: " + b1);
//		b1 = 128; // 바이트는 -128~127까지가 허용 범위
		
		char c1 = 65; //65는 A // 문자 + 숫자 = 문자
		System.out.println("c1: " + c1);
		char c2 = 65 + 2;
		System.out.println("c2: " + c2);
		char c3 = 'B';
		System.out.println("c3 - c1 : " + (c3 - c1) );
		
		// int에 22억이 못들어가서 L을 붙힘으로써 롱타입이라고 명시함
		long l1 = 2200000000L;
	
		String s1 = "김민권"; //이해못함
		System.out.println("s1: " + s1);
		
		String s2 = "김\"민\"권"; //\역슬래쉬는 특수기호를 포함하고 싶을때 사용함
		System.out.println("s2: " + s2);
		
		String s3 = "\\김\t민\n권"; //t는tab n은 내려쓰기
		System.out.println("s3: " + s3);
		
		System.out.println("글씨" +3); //모든 연산자는 왼쪽에서 시작
		System.out.println("글씨" +3 + 2); //문자 +3 이라서 3도 문자가되서 5가안됨
		System.out.println("글씨" + (3 + 2)); //가로로 숫자를 더해서 글씨5출력 위는 숫자가 아님 
		System.out.println(3 + 2 + "글씨"); //5글씨 숫자5 + 문자 = 5글씨 라는 문자 

//		int a = 3.14;
		
		float f1 = 3.14f;
		System.out.println("f1:" + f1);
		
		double d1 = 3.14;
		System.out.println("d1:" + d1);
	
		float f2 = 0.1234567890123f;
		System.out.println("f2:" + f2);
		// float의 정밀도 : 소수점7자리
	
		double d2 = 0.12345678901234567890;
		System.out.println("d2:" + d2);
		// double의 정밀도 : 소수점 16자리
		
		double d3 = 5e3;
		System.out.println("d3:" + d3);
		
		boolean stop = true;
		boolean state = false;
		System.out.println("stop: " + stop);
		
		
		//  문제1
		int value;
		value = 28;
		System.out.println("김민권 " + value);
		//문제2
		boolean 운전면허 = true;
		System.out.println("운전면허가 있다" + 운전면허);
//		boolean stop = true;
//		if(stop) {
//			System.out.println("운전면허" + "있다");
//		} else {
//			System.out.println("운전면허" + "다");
//		}
		//문제3	
		String 이름 = "김민권";
		System.out.println("이름:" + 이름);
		
		// 문제 6
        // 6-1 : 두 변수 x, y에 각각 숫자를 넣고
        //    출력 결과 : "3 > 4 결과는 false 입니다"
//		int x;
//		int y;
//		x = 3;
//		y = 4;
//		System.out.println("3 > 4:" + (x > y));
		// 문제 6-2
		int x;
		int y;
		x = 4;
		y = 3;
		System.out.println("3 > 4:" + (x > y));
		
		// 문제 7
        /*
         * 숫자 149
         * ---------
         * 출력 결과
         * ---------
         * "백의 자리 : 1"
         * "십의 자리 : 4"
         * "일의 자리 : 9"
         */
		int num = 556;
		int n100 = num / 100;
		int n10 = (num - n100*100) / 10;
		int n1 = num - n100*100 - n10*10;
		
		System.out.println("백의자리: " + n100 + "\n십의자리: " + n10 +  "\n일의자리: " +n1 );
		
		  // 문제 8
        // 회식비 43000원
        // 참석인원 4명
        // 인 당 얼마?
        // 8-1 : 디테일하게 원단위까지
		int 회식비= 43000;
		int 참석인원 = 4;
		int 백원 = ((회식비 / 참석인원)/100)*100;
		System.out.println("각자:" + 백원);
        // 8-2 : 만원 단위까지만 받기
		int 만원단위 = (((회식비 / 참석인원)/10000)*10000);
		System.out.println("만원단위:" + 만원단위);
		// 8-2-1 : 주최자는 얼마 내야하는가?
//		int 주최자 = (회식비 - 만원단위)/참석인원-1;
		int 주최자 = 회식비 - (만원단위 * (참석인원-1));
		System.out.println("주최자" + 주최자);
		// 문제 9
        String left = "오예스";
        String right = "사탕";
        String 공병;

        공병=left;
        left=right;
        right=공병;
    
        System.out.println("left: "+ left);   // 사탕
        System.out.println("right: "+ right); // 오예스

        String 첫번째 = "일";
        String 두번째 = "이";
        String 세번째 = "삼";
        String 네번째 = "사";
        String 다섯째 = "오";
        String 허수;
        String 허수허;
        
        허수 = 첫번째;
        허수허 =두번째;
        첫번째 = 다섯째;
        두번째 = 네번째;
        세번째 = 세번째;
        네번째 = 허수허;
        다섯째 = 허수;
        
        System.out.println("일:" + 첫번째);
        System.out.println("이:" + 두번째);
        System.out.println("삼:" + 세번째);
        System.out.println("사:" + 네번째);
        System.out.println("오:" + 다섯째);
	}	

}
