package qulz.qulz01;

import java.util.ArrayList;

public class Login {
 
	// 문제12
    // 로그인
    // 1. 회원가입 받기
    // 2. 로그인 하기
    // 3-1. 로그인 성공 시 "메인페이지" 출력
    // 3-2. 로그인 실패 시 "다시 로그인 하세요" 출력
    // 디테일
    // main에서 [회원]을 생성(단 아뒤,비번 없이 생성 불가능)상태창

    // [회원]목록이 필요하겠죠?
    // + 성공여부 로그인메소드(아뒤, 비번)
    // 로그인 성공 여부에 따라 3.의 조건에 맞게 출력
	//--------------------전략------------------------
	// 회원가입 메소드에 id pw 정보받기 
	// id pw 정보 저장해서 치면 메인페이지 출력
	// 저장한 정보와 다르면 다시 로그인 하세요
//	String id;
//	String pw;
	
	ArrayList<Member> login = new ArrayList<Member>();	
	//저장
	void log(String id, String pw) {// 회원가입
		Member member = new Member(id, pw);
		login.add(member);
		System.out.println("회원가입");
	}
	//저장된거 꺼내쓰기
	void log_in(String id, String pw) { //아이디입력
		for(int l = 0; l < login.size(); l++) {
//			login.get(0).id.equals(pw)
			if(login.get(l).id.equals(id) && login.get(l).pw.equals(pw)) {
				System.out.println("메인페이지");
			}else if(!(login.get(l).id.equals(id)) && login.get(l).pw.equals(pw)) {
				System.out.println("id 혹은 pw를 확인 해주세요");
			}else if((login.get(l).id.equals(id)) && !(login.get(l).pw.equals(pw))) {
				System.out.println("id 혹은 pw를 확인 해주세요");
			}
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
			