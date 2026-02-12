package chap05;

public class ArrayExam_02 {

	public static void main(String[] args) {
	
		/*
		 * 배열 array
		 * 
		 * 한번에 여러 변수를 만드는 방법
		 * 같은타입만 선언할 수 있음
		 * 생성할 때 전체 크기를 지정해줘야 함
		 * 생성된 여러 변수들은 index로 관리한다
		 * 		index는 0번부터 시작
		 */
		
		// 배열을 선언하는 첫번째 방법
		int[] a1; //java 스타일
		int a2[]; //c언어 스타일
		
		//배열 변수는 참조 타입이라서 null을 넣을 수 있다
		a1 = null;
		
		int score_0 = 90;
		int score_1 = 85;
		int score_2 = 80;
		/*
		 * int[] score = new int[30];
		 * 첫번째[] : int[]
		 * 		int만으로 구성된 배열 변수 타입이다
		 * 두번째[] : new int[30]
		 * 		배열의 크기. 즉, 한번에 만들 변수의 개수
		 * 세번째 [] : score[0]
		 * 			만들어진 변수 중에서 몇번째인가?
		 * 			imdex는 0부터 시작된다
		 */
		int[] score = new int[30]; //0~29까지
		score[0] = 90;
		score[1] = 85; 
		score[2] = 80; 
//		score[3] = null; //int이기 때문에 널이 들어갈 수 없음
		
		System.out.println("score[0]: " + score[0]);
		
		//ArrayIndexOutOfBoundsException
//		score[30] = 2; //0~29까지 선언해서 넘어가면 오류
		
		String[] str = new String[3];
		System.out.println("str[0]: "+ str[0]);
		System.out.println("score[5]: "+ score[5]);
		
		// 배열 생성 후 기본값
		// 0, false, nul로 초기화 됨
	
		// 배열을 선언하는 두번째 방법
		// 넣을 값을 모두 알고 있는 경우
		int[] i1 = new int[] {90, 85, 70};
		System.out.println("i1[1]: " + i1[1]);
		
		//선언과 초기화를 따로 할 수 있다
		int[] i2 = null;
		i2 = new int[] {90, 85, 70};
		
		//배열을 선언하는 세번째 방법
		// 선언과 동시에 초기화 하는 경우만 사용가능
		int[] i3 = {90, 85, 70};
		
		int sum = 0;
//		sum = sum + i3[0];
//		sum = sum + i3[];
		
//		for(int i=0; i<=2)
		for(int i=0; i<3; i++) {
			sum = sum + i3[i]; //i가 늘어나면서 자동으로 변수가 바뀜
		}
		System.out.println("총 합: " + sum);
		System.out.println("평 균: " + sum/3.0);
		System.out.println("배열의 길이: " + i3.length);
		sum=0;
		for(int i=0; i<i3.length; i++) {
			sum = sum + i3[i];
		}
		
		// 5개 변수를 한번에 만들기
		// 5개 크기의 int 배열 만들기
		int[] a5 = new int[5];
		// 첫번째 변수에 1넣기
		// 첫번째 변수에 2넣기
		a5[0] = 1;
		a5[1] = 2;
		
		
		
		// 문제1
		// 첫번째 반복문에서
		//		10개의 변수에 각 1~10 값 담기
		// 포문이 돌면서 []안에 숫자 늘리기
		
		
		int[] z = new int[10];
		z[0] = 1;
//		for(int b=0; b<10; b++) {
//			 	z[b]=b+1;
//		}
		// 두번째 반복문에서
		// 		모든 값을 순서대로 출력
		for(int b=0; b<z.length; b++) {
			z[b]=b+1;
			System.out.println(z[b]);
		}
		
//		a10.length = 4; // 변경 불가
		
		//null인지 확인용 출력
		System.out.println("args: " + args);
		
		//args의 개수 출력
		System.out.println("args: " + args.length);
		
		//args의 모든 내용 출력
		for(int b=0; b<args.length; b++) {
			System.out.println("args: " + args[b]);
		}
		
		// 문제2
		// 7, 12, 8,을 순서대로 저장한 배열이 있을 때
		// 다른 배열에도 7, 12, 8,로저장되게 복사
		// 단 b = a 안됨
		// []하나씩 더해서 
		// q[1][2][3]하나 식나오게 하고 w적용
		int[] q = new int[] {7, 12, 8};
		int[] w = new int[3];
//		for(int a=0; a<q.length; a++) {
//				w[a]=q[a];
//				System.out.println(w[a]);
//		}
	
		// 문제3
		// 7, 12, 8,을 순서대로 저장한 배열이 있을 때
		// 다른 배열에 거꾸로 8, 12, 7로 저장되게
		// []하나씩 빼가 w적용 정지버튼 .length로하면 정지안되서 0으로
//		w[0]=q[2];
//		w[1]=q[1];
		//[]합이 2
		//q[2]에 w[0]이 들어가야함
		q = new int[] {7, 12, 8};
		w = new int[3];//.length가 3개의 숫자를 가져 3의 수치를 가짐
		for(int a=0; a<q.length; a++) {
			w[a]=q[(q.length)-a-1];
		}
		System.out.println("3: " + w[0]);
		System.out.println("3: " + w[1]);
		System.out.println("3: " + w[2]);
		
		// 문제4
		// {3,4,7,5,1,4,6}
		// 4-1 배열에서 홀수의 개수 구하기
		// m[]%2나온거 거르기
		int[] m = new int[] {3,4,7,5,1,4,6};
		int m1 = 0;
		for(int a=0; a<m.length; a++) {
			if(m[a]%2==1) {
				System.out.println("4: " + m[a]);
				m1=m1+1;
			}
			
		}
		System.out.println(m1+"개");
		int m2 =0;		
		// 4-2 4보다 큰 수의 개수 구하기 
		for(int a=0; a<m.length; a++) {
			if(m[a]>4) {
				System.out.println("4: " + m[a]);
				m2=m2+1;
			}
		}
		System.out.println(m2+"개");
		
		// --- 응용 (멘탈 챙길 문제) ---
		// 문제5(어려움)
		/*
		 * 마라톤에서 5명의 선수가 참여했음
		 * 선수들은 1번부터 5번까지 등번호가 있음
		 * 대회가 끝났을 때 완주하지 못한 선수를 찾으시오
		 * 완주 목록 {2,4,5,1}
		 * 스앵님 풀이  
		 */
		int[] t = {2,4,5,1};
		for (int y=1; y<=5; y++) {
			boolean falg = false; //밑에 falg가 true가 된걸 초기화
			for(int u=0; u<t.length; u++) {
				if(t[u] == y) {
					falg=true;//조건이 만족하면 true
					break; // 없어도 되지만 앞에 동일한 숫자가 나오면 뒤에
				}			//동작은 무의미 해져서
			}
			if(!falg) { //위에서 만족하는 조건이 없으면 작동
				System.out.println("빠진 번호: " + y);
			}
		}
		

		// 문제6
		// {3,4,7,5,1,4,6} 여기서 가장 큰 수 찾기
		// 방법을 못찾는 중 일단 다 나열해
		// s[a]보다 다음에온 s[a]가 크면 교체되게
		// 큰 수가 왓을때 고정을 어케 시키지
		// gpt한테 힌드 물어봐서 출력문을 밖으로 빼야한단 것
		// if조건을 살작 손봄
		int[] s = new int[] {3,4,7,5,1,4,6};
		int n = s[0]; 
		for(int a=0; a<=s.length-1; a++) {
			//초기화 식이 없기 때문에 n에 저장된 수를 가지고 있음
			if(n<s[a]) {
				n=s[a]; //n이 저장되고 한번더 출발
			}
			
		}	
		System.out.println(n); //마지막에 온 7이 
								   //n을 덮어써서 7출력
		
	
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
