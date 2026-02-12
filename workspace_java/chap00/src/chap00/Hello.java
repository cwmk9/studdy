package chap00;

public class Hello {

	//한줄 주석
	/* 범위 주석 */
	/*
	 * 여러줄 가능
	 */
	/**
	 * jabadoc 주석
	 * @param args
	 */
	/*
	 * 주석과 출력이 가장 중요하다
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world"); //출력
		

		// 문제 7
        /*
         * 숫자 39503
         * ---------
         * 출력 결과
         * ---------
         * "만의 자리 : 3
         * "천의 자리 : 9
         * "백의 자리 : 5"
         * "십의 자리 : 0"
         * "일의 자리 : 3"
         */
		
		int num = 39503;
		int n10000 = num / 10000;
		int n1000 = (num-(n10000 * 10000)) / 1000;
		int n100 = (num-(n10000 * 10000)-(n1000 * 1000)) / 100;
		int n10 = (num-(n10000 * 10000)-(n1000 * 1000)-(n100 * 100)) / 10;
		int n1 =(num-(n10000 * 10000)-(n1000 * 1000)-(n100 * 100)-(n10 * 10)) / 1;
		System.out.println("만자리 : " + n10000);
		System.out.println("천자리 : " + n1000);
		System.out.println("백자리 : " + n100);
		System.out.println("십자리 : " + n10);
		System.out.println("일자리 : " + n1);
		
			
	}	
}