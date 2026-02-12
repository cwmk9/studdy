package Quiz.Quiz02;

import java.util.ArrayList;
import java.util.Scanner;

public class Room {
	
	int people;
	int pet;
	int bbq;
	
	
	
	
	Room() {
		Scanner scan = new Scanner(System.in); 
		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		System.out.print("입실하실 인원을 입력해주세요");
		int people = scan.nextInt(); 
		System.out.print("반려동물 동행 하십니까?");
		System.out.print("1.동행 2.없음");
		int pet = scan1.nextInt();
		System.out.print("bbq장 사용 여부를 알려주세요");
		System.out.print("1.사용 2.미사용");
		int  bbq = scan2.nextInt();
		this.people=people;
		this.pet=pet;
		this.bbq=bbq;
		if(pet==1 && bbq==1) {
		System.out.println("인원:" + this.people + " 동물:동행 "  + "bbq:사용");
		}else if(pet==2 && bbq==1) {
		System.out.println("인원:" + this.people + " 동물:없음 "  + "bbq:사용");	
		}else if(pet==1 && bbq==2) {
		System.out.println("인원:" + this.people + " 동물:동행 "  + "bbq:미사용");	
		}else if(pet==2 && bbq==2) {
		System.out.println("인원:" + this.people + " 동물:없음 "  + "bbq:미사용");	
		}
	}
	
	
	
}
