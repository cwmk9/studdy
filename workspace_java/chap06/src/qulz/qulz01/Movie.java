package qulz.qulz01;

public class Movie {

	// 문제3 #메소드
		// 영화 관리
		// 제목, 개봉년도
		// 메소드를 통해서
		// - 각 값을 따로 받아서 따로 저장하기
		// 	+ 제목만 받아서 필드에 저장하는 메소드
		// - 각 값을 하나만 돌려주는 메소드
		//	+ 제목만 돌려주는 메소드
		// - 모든 정보를 이쁘게 출력
		// - 속편정
		//	 + 원래제목에 "2"를 붙여서 돌려주는 메소드
		// 2개 이상의 영화를 관리해보자
		
		String title;
		int year;
		String 속편정보;
		void setTitle (String title) {
			this.title= title;
		}
		
		void setYear(int year) {
			this.year = year;
		}
		
		String getTitle(){
			return this.title;
		}
		
		int getyear() {
			return year;
		}
		
		String 속편정보() {
			return title + 2;
		}
	
}
