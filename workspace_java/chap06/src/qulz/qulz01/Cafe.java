package qulz.qulz01;

public class Cafe {


	// 문제4 #생성자
	// 카페 창업
	// 상호, 필요자본금, 메뉴1, 메뉴2
	// 생성할 때 상호와 필요자본금을 꼭 입력해야 생성되도록
	// 그리고 생성과 동시에 메뉴1에느 "아아", 메뉴2는 "따아"
	String mutual; 
	int money; 
	String menu1;
	String menu2;
	
	Cafe(String moneycafe, int money){
		this.mutual = moneycafe;
		this.money = money;
		
		this.menu1="아아";
		this.menu2="뜨아";
		
	}
}
