package chap02;

public class TypeCasingExam {

	public static void main(String[] args) {

		int intValue = 10;
		byte byteValue = (byte)intValue;
		System.out.println(byteValue); 
		
		//여기서 ()는 우선 순위 연산자
		int a = 2 * (3 + 4);
		
		//여기서 ()는 형 변환 연산자
		byte byteValue2 = (byte)intValue;
		intValue = 200;
		byteValue = (byte)intValue;
		// 정확히는 비트를 2의 보수로 계산한 결과가 나온다
		// 즉 예상하기 힘들다
		System.out.println(byteValue); 
		
		double d1 = 3.14;
		float f1 = (float)d1;
		System.out.println(f1);
		
		//의미없음
//		long l1 = (long)2200000000L;
		
		double d2 = -3.14;
		int i1 = (int)d2;
		System.out.println(i1);
		
		//작은 것에서 큰 것으로 변환 할 때
		//형 변환 생략 가능
		int i2 = 100;
		long l2 = (long)i2;
		long l3 = i2;
		
		int i3 = 2100000000;
		int i4 = 2100000000;
		int i5 = i3 + i4;
		System.out.println(i5);
	
		int i6 = 10;
		long l6 = 4L;
		//int는 long으로 자동 형 변환이 된다
		//long은 int가 될수 없어 int를 long으로 바꿈
		//long은 인트에 들어갈수 없어 에러
//		int i7 = i6 + l6;
		long l7 = i6 + l6;
		
		int i7 = 10;
		double d7 = 5.5;
		double d8 = i7 + d7;
		System.out.println("d8:[15.5?] " + d8);
		
		//정수가 int이기 때문에 2.0이 출력
		double d9 = 10 / 4;
		System.out.println(d9);
		
		double d10 = 10.0 / 4;
		System.out.println(d10);
		//예습
		//강제 타입 변환
//		String str = "10";
//		byte value = Byte.parseByte(str);
//		System.out.println("타입변환: " + value);
//		String str = "true"; //문자열을 숫자로
//		boolean value = Boolean.parseBoolean(str);
//		System.out.println("타입변환: " + str);
//		int value = 20; //숫자를 문자로
//		String str = String.valueOf(value);
//		System.out.println("타입변환: " + value);
//		System.out.print("타입변환: " + value);
		
//		모니터로 변수값 출력하기
		
//		d(정수)f(실수)s(문자열)
		System.out.printf("이름: %s", "감자바");
		System.out.printf("\n나이: %d", 25);
		//1$ 2$ 는 순서 1$는 첫번째 값을 가져와라 2$ 두번째 값을 가져와라
		System.out.printf("\n이름: %1$s , 나이: %2$d" , "감자바", 25);
		
		//차례대로 그냥 정수 6자리 정수 빈칸은 왼쪽공백
		//-는 오른쪽 공백 %06은 왼쪽 0으로 채우기
		// %60은 안됨
		System.out.printf("\n%d, \n%6d, \n%-6d, \n%06d, \n%60d", 123 , 123 , 123 , 123 , 123);
		// 11칸의 자리를 채루고소수점위로 7개의 칸 밑으로3개의 칸을 가져라
		//.도 한칸을 차지하므로 숫자와 공백 합은 10
		//차례대로 왼쪽 공백 오른쪽공백 왼쪽 공백0으로 채워라
		System.out.printf("\n%11.3f, \n%-11.3f, \n%011.3f" , 123.45 , 123.45 , 123.45);
		
		//수업
		String s1 = "123";
		int i12 = Integer.parseInt(s1);
		System.out.println(i12);
		
//		String s2 = "123";
//		int i13 = (int)s2; //지원하지 않음
		
		
//		String s3 = "123a";
//		int i14 = Integer.parseInt(s3); //NumberFormatException
//		에러나 예외가 발생하면 즉시 java 종료
//		System.out.println(s3);
		
		int i15 = 123;
		String str = String.valueOf(i15);
		System.out.println(str + 1);
		
		//가장 쉽게 숫자를 문자로 바꾸는 방법
		String str1 = "" + i15;
		
		String s20 = "aasd";
				String s21 = "bbc";
				System.out.println (s20.equals(s21) );
				System.out.println( "test".equals (s20) );
		
		
		
		
		
		
		
		
		
		
	}
	
}
