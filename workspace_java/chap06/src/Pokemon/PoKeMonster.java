package Pokemon;

import java.util.ArrayList;

public class PoKeMonster {
//	String[] redpokemon = new String[] {"피카츄","리자몽","이상해꽃",
//										"거북왕","라프라스","잠만보"};
	String name;
	Status status;
	PoKeMonster (String name,Status status) {
		this.name=name;
		this.status=status;
	}
	
	public String toString() {
	    return name;
	}
	
	
	
////////////////////////////////////////////////////////////////////////////////////////////
	
//	String[] greenpokemon = new String[] {"윈디", "나시","갸라도스",
//										  "프테라","후딘","괴력몬"};
//	
//	
//	PoKeMonster(String redpokemon1,Status status) {
//		for(int p=0; p<6; p++) {
//			greenpokemon[p]=greenpokemon[p];
//			this.redpokemon1=redpokemon1;
//			this.status=status;
//		}
//	}
}
