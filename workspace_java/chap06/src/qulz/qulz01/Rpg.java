package qulz.qulz01;

public class Rpg {
	// 문제13
    // MES
    // [Item]-제품
    //    필드: 이름
    //    생성자: 이름 필수
    //    메소드: 이름 리턴
    // [Process]-공정(일하는 방법 또는 순서)
    //    메소드명: run
    //    전달인자: Item
    //      리턴타입: 없음
    //    하는일: Item이름+" 생산 완료" 출력
    // [Execution]-실행
    //    메소드: main 보유
    //    제품1, 제품2 만들어서
    //    공정의 run에 넣기
	// String으로 아이템 생성 void로 item받기 받고 생산완료 출력
	// 
	
	String item;
	
	Rpg(){
	}
	
	void run(String item) {		
		this.item=item;
		if(item==this.item) {
			System.out.println(this.item + "생성완료");
		}
	}

	Rpg[] st = new Rpg[5];
	Rpg[] store() {
		Rpg st1 = new Rpg();
		st1.run("sword");
		Rpg st2 = new Rpg();
		st2.run("bow");
		Rpg st3 = new Rpg();
		st3.run("hammer");
		return new Rpg[] {st1, st2, st3};
	}

	



}
