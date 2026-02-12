package chap03;

public class OpExam {

	public static void main(String[] args) {

		int x = 10;
		
		x++;
		System.out.println("x: " + x);
		
		x = 10;
		x = x + 1;
		// 나한테 + 1 해서 다시 나한테 저장할 때
		// 줄여쓰는 형태
		x += 1; // 위와 같은 코드
		x++;	// 위와 같은 코드 다만 +1 만 가능 
		
		x=10;
		++x;
		System.out.println("++x: " + x);
		
		x=10;
		--x;
		x--;
		System.out.println("--x: " + x);
		System.out.println("x--: " + x);
		
		x = 10;
		int z = ++x;
		System.out.println("z: " + z);
		System.out.println("x: " + x);
		
		x=10;
		z=x++;
		System.out.println("z: " + z);
		System.out.println("x: " + x);

		x=10;
		System.out.println(("x++:" + x++) + ("\tx:" + x));
		
		x = 10;
		z = x++ + ++x;
		// 예측:22 정답O
		System.out.println("z: "+ z);
		
		//z와 x의 출력값
		x=1;
		z = x++ - --x * x++ - x--;
		//예측x:0 오답x
		//예측z:0 오답x
		System.out.println("z: "+ z);
		System.out.println("x: "+ x);
		
		// 나누기 할 때 0으로 나누기 않도록 주의
		int b = 10;
//		int c = b / 0;
		double d = 7.3;
		double e = d / 0;
		System.out.println("d/0: " + e); // Infinity
		
		// % 나머지
		int f = 10 % 3;
		System.out.println("65줄나머지: " + f);
		int f1 = 3 % 3; // 0이 나올 수 있음
		System.out.println("나머지: " + f1);
		//특징: 0 부터 ~ 나머지 하는 숫자보다 하나 작은 것 만 나온다 
		
        /*
         * 숫자 149
         * ---------
         * 출력 결과
         * ---------
         * "백의 자리 : 1"
         * "십의 자리 : 4"
         * "일의 자리 : 9"
         * 나머지를 사용하여 풀기
         */

		int num = 385;
		int n100 = num / 100;
		int n10 = (num % 100)/ 10;
		int n1 = (num % 10);
		
		System.out.println(n100);
		System.out.println(n10);
		System.out.println(n1);
		
		
		System.out.println(0.1);
		System.out.println(0.1f);
		System.out.println(0.1 == 0.1f);
		// 소수점은 근사치로 저장된다
		// 그나마 같은 타입으로 변환해서 비교하면 수월하다
		
		String s1 = "s1";
		String s2 = "s1";
		System.out.println(s1.equals(s2));
		// 글씨는 무조건 equals() 로 비교한다.
		System.out.println("ada".equals(s1));
		
		int c1 = 22;
		int c2 = 4;
		System.out.println("몫: " + c1/c2);
		System.out.println("나머지: " + c1%c2);
		
		// 문제1
		// 난 돈이 10000원 있다
		// 1. 4500원 짜리 쌍화차 최대 몇잔
		int money = 10000;	
		int 쌍화차 = 4500;
		System.out.println("잔수: " + money / 쌍화차);
		// 2. 그리고 남는 돈은?
		System.out.println("거스름돈: " + money % 쌍화차);
		// 문제2
		// 올영에서 꿀홍차가 8000원 인데 
		// 15% 세일 그렇다면 가격은? 
//		int 꿀홍차 = 8000;
//		System.out.println(꿀홍차-(꿀홍차));
		int honey = 8000;
		double sale = 0.15;
		double total1 = honey - (honey * sale);
		System.out.println(total1);
		
		//문제3-0
		//1234를 10자리 이하 버림
		//결과 : 1200
		int i11 = 1234;
		int i12 = i11/100;
		int i13 = i12 * 100;
		System.out.println(i13);
		//문제3
		double v1 = 1000;
		double v2 = 794.0;
		// v1 / v2를 소수점 3자리까지만 출력
		//오칙연산만 사용
		double v3 = v1/v2;
		double v4 = v3 * 1000;
		int v5 = (int)v4;
//		double v6 = v5/1000; 인트 나누기 인트라 1.000이 나옴
		double v6 = (double)v5/1000;
		System.out.println(v4);
		System.out.println(v5);
		System.out.println(v6);
		
//		double v3 = v1/v2;
//		System.out.println(v1/v2);
//		System.out.printf("%2.3f", v3);
		
		// 문제 4
		// 17000원이 있을 때
		// 5천원 몇장을 받고
		// 1천원 몇장
		int m1 = 17000;
		int m2 = 5000;
		int m3 = 1000;
		int money2 = m1 / m2;
		int money3 = (m1 - (m2*money2));
		int money4 = money3 / m3; 
		System.out.println("5000원: " + money2 + "장");
		System.out.println(money3);
		System.out.println("1000원: " + money4 + "장");
		
		int s = 85;    //조건이 참이면 A 아니면 B
		String grade = (s > 90 ) ? "A" : "B";
		System.out.println("grade: " + grade);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
