package qulz.qulz01;

import java.util.Scanner;

public class Pen {
	
	// 문제7
    // 선풍기Fan
    // + 전원 켜는 기능
    // + 전원 끄는 기능
    // + 약풍
    // + 강풍
    // 단, 전원이 켜진 상태에서만 바람이 나옵니다
    // FanExam 약풍 실행
	// 0과 1로 on off 만들기; 
	// 약풍 강풍 스캐너?
	// on일때 if로 약풍 강풍 선택할수있게
	
	
	
//	boolean on;
//	boolean off;
//	int 강풍 = 0;
//	int 약풍 = 1;
	
//	void pen(boolean on, boolean of){
//		this.on = true;
//		this.off = false;
//		if(on) {
//			System.out.println("전원 켜짐");
//			if(강풍==0) {
//				System.out.println("강풍");
//			}else if(약풍==1) {
//				System.out.println("약풍");
//			}
//		}else if(off) {
//			System.out.println("전원 꺼짐");
//		}
//	}
	Scanner scan =new Scanner(System.in);
	String on = "켜짐";
	String off = "꺼짐";
	String power = "강풍";
	String weak = "약풍";

//	void fan () {
//		if(on==0) {
//			System.out.println("전원 켜짐");
//			if(power.equals("강풍")) {
//				System.out.println(power);
//			}else if(weak.equals("약풍")) {
//				System.out.println(weak);
//			}
//		}else if(off==1) {
//			System.out.println("전원 꺼짐");
//		}
//	}
	
	
	void on(String on) {
		this.on=on;
		if(on.equals(on)) {
			 printon();
			 String scan1 = scan.nextLine();
			 if(scan1.equals(power)) {
				 printpower();
			 }else if(scan1.equals(weak)) {
				 printweak();
			 }
		}
	}
	void off(String off) {
		this.off=off;
		if(off.equals(off)) {
			printoff();
		}
	}
	
	void printon() {
		System.out.println(this.on);
	}
	void printoff() {
		System.out.println(this.off);
	}
	void printpower() {
		System.out.println(this.power);
	}
	void printweak() {
		System.out.println(this.weak);
	}
	
	
	
	
	
	
	
	
	
	
	
}
