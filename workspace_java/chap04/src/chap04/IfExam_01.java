package chap04;

import java.util.Scanner;

public class IfExam_01 {
	
	public static void main(String[] args) {
		
		int score = 95;
		
		boolean over90 = score >= 90;
		
		{
			System.out.println("항상 실행");
		}
		
		if(over90) //참이면 실행 거짓이면 삭제
		{
			System.out.println("90 이상");
		}
		
		if (score<=90) {
			System.out.println("90 미만입니다");
		}
		if (!(score<=90))//정 반대의 경우 ! 를 쓸수 있다
		{
			System.out.println("!90 미만이 아닙니다");
		}
		
		if(score>=90) {
			System.out.println("90 이상입니다");
		}
		else{ //if가 참이 아니면 작동
			System.out.println("else 90 미만입니다");
		}
		
		score = 95;
		if ( score >= 90 ) {
			System.out.println("A");
		}
		if( (score < 100) && (score >= 80)) {
			System.out.println("B");
		}
		
		//이전과 관계 없이 무조건 다시 판단   
		if ( score >= 90 ) {
			System.out.println("A");
		}if ((score <= 100) && (score >= 80) ){
			System.out.println("B");
		}
		System.out.println("=-------------------");
		
		
		score = 100;
		if ( score >= 100 ) {
			System.out.println("90이상");
		} else if (score >= 80){
			// * 위의 if나 else if 가 거짓일 때만 판단한다
			System.out.println("90미만 80이상");
		} else if ( score >= 70) {
			System.out.println("80미만 70이상");
		} else {
			System.out.println("70미만");
		}
		
		
		if(score >= 90) {
			System.out.println("90 이상"); //이게 없으면 같은내용
			if(score >= 95) {
				System.out.println("95이상");
			}
		}
		//위아래 같은 내용
		 if(score >= 90 && score >=95)
		 {
			 System.out.println("95 이상");
		 }
		// else가 있으면 무조건 하나는 실행 되는게 보장된다//
		/////////////////////////////////////////////////////
		// 문제
		System.out.println("----------");
		int x = 3;
		if(x % 2 == 0){
		System.out.println("짝수");
		} else{
		System.out.println("홀수");
		}
		
		double rendom1 = Math.random();
		System.out.println("rendom1: " + rendom1);
		
		// Math.random()
		// 0 <= Math.random () < 1
		// 0 ~ 0.99999999999
		
		//0과1을구하는
		//정교한 방식
		// 0*2 <= Math.random() * 2 < 1*2
		// 0 ~ 1.99999999999999
		// int로 형변환 해서 정수만 남기기
		double rand2 = Math.random(); //0.999
		double temp1 = rand2 * 2; //0~1.9999
		int result = (int) temp1;
		if(result == 0) {
			System.out.println("짝수");
		} else{
			System.out.println("홀수");
		}
		
		// 1~6 까지 구하기 (주사위)
		// 0*6 <= Math.random() * 6 < 1*6
		// 0 ~ 5.9999999999999
		// int로 바꾸고
		// +1 하면 1~6
		double rand3 = Math.random();
		double temp2 = rand3 * 6; // 5.99999999999999
		int result0 = (int)temp2; // 0~5
		result = result0 + 1; //1~6
		System.out.println("곱" + result);
		
		// 5~10까지 구하기
		// 0~5까지 구해서 +5
		double rand4 = Math.random();
		double teml3 = rand4 * 6;  //0  5.999999
		int result4 = (int)teml3;  //0~5
		int result5 = result4 + 5; //5~10
		System.out.println("5~10: " + result5); 
		
//		변수로 범위를 잡아서 보편화
//		int min = 5;
//		int max = 10;
//		rand2 = Math.random();//0~나온숫자+min 0과나온숫자에 모두 min을 더함
//		temp2 = (int)(rand2 * (max - min + 1)) + min;
//		System.out.println("정교한 방법: " + temp2); 

		
		// 쉬운 방식
		rand2 = Math.random();
		temp2 = rand2 * 100000;
		result0 = (int)temp2;
		result = (result0 % 6) + 1;
		System.out.println("쉬운방법" + result);
		
		
		
		
//		 로또번호
//		 1~45까지 6개의 숫자를 랜덤으로 뽑아서 제출 하시오
//		 단, 중복 없이
		int min = 1;
		int max = 45;
		double rand21 = Math.random();
		double rand22 = Math.random();
		double rand23 = Math.random();
		double rand24 = Math.random();
		double rand25 = Math.random();
		double rand26 = Math.random();
		int rand12 = (int)(rand21*(max-min+1)+min);
		int rand13 = (int)(rand22*(max-min+1)+min);
		int rand14 = (int)(rand23*(max-min+1)+min);
		int rand15 = (int)(rand24*(max-min+1)+min);
		int rand16 = (int)(rand25*(max-min+1)+min);
		int rand17 = (int)(rand26*(max-min+1)+min);
		System.out.println("로또1: " + rand12);
		System.out.println("로또2: " + rand13);
		System.out.println("로또3: " + rand14);
		System.out.println("로또4: " + rand15);
		System.out.println("로또5: " + rand16);
		System.out.println("로또6: " + rand17);
		
		
		
		// 임의의 수를 입력 받아 
		Scanner scan = new Scanner(System.in);
		// 문제1
		// "양수", 0, "음수" 판단하여 출력
//		System.out.println("1번");
//		String scan1 = scan.nextLine();	
//		int scan2 = Integer.parseInt(scan1);
//		if(scan2 >= 1) {
//			System.out.println("양수");
//		}else if(scan2 <= -1 ) {
//			System.out.println("음수");
//		}else {
//			System.out.println("0");
//		}
		
		// 문제2
        // 홀수인지 짝수인지 판단하여 출력
//		System.out.println("2번");
//		String scan10 = scan.nextLine();
//		int scan11 = Integer.parseInt(scan10);
//		if(scan11 % 2 == 0) {
//			System.out.println("짝수");
//		} else {
//			System.out.println("홀수");
//		}
//		
		
		// 문제3
        // 임의의 두 수 x, y를 받아서
        // 둘 중에 큰 값 출력
//		System.out.print("X: ");
//		String scan20 = scan.nextLine();
//		System.out.print("Y: ");
//		String scan201 = scan.nextLine();
//		int scan21 = Integer.parseInt(scan20);
//		int scan22 = Integer.parseInt(scan201);
//		if(scan21>scan22) {
//			System.out.println("X: " + scan21);
//		}else if(scan22>scan21) {
//			System.out.println("Y: " + scan22);
//		}else {
//			System.out.println("X=Y");
//		}
//		
		
		
		// 문제4
        // 임의의 money를 입력 받아서
        // 7000원 이상이면 "택시타자" 출력
        // 7000~3000 사이면 "버스타자" 출력
        // 3000 미만임면 "걸어가자" 출력
//		System.out.println("4번");
//		String scan30 = scan.nextLine();
//		int scan31 = Integer.parseInt(scan30);
//		int m1 = 7000;
//		int m2 = 3000;
//		if(scan31>=m1) {
//			System.out.println("택시타자");
//		}else if(scan31<m2) {
//			System.out.println("걸어가자");
//		}else{
//			System.out.println("버스타자");
//		}
		
		 // 문제5
        // '가위', '바위', '보' 입력 받아서
        // 5-1 컴퓨터는 항상 '바위'만 낼 경우
//		System.out.println("5번")//혼자한거 잘못됨
//		String scan50 = scan.nextLine();
//		int 가위 = 1;
//		int 바위 = 2;
//		int 보 = 3;
//		String 가위1 = String.valueOf(가위);
//		String 바위1 = String.valueOf(바위);
//		String 보1 = String.valueOf(보);
		
		//무조건 바위일때 //현일이 행님이 풀어준방법
//		System.out.print("가위 바위 보: ");
//		String scan50 = scan.nextLine();
//		if(1==1) {//무조건 바위라서 통과. 이 하부는 바위일 경우의 값에 대한
//			if("바위".equals(scan50)) {
//				System.out.println("비김");
//			}else if("가위".equals(scan50)){
//				System.out.println("이김");
//			}else {
//				System.out.println("짐");
//			}	
//		}
			
		//5-2 //이해하고 한거
//		System.out.print("가위 바위 보: ");
//		String scan60 = scan.nextLine();
//		int min1 = 1;
//		int max1 = 3;
//		double rd = Math.random();
//		int rd1 = (int)(rd*(max1-min1+1)+1);
//		if(1==rd1){
//			if("바위".equals(scan60)){
//				System.out.println("가위 바위 보: 바위\n비김");
//			}else if("가위".equals(scan60)){
//				System.out.println("가위 바위 보: 바위\n짐");
//			}else{
//				System.out.println("가위 바위 보: 바위\n이김");
//			}
//		}else if(2==rd1) {
//				if("바위".equals(scan60)){
//					System.out.println("가위 바위 보: 가위\n이김");
//				}else if("가위".equals(scan60)){
//					System.out.println("가위 바위 보: 가위\n비김");
//				}else{
//					System.out.println("가위 바위 보: 가위\n짐");
//				}
//			}else if(3==rd1){
//				if("바위".equals(scan60)){
//					System.out.println("가위 바위 보: 보\n짐");
//				}else if("가위".equals(scan60)){
//					System.out.println("가위 바위 보: 보\n이김");
//				}else{
//					System.out.println("가위 바위 보: 보\n비김");
//				}
//			}
		
		// 문제6
        // 임의 세 수 x, y, z를 받아서
        // z가 x~y 사이에 있는지(포함) 판단
//		System.out.print("X: ");
//		String scan70 = scan.nextLine();
//		System.out.print("Z: ");
//		String scan71 = scan.nextLine();
//		System.out.print("Y: ");
//		String scan72 = scan.nextLine();
//		int scan73 = Integer.parseInt(scan70);
//		int scan74 = Integer.parseInt(scan71);
//		int scan75 = Integer.parseInt(scan72);
//		if(scan73 == scan74 && scan74 < scan75) {
//			System.out.println("X=Z<Y");
//		}else if(scan73 < scan74 && scan74 == scan75){
//			System.out.println("X<Z=Y");
//		}else if(scan73 < scan74 && scan74 < scan75){
//			System.out.println("X<Z<Y");
//		}else if(scan73 > scan74 && scan74 > scan75){
//			System.out.println("X>Z>Y");
//		}else {
//			System.out.println("Z가X와 Y사이에 포함되지않음");
//		}
		
//		System.out.print("X: ");
//		String scan70 = scan.nextLine();
//		System.out.print("Z: ");
//		String scan71 = scan.nextLine();
//		System.out.print("Y: ");
//		String scan72 = scan.nextLine();
//		int scan73 = Integer.parseInt(scan70);
//		int scan74 = Integer.parseInt(scan71);
//		int scan75 = Integer.parseInt(scan72);
//		if(scan73 <= scan74 && scan74 < scan75) {
//			System.out.println("포함");
//		}else if(scan73 < scan74 && scan74 >= scan75){
//			System.out.println("포함");
//		}else {
//			System.out.println("Z가X와 Y사이에 포함되지않음");
//		}
		
		 // 문제7
        // 월을 입력 받아서
        // 계절 출력
        // 13, -1등 입력하면 "정확히 입력해주세요" 출력
//		Scanner scan = new Scanner(System.in);
//		System.out.print("월을 입력해: ");
//		String scan80=scan.nextLine();
//		int scan81=Integer.parseInt(scan80);
//		if(scan81==1) {
//			System.out.println("겨울");
//		}else if(scan81==2) {
//			System.out.println("겨울");
//		}else if(scan81==3) {
//			System.out.println("봄");
//		}else if(scan81==4) {
//			System.out.println("봄");
//		}else if(scan81==5) {
//			System.out.println("봄");
//		}else if(scan81==6) {
//			System.out.println("여름");
//		}else if(scan81==7) {
//			System.out.println("여름");
//		}else if(scan81==8) {
//			System.out.println("여름");
//		}else if(scan81==9) {
//			System.out.println("가을");
//		}else if(scan81==10) {
//			System.out.println("가을");
//		}else if(scan81==11) {
//			System.out.println("가을");
//		}else if(scan81==12) {
//			System.out.println("겨울");
//		}else if(scan81>=0) {
//			System.out.println("제대로 입력");
//		}else if(scan81>=13) {
//			System.out.println("제대로 입력");
//		}
		//문제7-1
//		Scanner scan = new Scanner(System.in);
//		System.out.print("월을 입력해: ");
//		String scan81=scan.nextLine();
//		if("1월".equals(scan81)) {
//			System.out.println("겨울");
//		}else if("2월".equals(scan81)) {
//			System.out.println("겨울");
//		}else if("3월".equals(scan81)) {
//			System.out.println("봄");
//		}else if("4월".equals(scan81)) {
//			System.out.println("봄");
//		}else if("5월".equals(scan81)) {
//			System.out.println("봄");
//		}else if("6월".equals(scan81)) {
//			System.out.println("여름");
//		}else if("7월".equals(scan81)) {
//			System.out.println("여름");
//		}else if("8월".equals(scan81)) {
//			System.out.println("여름");
//		}else if("9월".equals(scan81)) {
//			System.out.println("가을");
//		}else if("10월".equals(scan81)) {
//			System.out.println("가을");
//		}else if("11월".equals(scan81)) {
//			System.out.println("가을");
//		}else if("12월".equals(scan81)) {
//			System.out.println("겨울");
//		}else {
//			System.out.println("제대로 입력");
//		}
		
		// 문제8
        // 임의의 수를 입력받아서 다음과 같이 출력
        // 예 : 125
        // 입력한 수는 100보다 크고, 양수이고, 홀수입니다.

//		System.out.print("입력: ");
//		String scan90=scan.nextLine();
//		int scan91=Integer.parseInt(scan90);
//		if(scan91>100 && 100>scan91) {
//				}else if(scan91%2==0  && scan91>100) {
//				System.out.println("입력한 수는 100보다 크고, 양수이고, 짝수입니다");
//				}else if(scan91%2==1 && scan91>100) {
//				System.out.println("입력한 수는 100보다 크고, 양수이고, 홀수입니다");
//				}else if(scan91%2==0 && scan91>0) {
//					System.out.println("입력한 수는 100보다 작고, 양수이고, 짝수입니다");
//				}else if(scan91%2==1 && scan91>0) {
//					System.out.println("입력한 수는 100보다 작고, 양수이고, 홀수입니다");
//				}else if(scan91%2==0 && scan91<0 ) {
//					System.out.println("입력한 수는 100보다 작고, 음수이고, 짝수입니다");
//				}else{
//					System.out.println("입력한 수는 100보다 작고, 음수이고, 홀수입니다");
//				}
		
		// 문제9
        // 온도를 입력받아서 다음과 같이 출력
        // 예 : -3
        // 영하 3도 입니다
        // 예 : 5
        // 영상 5도 입니다
//		System.out.print("입력: ");
//		String scan100=scan.nextLine();
//		int scan101=Integer.parseInt(scan100);
//		if(scan101<0) {
//			System.out.println("영하 " + scan101 + "도 입니다");
//		}else if(scan101>0) {
//			System.out.println("영상 " + scan101 + "도 입니다");
//		}else{
//			System.out.println("0도");
//		}
		
		// 문제10
        // 시, 분을 입력 받아서 35분 후의 시, 분을 출력
        // 3, 51을 입력받으면
        // 4시 26분 출력
//		System.out.print("입력: ");
//		String scan110=scan.nextLine();
//		int scan111=Integer.parseInt(scan110);
			
		// 문제11
        // 두자리 숫자를 입력받아서
        // 10의 자리와 1의 자리가 같은지 판단
        // 예 : 77 => 같음, 94 => 다름
//		System.out.print("입력: ");
//		String scan120=scan.nextLine();
//		int scan121=Integer.parseInt(scan120);
//		if(scan121%10==scan121/10) {
//			System.out.println(scan121 + " => 같음");
//		}else if(scan121<=9) {
//			System.out.println("두자리만 입력");
//		}else if(scan121>=100){
//			System.out.println("두자리만 입력");
//		}
//		else{
//			System.out.println(scan121 + " => 다름");
//		}
		
		// 문제12
        // 1~99까지 369게임
        // 임의의 수를 받아서 3,6,9 숫자가 있으면 "박수" 출력
        // 없으면 그 숫자 그대로 출력
        // 예 : 33 => 박수, 31 => 박수, 12 => 12, 14 => 14
//		int min10 = 1;
//		int max10 = 99;
//		double rd1 = Math.random();
//		int rd2 = (int)(rd1*(max10 - min10 + 1)+min10);
//		if(rd2 ==3) {
//			System.out.println(rd2 + "박수");
//		}else if (rd2 == 6) {
//			System.out.println(rd2 + "박수");
//		}else if (rd2 == 9) {
//			System.out.println(rd2 + "박수");
//		}else if (rd2%10 == 3) {
//			System.out.println(rd2 + "박수");
//		}else if (rd2%10 == 6) {
//			System.out.println(rd2 + "박수");
//		}else if (rd2%10 == 9) {
//			System.out.println(rd2 + "박수");
//		}else if (rd2/10 == 3) {
//			System.out.println(rd2 + "박수");
//		}else if (rd2/10 == 6) {
//			System.out.println(rd2 + "박수");
//		}else if (rd2/10 == 9) {
//			System.out.println(rd2 + "박수");
//		}else {
//			System.out.println(rd2);
//		}
   
		// 문제13
        // 사각형의 한쪽 모서리 : x1:10, y1:20
        // 반대편 모서리 : x2:90, y2:100
        // 입력받은 두 수를 좌표로 하는 점이 사각형에 겹치는가
//		System.out.print("X: ");
//		String scan120=scan.nextLine();
//		int scan121=Integer.parseInt(scan120);
//		System.out.print("Y: ");
//		String scan122=scan.nextLine();
//		int scan123=Integer.parseInt(scan122);
//		int x10 = 10;
//		int x11 = 90;
//		int y10 = 20;
//		int y11 = 100;
//		if(scan121>=x10 && scan123>=y10 && scan121 <= x11 && scan123 <= y11 ) {
//			System.out.println("겹침");
//		}else {
//			System.out.println("안겹침");
//		}
		
	}
}
