package Pokemon;

import java.util.ArrayList;

public class Trainer {

	/*
	 * 트레이너란 만들어서 포켓몬과 트레이너 따로두기
	 * 포켓몬칸에 포켓몬 만들고 능력치칸에 각 포켓몬 능력치 만들고
	 * 트레이너가 여섯마리의 포켓몬을 가질수있는 리스트를 만들자
	*/
	ArrayList<PoKeMonster> red = new ArrayList<PoKeMonster>();
	ArrayList<PoKeMonster> green = new ArrayList<PoKeMonster>();
	Trainer(){
	red.add(new PoKeMonster("피카츄", new Status(35, 110, 40, 100, 50, 90)));
	red.add(new PoKeMonster("리자몽", new Status(78, 84, 78, 109, 85, 100)));
	red.add( new PoKeMonster("거북왕", new Status(79, 83, 100, 85, 105, 78)));
	red.add( new PoKeMonster("이상해꽃", new Status(80, 82, 83, 100, 100, 80)));
	red.add( new PoKeMonster("라프라스", new Status(130, 85, 80, 85, 95, 60)));
	red.add( new PoKeMonster("잠만보", new Status(160, 110, 65, 65, 110, 30)));
	
//		red.add(Charizard);
//		red.add(Bulbasaur);
//		red.add(Venusaur);
//		red.add(Lapras);
//		red.add(Snorlax);
	/////////////////////////////////////////////////////////////////////////////////////
	
	green.add( new PoKeMonster("윈디", new Status(90, 110, 80, 100, 80, 95)));
	green.add( new PoKeMonster("갸라도스", new Status(95, 125, 79, 60, 100, 81)));
	green.add( new PoKeMonster("프테라", new Status(80, 105, 65, 60, 75, 130)));
	green.add( new PoKeMonster("후딘", new Status(55, 50, 45, 135, 95, 120)));
	green.add(new PoKeMonster("괴력몬", new Status(90, 130, 80, 65, 85, 55)));
	green.add( new PoKeMonster("나시", new Status(95, 95, 85, 125, 75, 55)));
	
//		green.add(Arcanine);
//		green.add(Gyarados);
//		green.add(Aerodactyl);
//		green.add(Alakazam);
//		green.add(Machamp);
//		green.add(Exeggutor);
	}
	/////////////////////////////////////////////////////////////////////////////////////
//	ArrayList<PoKeMonster> green = new ArrayList<PoKeMonster>();
//	void green() {		
//		PoKeMonster greenpoke = new PoKeMonster();
//			for(int p=0; p<6; p++) {
//				green.add(greenpoke.greenpokemon[p]);
//			}
//	}
}
