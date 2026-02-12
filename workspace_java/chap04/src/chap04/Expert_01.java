package chap04;

public class Expert_01 {

	public static void main(String[] args) {

		// 심화1
		// 1부터 5까지 출력
//		int a = 11;
//		for(a=1;a<=5;a++) {
//			System.out.println(a);
//		}
		// 심화2
		// 5부터 1까지 출력

//		int b=5;
//		for(b=5;b>=1;b--) {
//			System.out.println(b);
//		}
		// 심화3
		// 1부터 16까지
		// 3의배수출력하고
		// 총 몇개인지 출력
		// c에 3의 배수 개수 넣기
		// d 1~16 출력
		// d 3의 배수 출력
		// c에 3의배수 거르고 한번에 나오게
		int c = 0;
		for (int d = 1; d <= 16; d++) {// 1~16
			
			if (d % 3 == 0) {// 3배수 거르기
				System.out.println(d);
				c=c+1;
			}
			
			
		}
		
		System.out.println(c);

	}
}
