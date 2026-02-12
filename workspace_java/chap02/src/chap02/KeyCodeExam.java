package chap02;

import java.util.Scanner;

public class KeyCodeExam {

	public static void main(String[] args) {
		
		System.out.println(1);
		System.out.println(2);
		
		System.out.print(3);
		System.out.println();// <br>처럼 그냥 엔터 효과
		System.out.print(4);
		
		System.out.println(5);
		System.out.println();
		System.out.println(6);
		
		String name = "김민권";
		int age = 20;
		System.out.printf("이름: %s, 나이: %d\n", name, age);
		/////////////
		//입력
		int keyCode;
		
		/* 스캐너 연습하려고 주석처리
		try {
			System.out.print("입력 >>");
			keyCode = System.in.read();
			System.out.println("keyCode: " + keyCode);
			
			keyCode = System.in.read();
			System.out.println("keyCode: " + keyCode);
		}
	
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		Scanner scanner = new Scanner(System.in);
		//엔터 까지의 모든 글씨
//		String inputDate = scanner.nextLine();
//		System.out.println("inputDate: "+ inputDate);
	
		//문제
		// 나이를 입력하고 +1 해서 출력
//		int 나이;
//		나이 = 20;
//		System.out.print("\n나이" + 나이 + 1);
		
		
		System.out.print("나이");
		String age2 = scanner.nextLine();
		int age3 = Integer.parseInt(age2);
		
//		int age3 = scanner.nextInt();
		
		System.out.println("내년엔 "+ (age3 + 1) +"살 입니다");
		
		
		
		
		
		
	}

}
