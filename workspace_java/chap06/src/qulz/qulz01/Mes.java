package qulz.qulz01;

public class Mes {

	String item;
	String item1;
	
	Mes(String item){
		this.item=item;
	}
	
	String store(String item1) {
		this.item1=item1;
		return this.item;
	}
	
	
	
	void run() {
		System.out.println(this.item+"생산 완료");
		System.out.println(this.item1+"생산 완료");
	}
	
	
	
}
