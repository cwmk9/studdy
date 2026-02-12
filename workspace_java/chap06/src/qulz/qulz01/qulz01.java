package qulz.qulz01;

public class qulz01 {
	
	// 문제2
	// 멜론 음악 차트를 관리하는 시스템
	// 목록을 관리 하기 위해 클래스를 만들기로 했습니다
	// 제목, 가수명, 엘범명, 가사, 시간(초단위)
	// - 곡 2곡 이상의 정보를 저장하고
	// - 각 곡의 정보를 출력
	
	String title;// 이거만으로도 충분
	void title(String title) { //지금하는거에 this는 필요없음
		this.title=title;
	}
	

	String singer;// 이거만으로도 충분
	void singer( String singer) {//지금하는거에 this는 필요없음
		this.singer=singer;
	};

	
	String album;// 이거만으로도 충분
	void album (String album) {//지금하는거에 this는 필요없음
		this.album=album;
	}

	
	String lyrics;// 이거만으로도 충분
	void lyrics(String lyrics) {//지금하는거에 this는 필요없음
		this.lyrics=lyrics;
	}
	
	
	int time;// 이거만으로도 충분
	void time(int time) {//지금하는거에 this는 필요없음
		this.time=time;
	}
	
//	String album(String title, String singer, String album, String lyrics, int time ) {
//		album = "타입캡슐";
//		title = "타임캡슐";
//		singer = "다비치";
//		lyrics = "우가우가";
//		time = 50;
//	}
	

}
