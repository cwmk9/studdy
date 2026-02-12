package sec05._this;

public class Singleton {

////	Singleton singleton = null;	
//	static Singleton singleton = null;	
//	
////	Singleton get() {
//	static Singleton get() {
//		if(singleton == null) {
//			singleton = new Singleton();
//		}
//		return singleton;
//	}
	
	static Singleton singleton = new Singleton();
	
	private Singleton() { }
	
	static Singleton get() {
		return singleton;
	}
}
