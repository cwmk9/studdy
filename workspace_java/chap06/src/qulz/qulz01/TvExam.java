package qulz.qulz01;

public class TvExam {

	public static void main(String[] args) {

		Tv tv = new Tv();
		
		tv.on();
		tv.off();
		tv.on();
		tv.volumeup();
		tv.volumeup();
		tv.volumeup();
		tv.volumeup();
		
		tv.volumedown();
		tv.volumedown();
		
		tv.channel();
		
		tv.status();
		
		tv.off();
		
		tv.status();
		tv.off();
		tv.status();
		tv.on();
		tv.status();
		tv.off();
		tv.status();
	}

}
