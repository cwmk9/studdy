package Quiz.Quiz02;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckIn {
	
//	CheckIn(int in, int out){
//		this.checkin=in;
//		this.checkout=out;
//		Check.add(this);
//		
//	}
	
//	void room(int in, int out) {//입실날짜 퇴실날짜 저장
//		CheckIn check = new CheckIn(in,out);
//		Check.add(check);
//		
//	}

	ArrayList <CheckIn> Check = new ArrayList <CheckIn>();
	
	int checkin;
	int checkout;
	
	
	boolean st = true;//while 스톱용
	CheckIn(){ // 첫손님 
		boolean stop = true;
		while(stop) {
			Scanner scan2 = new Scanner(System.in);
			Scanner scan3 = new Scanner(System.in);
			System.out.print("입실하실 날짜를 입력해주세요");
			int sin1 = scan2.nextInt(); 
			System.out.print("퇴실하실 날짜를 입력해주세요");
			int sout1 = scan3.nextInt();
			
			if(sin1>sout1) {
				System.out.println("퇴실날짜가 입실날짜보다 빠를수 없습니다");
				System.out.println("다시 선택해 주세요");
			}else {
				this.checkin=sin1;
				this.checkout=sout1;
				Check.add(this);
				System.out.println("예약 완료 되었습니다");
				stop=false;
			}
		}
	}
	void checkin() {
		while(st) { //첫손님 이후 손님 예약된 자리가 있는경우
			Scanner scan = new Scanner(System.in);
			Scanner scan1 = new Scanner(System.in);
			System.out.print("입실하실 날짜를 입력해주세요");
			int sin = scan.nextInt(); 
			System.out.print("퇴실하실 날짜를 입력해주세요");
			int sout = scan1.nextInt();
			
			for(int c = 0; c<Check.size(); c++) { //예약된 날짜 사이에 예약 거르기
				
				if(sin>sout) {
					System.out.println("퇴실날짜가 입실날짜보다 빠를수 없습니다");
					System.out.println("다시 선택해 주세요");
//					st=false;
				}else if(Check.get(c).checkin<=sin && Check.get(c).checkout >= sin) {
					System.out.println(Check.get(c).checkin + "일~" + Check.get(c).checkout + "일 마감되었습니다");
					System.out.println("다른날짜를 선택해주세요");// out날짜가 겹치면 거르기
//					st=false;
				}else if(Check.get(c).checkin>sin && Check.get(c).checkin == sout && Check.get(c).checkout >= sout) {
					System.out.println(Check.get(c).checkin + "일~" + Check.get(c).checkout + "일 마감되었습니다");
					System.out.println("다른 날짜를 선택해주세요");//in날짜 겹치는거 거르기
//					st=false;
				}else if(Check.get(c).checkin<sin && Check.get(c).checkout>sin && Check.get(c).checkout <= sout) {
					System.out.println(Check.get(c).checkin + "일~" + Check.get(c).checkout + "일 마감되었습니다");
					System.out.println("다른 날짜를 선택해주세요");
//					st=false;
				}else if(Check.get(c).checkin>sin && Check.get(c).checkin <= sout && Check.get(c).checkout >= sout){
					System.out.println(Check.get(c).checkin + "일~" + Check.get(c).checkout + "일 마감되었습니다");
					System.out.println("다른 날짜를 선택해주세요");
				}else if(Check.get(c).checkin>sin && Check.get(c).checkin>sout) {
					System.out.println("예약되었습니다");
					Check.add(this);
					st=false; //while
					break; ///for문
				}else if(Check.get(c).checkout<sin && Check.get(c).checkout<sout) {
					System.out.println("예약되었습니다");
					Check.add(this);
					st=false;
					break;
					
				}
			}
		}
	}
}
