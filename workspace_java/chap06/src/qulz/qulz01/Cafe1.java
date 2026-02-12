package qulz.qulz01;

import java.util.Scanner;

public class Cafe1 {
	
	//커피, 스무디
	int coffee = 0;
	int smoothie = 0;
	int select = 0;
	int options = 0;
	int coffeeprice = 0;
	int smoothieprice = 0;
	int reset = 0;
	Scanner scan = new Scanner(System.in);
	
	void run () {
		int a = scan.nextInt();
		while(true) {
			menu();
			select(a == 2){
				
			};
//			options();
//			basket();
			pay ();
		}
		
	}
		Cafe1(int coffee, int smoothie, int reset){
			this.coffee=coffee;
			this.smoothie=smoothie;
			this.reset=reset;
		}	
	
	
		void menu() {
			System.out.println("=====================");
			System.out.println("메뉴를 선택해 주세요");
			System.out.println("1커피" + "2스무디");
			System.out.println("=====================");
		
		}
		
		void select(int scan) {
			this.select=select;
			if(this.coffee == select) {
				System.out.println("커피");
				System.out.println("=====================");
				System.out.println("옵션을 선택해 주세요");
				System.out.println("1차갑게"+"2따뜻하게" + "0종료");
				System.out.println("=====================");
			}else if(this.smoothie == select) {
				System.out.println("스무디");
				System.out.println("=====================");
				System.out.println("옵션을 선택해 주세요");
				System.out.println("1블루베리"+"2스트로베리" + "0종료");
				System.out.println("=====================");
			}else if(this.reset==select) {
				System.out.println("=====================");
				System.out.println("처음화면으로 돌아갑니다");
				System.out.println("=====================");
				this.coffee = 0;
				this.smoothie = 0;
				this.select = 0;
				this.options = 0;
				System.out.println("=====================");
				System.out.println("메뉴를 선택해 주세요");
				System.out.println("1커피" + "2스무디");
				System.out.println("=====================");
			}
		}
	
		void options(int options) {
			this.options=options;
			if(this.coffee == select) {
				this.coffeeprice = 3000;
				if(1==options) {
					System.out.println("아이스 커피");
				}else if(2==(options)) {
					System.out.println("커피");
				}
			}
			if(this.smoothie == select) {
				this.smoothieprice = 5000;
				if(1==options) {
					System.out.println("블루베리 스무디");
				}else if(2==options) {
					System.out.println("스트로베리 스무디");
				}
			}
			if(this.reset==options) {
					System.out.println("=====================");
					System.out.println("처음화면으로 돌아갑니다");
					System.out.println("=====================");
					this.coffee = 0;
					this.smoothie = 0;
					this.select = 0;
					this.options = 0;
					System.out.println("=====================");
					System.out.println("메뉴를 선택해 주세요");
					System.out.println("1커피" + "2스무디");
					System.out.println("=====================");
				}
		}
	
//		void reset() {
//			System.out.println("=====================");
//			System.out.println("처음화면으로 돌아갑니다");
//			System.out.println("=====================");
//			int coffee = 0;
//			int smoothie = 0;
//			int select = 0;
//			int options = 0;
//			System.out.println("=====================");
//			System.out.println("메뉴를 선택해 주세요" + "0종료");
//			System.out.println("1커피" + "2스무디");
//			System.out.println("=====================");
//		}
	
	

		void basket (int select) {
			if(this.select == 1 && this.options == 1) {
				System.out.println("=====================");
				System.out.println("아이스 커피" + "0종료");
				System.out.println(this.coffeeprice);
				System.out.println("=====================");
				if(this.reset==select) {
					System.out.println("=====================");
					System.out.println("처음화면으로 돌아갑니다");
					System.out.println("=====================");
					this.coffee = 0;
					this.smoothie = 0;
					this.select = 0;
					this.options = 0;
					System.out.println("=====================");
					System.out.println("메뉴를 선택해 주세요");
					System.out.println("1커피" + "2스무디");
					System.out.println("=====================");
				}
			}else if(this.select == 1 && this.options == 2) {
				System.out.println("=====================");
				System.out.println("커피" + "0종료");
				System.out.println(this.coffeeprice);
				System.out.println("=====================");
				if(this.reset==select) {
					System.out.println("=====================");
					System.out.println("처음화면으로 돌아갑니다");
					System.out.println("=====================");
					this.coffee = 0;
					this.smoothie = 0;
					this.select = 0;
					this.options = 0;
					System.out.println("=====================");
					System.out.println("메뉴를 선택해 주세요");
					System.out.println("1커피" + "2스무디");
					System.out.println("=====================");
				}
			}else if(this.select == 2 && this.options == 1) {
				System.out.println("=====================");
				System.out.println("블루베리 스무디" + "0종료");
				System.out.println(this.smoothieprice);
				System.out.println("=====================");
				if(this.reset==select) {
					System.out.println("=====================");
					System.out.println("처음화면으로 돌아갑니다");
					System.out.println("=====================");
					this.coffee = 0;
					this.smoothie = 0;
					this.select = 0;
					this.options = 0;
					System.out.println("=====================");
					System.out.println("메뉴를 선택해 주세요");
					System.out.println("1커피" + "2스무디");
					System.out.println("=====================");
				}
			}else if(this.select == 2 && this.options == 2) {
				System.out.println("=====================");
				System.out.println("스트로베리 스무디" + "0종료");
				System.out.println(this.smoothieprice);
				System.out.println("=====================");
				if(this.reset==select) {
					System.out.println("=====================");
					System.out.println("처음화면으로 돌아갑니다");
					System.out.println("=====================");
					this.coffee = 0;
					this.smoothie = 0;
					this.select = 0;
					this.options = 0;
					System.out.println("=====================");
					System.out.println("메뉴를 선택해 주세요");
					System.out.println("1커피" + "2스무디");
					System.out.println("=====================");
				}
			}
		}
	
		void pay () {
			if(this.select == 1 && this.options == 1 && this.select == 1 && this.options == 2) {
				System.out.println("=====================");
				System.out.println(this.coffeeprice+"원");
				System.out.println("=====================");
			}else if(this.select == 2 && this.options == 1 && this.select == 2 && this.options == 2) {
				System.out.println("=====================");
				System.out.println(this.smoothieprice+"원");
				System.out.println("=====================");
			}	
		}
	
}
