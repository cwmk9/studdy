package chap05;

public class 다차원배열Exam_03 {

	public static void main(String[] args) {

//		int a0 =5;
//		int a1 = 15;
//		int a2 = 34;
//		
//		int[] b0 = new int[3];
//		//b의 첫번째 변수에 a0 넣기
//		b0[0] = a0;
//		b0[1] = a1;
//		b0[2] = a2;
//		
//		int[] b1 = new int[3];
//		b1[0] = a0+1;
//		b1[1] = a1+1;
//		b1[2] = a2+1;
//		
//		//b0와 b1을 배열로 만들기 
//		int[] [] c0 = new int[2][3];//두개의 배열이 있고 각각 3개의 배열이 있다
////		int[] [] c0 = new int[2][];//이해 못햇는데 위에꺼만 알아도 됨
//		c0[0] = b0;					
//		c0[1] = b1;
//		
//					//b0의 b[2]를 가져와라
//		System.out.println("c0[0][2]: " + c0[0][2]);
//		
//		System.out.println("c0.length: " + c0.length);
//		System.out.println("c0[2].length" + c0[1].length);
//		
//		int[][] c1 = new int[][] {{1,2,3},new int[]{4,5,6}};
//		int[][] c2 = {
//				{1,2,3},
//				{4,5,6,7},
//				};
//		
//		int[][] arr = new int[2][];
//		// 가장 바깥 차원은 꼭 있어야 한다
//		// heep에 공간은 만들어야 해서
//		// 모두 null로 초기화
//		// 참조 공간만 만들고 실제 배열은 나중에 만들기
//		// 가변(비정형) 배열
//		// 공간을 연속으로 잡지 않아서 고성능에서는 불리 할 수 있다
//		// 몰라도 된다
//		
//		System.out.println(c0);
//		System.out.println(c0[0]);
//		System.out.println(c0[0][0]);
//		///////////////////////////////////////////////////////////
//		System.out.println("______________________________________");
//		int[] d1 = {1,2,3};
//		// 얕은 복사(call by reference)
//		// = 기호는 stack의 값 (또는 주소)만 복사
//		// 값을 변경하는 경우 원본도 바뀐다
//		int[] d2 = d1;
//		System.out.println("d2[0]"+d2[0]);
//		d1[0]= 4;
//		System.out.println("d2[0]"+d2[0]);		
//		
//		System.out.println("d2[0]"+d1[2]);
//		d2[2]= 4;
//		System.out.println("d2[0]"+d1[2]);		
//		
//		// 깊은 복사(call by value]
//		int[] d3 = new int[d1.length];
//		for(int i=0; i<d1.length; i++) {
//			d3[i] = d1[i];
//		}
//	
//		// 문제1
//		// 꼭 반복문 쓰기
//		// 1~5, 11~15, 101~105 을 저장하는 2차원 배열을 만드시오
//		// 그리고 거기말고 다른 반복으로 모두 출력하시오
//		// d에 [][]
//		int[] a = new int [5];
//		int[] b = new int [5];
//		int[] c = new int [5];
//		int[][] d = {
//				a,
//				b,
//				c
//		};
//		int[][][] e = {d,d
//				};
//		int[][][][] f = {e,e,e,e};
//		// e = new int[1][3][5]
//		
//		for(int ao=0; ao<a.length; ao++ ) {
//			a[ao]=ao+1;
//			System.out.print(a[ao]+" ");
//		}
//		System.out.println();
//		//b[]에01234가 들어가는데 그때 b[0]일때 101이 들어가야함
//
//		for(int ao=0; ao<b.length; ao++ ) {
//			b[ao]=ao+11;
//			System.out.print(b[ao]+" ");
//		}
//		
//		System.out.println();
//		for(int ao=0; ao<c.length; ao++ ) {
//			c[ao]=ao+101;
//			System.out.print(c[ao]+" ");
//		}
//		
//		System.out.println();
//	
//		for(int ao=0; ao<d.length; ao++) {
//			for(int ap=0; ap<d[0].length; ap++) {
//				System.out.print(d[ao][ap]+" ");
//			}			
//		}
//
////		e[0][0][12345]
////		e[1][1][12345] 이러면 멈춤 
////		2중이 다돌고 3중이 돌라면?
//		
//				
//		System.out.println("3차");
//		
//		for(int ao=0; ao<e.length; ao++) {
//			for(int ap=0; ap<e[0].length; ap++) {
//				for(int as=0; as<e[0][0].length; as++) {
//						System.out.print(e[ao][ap][as]+" ");
//				}
//			}			
//		}
//			System.out.println();
//			System.out.println("4차");
//			int vc = 0;
//		for(int ao=0; ao<f.length; ao++) {
//			for(int ap=0; ap<f[0].length; ap++) {
//				for(int as=0; as<f[0][0].length; as++) {
//					for(int ad=0; ad<f[0][0][0].length; ad++) {
//					System.out.print(f[ao][ap][as][ad]+" ");
//					vc=vc+1;
//					}
//				}
//			}			
//		}
//		System.out.println(vc);
//			
//		//스앵님이랑
//		int[][] q1 = new int[3][5];
//		q1[0] = a;
//		q1[1] = b;
//		q1[2] = c;
//		for(int ao=0; ao<q1.length; ao++) {
//			for(int ap=0; ap<q1[0].length; ap++) {
//				System.out.print(q1[ao][ap]+" ");
//			}
//		}
//		System.out.println();
//		//3차원 배열
//		int[] one = new int[5];
//		int[] two = new int[5];
//		int[] three = new int[5];
//		int[] four = new int[5];
//		int[][] five = {one, two, three, four};
//		int[][][] six = {five};
		
		// 문제7
		// {3,4,7,5,1,4,6}
		// 여기서 두번째 큰 수 찾기
		// 저장할 변수 만들기
		// 하나씩 비교 후 큰수 저장 제일큰수 찾기
		// 두번째 이프로 큰수 찾기
		// 시행착오로 7뒤 숫자 안구해 지고 마지막 숫자만 구해졋었음
//		int[] a = {3,4,7,5,1,4,6};
//		int b = 0;
//		int c = 0;
//		for(int a1=0; a1<a.length; a1++) {
//			if(a[a1]>b) {
//				b=a[a1];
//			}else if(c<a[a1]) {
//				c=a[a1];
//			}
//		}
		int[] a = { 3, 4, 6, 7, 5, 1, 4 };
		int b = 0;
		int c = 0;
		for (int a1 = 0; a1 < a.length; a1++) {
			if (a[a1] > b) {
				b = a[a1];
			}
			for (int a2 = 0; a2 < a.length; a2++) {
				if (b > a[a2] && c<a[a2]) {//제일큰수 보다 작고 c보다 큰수
//					System.out.println("a" + a[a2]);
						c = a[a2]; // 7을 걸럿는데 왜
				} // else if(c<a[a2]) {//7이 걸러졋기 때문에 b에서 7이나옴
//					System.out.println("b"+a[a2]);
//					c=a[a2]; //c는 7이되기때문에 뒤에있는 5 1 4만 나옴

			}
		}
			System.out.println("첫번째로 큰수: "+b);
			System.out.println("두번째로 큰수: "+c);
			
		
		// 문제8
		// 오른쪽으로 한칸 씩 밀기 (왼쪽은 0으로 채우기)
		// 예 : 
		// 1라운드 : {3,4,7,5,1,4,6}
		// 2라운드 : {0,3,4,7,5,1,4}
		// 3라운드 : {0,0,3,4,7,5,1}
		//-----------전략------------
		// 우선 첫 포문으로 1라운드 출력
		// 2r3r담을 변수 준비 
		// 2r 0123456 담고 그 담에 [1]부터 해서 aq출력
		int[] aq = { 3, 4, 7, 5, 1, 4, 6 };
							   // 기본값이 0이기 때문에
//			for (int a1=0; a1<aq.length; a1++){
//				aq1[a1] = a1;//0123456담김
//				System.out.print(aq1[a1]+",");
//			for(int a3=aq.length-1; a3>0; a3--) {	
//				for(int a2=0;a2<=a3; a2++) {
//					aq1[a2]=aq[a2];
//					System.out.print(aq1[a2]+" ");
//				}
//				System.out.println();
//				for(int a2=0;a2<=a3; a2++) {
//					aq1[a2]=aq[a2];
//					System.out.print(aq1[a2]+" ");
//				}
//			}	
//					System.out.println();
//				for(int a1=2; a1<aq.length; a1++) {
//					aq1[a1]=aq[a1-2];
//					System.out.print(aq1[a1]);
//				}
//			}
		//세로줄 담당 //복습하기
		for(int aw = 0; aw<aq.length; aw++) {
				System.out.print(aq[aw]);
		}
		System.out.println();
		for(int aw = 0 ; aw<=aq.length-1; aw++) {				
			for(int ae = aq.length-1; ae>0; ae--) {
				aq[ae]=aq[ae-1];//가로줄에 들어갈 변수 채우기 담당
			}
			aq[0]=0;
			for(int ae= 0 ; ae<aq.length; ae++) {
				System.out.print(aq[ae]);
			}	
				System.out.println();
		}

//					aq1[aq.length-6+a2]=aq[a2];//aq1[1]에서부터aq[0]부터 차례로담김
//					System.out.print(aq1[a2]+" ");
				
				
		// 문제 9
		// 오른쪽으로 한칸 씩 밀기
		// 맨 끝 값은 맨 처음으로 
		// 예 :
		// 1라운드 : {3,4,7,5,1,4,6}
		// 2라운드 : {6,3,4,7,5,1,4}
		// 3라운드 : {4,6,3,4,7,5,1}
		
		// 문제 10
		// 임시 비밀번호 8자리
		// 10-1 : 숫자만
		// 10-2 : 소문자만
		// 10-3 : 숫자 2개 이상, 대/소문자 각 1개 이상
		
		// 문제11
		// 자리가 10개 있는 소극장의 예약 시스템
		// 자리 번호는 1~10번 까지 번호의 자리가 있다
		// 메뉴: "1.예약 2.모든 좌석 현황 3.잔여 좌석 0.종료
		// 조건1 : 예약이 가능하다면 "n번 자리 예약 되었습니다"
		// 조건2 : 예약이 되어있다면 "이미 예약 되어 있습니다"
		
		// 문제12
		// 로또 번호 6개 배열에 저장
		// 단, 중복 없이

		// 문제13
        // 주차장에 
        // 0: 주차되어있음
        // 1: 비어있음
        /*
         * {
         *         {0, 0, 0, 0},    // 1층
         *         {0, 0, 0, 1},    // 2층
         *         {1, 0, 1, 0},
         *         {1, 0, 1, 1},
         *         {1, 1, 1, 1},
         * }
         */
        // 13-1 : 2층에 주차된 차량 수 출력
        // 13-2 : 전체 남은 자리 수 출력
		
	
	}

}
