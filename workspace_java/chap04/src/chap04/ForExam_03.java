package chap04;

import java.util.Scanner;

public class ForExam_03 {

	public static void main(String[] args) {

//		for(;;){무한반복
//		}
		
		int sum = 0;
		for(int i=1; i<=100; i++) {
			sum = sum + i;
		}
		System.out.println("for반복문1+2+3+...100: " + sum);
		// 아래처럼 해도 오류 안남
//		int sum = 0;
//		int i = 1; i = 101이 됨
//		for( i=1; i<=100; i++) {
//			sum = sum + i;
//		}
//		System.out.println("for반복문1+2+3+...100: " + sum);
		

		for(int b = 1; b<=10; b++) {
			b = b+1;
			System.out.println(b);
		}
		
		//1+1+1+1+1+1
		//1씩 더하기 5번 하고 싶다.
		int sum1 = 0;
//		sum1 = sum + 1;
//		sum1 = sum + 1;
//		sum1 = sum + 1;
//		sum1 = sum + 1;
//		sum1 = sum + 1;
	
		// 시작 값
		// 종료 조건
		int sum2 = 0;
			sum = 0;
		for(int c=1; c<=5; c++) {
			sum2 = sum+ 1;
		}
		System.out.println("sad:" + sum2);
		
		//1~5까지 합을 구하기
		sum = 0;
		sum = sum + 1;
		sum = sum + 2;
		sum = sum + 3;
		sum = sum + 4;
		sum = sum + 5;
		
		sum = 0;
		int k = 1;
		sum = sum + k; //k==1
		k++;
		sum = sum + k; //k==2
		k++;
		sum = sum + k; //k==3
		
		for(k=1; k<=5; k++) {
			sum = sum + k;
		}
		/*
		 * 반복문 만드는 원리
		 * 
		 * 1. 반복 되는 것 찾기
		 * 		Ctrl+c, v 했을 때 바뀌지 않는 것 찾기
		 * 
		 * 2. 반복 되지 않는 것의
		 * 		2-1. 규칙 패턴 찾기
		 * 		2-2. 변수로 바꿔서 더 이상 바뀌지 않게 만들기
		 * 
		 * 3. 시작 값 파악
		 * 4. 종료 조건 파악
		 */
		// 깜짝 퀴즈
		// 구구단 2단 출력
		//2 x 1 = 2
		//2 x 2 = 4
		System.out.println("2 X 1 = 2");
		System.out.println("2 X 2 = 4");
		System.out.println("2 X 3 = 6");
//		int goo = 0;
//		int g = 1;
//		g++;
//		int g = 2;
//		g++;
//		int g = 3;
//		g++;
		
		int a = 1; //초기값
		int w = 2 * a;
		System.out.println("2 X " + a + "= " + w );
		a = a + 1;
		w = 2 * a;
		System.out.println("2 X " + a + "= " + w);
		a = a + 1;
		w = 2 * a;
		System.out.println("2 X " + a + "= " + w);
		a = a + 1;
		w = 2 * a;
		System.out.println("2 X " + a + "= " + (2 * a));
		a = a + 1;
		for(a=1; a<=9; a = a + 1) {
			System.out.println("2 X " + a + "= " + (2 * a) );
			
		}
		
		//문제 
		//10부터 1까지 출력
		int a1 = 10;
		a1 = a1 -1;//9
		a1 = a1 -1;//8
		for(a1=10; a1>0; a1--) {
			System.out.println("문제1: " + a1);
		}
		//10부터 2까지 짝수만 출력
		int a2 = 10;
		for(a2=10; a2>0; a2=a2-2){
			System.out.println("문제2: " + a2);
		}
		
		 // --- 꼭 풀 수 있어야 함 ---
        // 문제1
        // 1~5까지 출력하되 홀수인지 짝수인지 같이 출력
        // 예) 1:홀수
        //     2:짝수
        int a3 = 1;
        for(a3=1;a3<=5;a3++) {
        	if(a3 % 2 == 0) {
        		System.out.println(a3 + ": 짝수");
        	}else if(a3 % 5 == 1){
        		System.out.println(a3 + ": 홀수");
        	}else {
        		System.out.println(a3 + ": 홀수");
        	}
        }
        int h3 = 1;
        for(h3=1;h3<=5;h3++) {
        	if(h3 % 2 == 1) {
        		System.out.println(h3 + ": 홀수");
        	}else {
        		System.out.println(h3 + ": 짝수");
        	}
        }
        // 문제2
        // 1~100까지 홀수의 합과 개수
        int a4 = 1;
        int a5 = 0;
        int a6 = 0;
        for(a4=1;a4<=100;a4=a4+2) {
        	System.out.println(a4);
        	a5=a5+a4;
        	a6=a6+1;
        }
            System.out.println(a5);
            System.out.println(a6 + "개");
       
        // 문제3
        // 1 ~ 입력 받은 수 까지 더하기
            
//           Scanner scan = new Scanner(System.in);
//           String scan1 = scan.nextLine();
//           int scan2 = Integer.parseInt(scan1);
//           int b1 = 1;
//           int b2 = 0;
//           for(b1=1;b1<=scan2;b1++) {
//        	   b2=b2+b1;
//           }
//           	System.out.println(b2);
            
        // --- 조금 난이도 있는 ---
        // 문제4
        // 1~10까지 3개씩 옆으로 찍
        //    1  2  3
        //    4  5  6 
        //    7  8  9
        //    10
        int c1=1;
        for(c1=1;c1<=10;c1++) {
//        	System.out.print(c1);
        	if(c1 %3 == 0) {
        		System.out.println(c1);
        	}else {
        		System.out.print(c1);
        	}
        }
        System.out.println("------------------------");
        // --- 시간 남으면 예습 ---
        // 문제5
        // 구구단 모든 단 출력
//		int p1 = 1;
//		int p2 = 2;
//		for(p2=2;p2<=9;p2++) {
//        	for(p1=1; p1<=9; p1 = p1 + 1) {
//        		System.out.print(p2 + "X" + p1 + "= " + (p2 * p1) );
//        	}
//		}	
		
 // --- 2중 for문 ---
        
        // 문제1
        // 구구단 모든 단 출력
		/*
		 * 2 x 1 = 2  3 x 1 = 3  4 x 1 = 4  5 x 1 = 5 ... 9 x 1 = 9
		 * 2 x 2 = 4  3 x 2 = 6  4 x 2 = 8  5 x 2 = 10... 9 x 2 = 18
		 * 2 x 3 = 6  3 x 3 = 9  4 x 3 = 12 5 x 3 = 15... 9 x 3 = 27
		 * 앞에 수가 한바퀴 다돌면 뒤에수가 한번 돌아야함
		 * 9의 배수만의 규칙을 찾고 떨어뜨려야함
		 * 앞에자리가 9인건 9의 배수 뿐임 캬~
		 */
//		int a10 = 1;
//		int a11 = 2;
//		for(a10 = 1; a10<=9; a10++) {
//			for(a11 = 2; a11 <= 9; a11++) {
//				if(a11 % 9 == 0) {
//				System.out.println(a11 + "X" + a10 + "=" + (a11 * a10 + " "));
//				}else {
//					System.out.print(a11 + "X" + a10 + "=" + (a11 * a10 + " "));
//				}
//			}
//		}

        // 문제2
        // 구구단 단마다 옆으로 출력
        // 2x1=2 2x2=4...
        /*
         * 2X1=2 2X2=4 2X3=6...2
         * 3X1=3 3X2=6 3X3=9...
         */
//		int a20 = 1;
//		int a21 = 2;
//		for(a21 = 2; a21 <= 9; a21++) {
//			for(a20 = 1; a20<=9; a20++) {
//				if(a20 % 9 == 0) {
//				System.out.println(a21 + "X" + a20 + "=" + (a21 * a20 + " "));
//				}else {
//					System.out.print(a21 + "X" + a20 + "=" + (a21 * a20 + " "));
//				}
//			}
//		}
		
		
        // 문제3
        // 구구단 3단씩 옆으로 출력
        // 2x1=2 3x1=3 4x1=4
        // 2x2=4 3x2=6 4x2=8
        // 2x3=6... 다시하기
        for(int a=1; a<=9; a++) {
        	System.out.println();
        }
		
		
        // 문제4
        // 주사위 2개를 굴려서
        // 나올 수 있는 모든 조합 출력
        // 중복 x
        // [1,1] [1,2] [6,6]
        /* 1 2 3 4 5 6, 1 2 3 4 5 6
         *  
         * 1,1 1,2 1,3 1,4 1,5 1,6
         * 2,2 2,3 2,4 2,5 2,6
         * 3,3 3,4 3,5 3,6 
         * 4,4 4,5 4,6
         * 5,5 5,6
         * 6,6
         * 숫자가 반복될때 마다 하나씩 사라져야함
         */
//        int b1 = 1;
//        int b2 = 1;
//        for(b2 = 1; b2<=6; b2++) {
//        	for(b1 = 1; b1<=6; b1++){
//        		if(b1 % 6 == 0) {
//        			System.out.println("[" + b2 + "," + b1 + "] ");
//        		}else {
//        			System.out.print("[" + b2 + "," + b1 + "] ");
//        		}
//        	}
//        }
        


        // 문제5
        // 주사위 2개를 굴려서
        // 합 별로 출력
        // 합2 : [1,1]
        // 합3 : [1,2] [2,1]
        /* 합4 : [1,3] [2,2] [3,1]
         * 합5 : [1,4] [2,3] [3,2] [4,1]
         * 합6 : [1,5] [2,4] [3,3] [4,2] [5,1] 
         * 합7 : [1,6] [2,5] [3,4] [4,3] [5,2] [6,1]
         * 합8 : [2,6] [3,5] [4,4] [5,3] [6,2]
         * 합9 : [3,6] [4,5] [5,4] [6,3]
         * 합10: [4,6] [5,5] [6,4]
         * 합11: [5,6] [6,5]
         * 합12; [6,6]
         */
//        int b10 = 1;
//        int b11 = 1;
//        for(b10=1; b10<=6; b10++) {
//        	for(b11=1; b11<=6; b11++) {
//        		if(b11 % 6 == 0) {
//        			System.out.println("[" + b11 + "," + b10 + "]");
//        		}else {
//        			System.out.print("[" + b11 + "," + b10 + "]");
//        		}
//        	}
//        }
                
       
        
        
        
        
        
        
       
        // 문제6
        // 주사위 2개를 굴려서 나올 조합에서
        // 중복 없이 출력
        // 예: [1,2] [2,1] 중복이라서 [1,2]
		
//        int b30 = 1;
//        int b31 = 1;
//        for(b31 = 1; b31<=6; b31++) {
//        	for(b30 = 1; b30<=6; b30++){
//        		if(b30 % 6 == 0) {
//        			System.out.println("[" + b31 + "," + b30 + "] ");
//        		}else if (b31>b30) {
//        			System.out.print("");
//        		}else {
//        			System.out.print("[" + b31 + "," + b30 + "] ");
//        		}
//        	}
//        }
		
		
		
		
	}

}
