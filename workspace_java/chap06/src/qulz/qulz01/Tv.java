package qulz.qulz01;

import java.util.Scanner;

public class Tv {
	
	// 문제11
    // TV 만들기
    // 전원, 볼륨up, 볼륨down(0~10), 채널(직접입력)
    // (볼륨이 0일 때 down누르면 0 유지)
    // 현재상태보기: 현재 전원, 볼륨, 채널 값 표시
	// +전원 +볼륨up +볼륨down +채널scan
	Scanner scan =new Scanner(System.in);
	int volume = 0;
	int channelcount = 0;
	boolean onoff = false;
	
	void on() {
		onoff = true;
		System.out.println("전원 켜짐");
		
	}

	void off() {
		onoff = false;
		System.out.println("전원 꺼짐");
	}
	
	void volumeup() {
		volume++;
		if(volume!=11 && volume<=10) {
			System.out.println(volume);
		}else if(volume>=11) {
			System.out.println("더이상 볼륨을 높일수 없다");
		}
	}

	void volumedown() {
		volume--;
		if(volume!=-1 && volume>0) {
			System.out.println(volume);
		}else if(volume<=-1) {
			System.out.println("더이상 볼륨을 낮출수 없다");
		}
	}

	void channel() {
		int scan1 = scan.nextInt();
		channelcount=scan1;
		System.out.println(channelcount+"번");
	}
	
	void status() {
		if(onoff) {
			System.out.println("전원: 켜짐 " + "채널 " + channelcount + "볼륨 " + volume);
		}else if(onoff) {
			System.out.println("전원: 꺼짐");
		}
	}
}
