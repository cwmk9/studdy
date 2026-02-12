package chap05;

import java.util.AbstractQueue;
import java.util.Scanner;

public class ArraytestExam {

	public static void main(String[] args) {
		// 문제5(어려움)
		/*
		 * 마라톤에서 5명의 선수가 참여했음 선수들은 1번부터 5번까지 등번호가 있음 대회가 끝났을 때 완주하지 못한 선수를 찾으시오 완주 목록
		 * {2,4,5,1} 성범이 도움 받음
		 */
//		int[] a = { 2, 4, 5, 1 };
//		for (int a1 = 1; a1 <= 5; a1++) {// 모든선수
//			boolean b = false;
//			for (int a2 = 0; a2 < a.length; a2++) {// 완주한 선수
//				if (a1 == a[a2]) {// n번선수와 완주한선수중 n번이 있는지 비교
//					System.out.println("완주; " + a[a2]);
//					b = true;
//					break;
//				}
//			}
//			if (!b) {// b는 false이고 if는 true로 작동하기 때문에
//						// !로 true로 바꿔줌
//				System.out.println("노주: " + a1);
//			}
//		}

		System.out.println("_________________________________");
		/*
		 * 노주가 나오지 않는이유 위에거와 다른점 맨위에 포문에 내가 출력 할걸 넣어야 했음 내가 출력할건 모든 선수중 완주 못한선수 근데 내가 한건
		 * 완주한 선수중 모든선수를 비교해서 완주한 선수를 다시 뽑아냄
		 */
		// 랭스가 여기 있으면 0~4까지 밖에 돌리지못함
//		int[] a3 = { 2, 4, 5, 1 };// 그럼 5번이 탈락하거나 할때 판별 불가능
//		for (int a2 = 0; a2 < a3.length; a2++) {// 여긴 달린 전체 선수 수가 있어야함
//			boolean b = false;
//			for (int a1 = 1; a1 <= 5; a1++) {
//				if (a3[a2] == a1) {// 완주한 사람을 정해놓고 돌림
////0에서 4까지 돌면 조건에 다 부함함//12345가 a[]에 있는지를 판단 해야하는데
//					// a[]가 12345에 있는지 판단함
//					System.out.println("완주: " + a3[a2]);
//					b = true;
//					break;
//				}
//			}
//			if (!b) {// 즉 이게 나올일이 없음
//				System.out.println("노주: " + a2);
//			}
//		}

		// 문제8
		// 오른쪽으로 한칸 씩 밀기 (왼쪽은 0으로 채우기)
		// 예 :
		// 1라운드 : {3,4,7,5,1,4,6}
		// 2라운드 : {0,3,4,7,5,1,4}
		// 3라운드 : {0,0,3,4,7,5,1}
		// 세로만들고 값넣고 정방향 출력
//		int[] aq = { 3, 4, 7, 5, 1, 4, 6 };
//		for(int a1 = 0; a1<aq.length; a1++ ) {
//			for(int a2 = aq.length-1; a2>0; a2--) {
//					aq[a2]=aq[a2-1];
//			}
//			aq[0]=0;
//			for(int a4 = 0; a4< aq.length; a4++) {
//					System.out.print(aq[a4]+" ");
//			}
//				System.out.println();
//		}
		System.out.println("____________________________________________________");

		// 문제 9
		// 오른쪽으로 한칸 씩 밀기
		// 맨 끝 값은 맨 처음으로
		// 예 :
		// 1라운드 : {3,4,7,5,1,4,6}
		// 2라운드 : {6,3,4,7,5,1,4}
		// 3라운드 : {4,6,3,4,7,5,1}
//		for(int a1 = 0; a1<aq.length; a1++ ) {
//				aq[a1]=aq[a1];
//			System.out.print(aq[a1]+" ");
//		}
//		
//			System.out.println();
//
//		for(int a1 = 0; a1<aq.length; a1++ ) {
//			for(int a2 = aq.length-1; a2>0; a2--) {
//					aq[a2]=aq[a2-1];
//			}    //0123456  6543210
//			aq[0]=0;
//			for(int a4 = 0; a4< aq.length; a4++) {
//					System.out.print(aq[a4]+" ");
//			}
//					System.out.println();
//		}
			System.out.println("----------------------------------------------------------");
//			int[] aq = {3,4,7,5,1,4,6};
//			int count = 0;
//		for (int a1 = 0; a1 < aq.length+1; a1++) {
//			for (int a2 = 0; a2 < aq.length; a2++) {
//				System.out.print(aq[a2] + " ");
//			} // 0123456 6543210
////				aq[0]=aq[aq.length-1]; [0]이[6]으로 바껴서
//			// 0123456 => 6123456으로 밑에서 계산
//			count = aq[6];
//			for (int a4 = aq.length - 1; a4 > 0; a4--) {
//				aq[a4] = aq[a4 - 1];// 여기서 계산이 꼬임
//			} // [6]을[5]로바꿈
////				aq[0]=[aq.length-1];[0]이[6]이아닌[5]가됨
//			aq[0] = count;
//			System.out.println();
//		}
		System.out.println("_____________________________________");
		// 문제 10
		// 임시 비밀번호 8자리
		// 10-1 : 숫자만
//			int[] aw = new int[10];
//			int min = 0;
//			int max = 9;
//			for(int aa = 0; aa<aw.length-1; aa++) {
//				double random = Math.random();
//				int random1 = (int)(random*(max-min+1)+min);
//				aw[aa]=random1;
//				System.out.print(aw[aa]);
//			}
		System.out.println();
//		// 10-2 : 소문자만
////			String[] ae = new String[] {
////					"a","b","c","d","e","f","g",
////					"h","i","j","k","l","m","n",
////					"o","p","q","r","s","t","u",
////					"v","w","x","y","z"
////			};
////			int min1 = 0;
////			int max1 = 26;
////			for(int aa = 0; aa<8; aa++) {
////				double random = Math.random();
////				int random1 = (int)(random*(max1-min1+1)+min1);
////				System.out.print(ae[random1]);
////			}
////			System.out.println();
//		// 10-3 : 숫자 2개 이상, 대/소문자 각 1개 이상
////			int[] aw = new int[10];
////			int min = 0;
////			int max = 9;
//		// 문제 10
//		// 임시 비밀번호 8자리
//		// 내가 원하는건
//		// 조건만 채우면 규칙없이 나오는거
//		// 한번에 8자리가 나오게하고 조건이 맞으면 출력되게 하자
//		// 개수 이상을 어떻게 조건을 걸지
//		//
//		
////		int min3 = 0;
////		int max3 = 25;
////		int min4 = 0;
////		int max4 = 2;
////		int min5 = 0;
////		int max5 = 9;
////		
//////		double random = Math.random();
//////		int random1 = (int) (random * (max3 - min3 + 1) + min3);
//////		double random4 = Math.random();
//////		int random2 = (int) (random4 * (max4 - min4 + 1) + min4);
//////		double random5 = Math.random();
//////		int random3 = (int) (random5 * (max5 - min5 + 1) + min5);
////		String [] last = new String [8];
////		
////		for (int a4 = 0; a4 < 1; a4++) {
////			boolean flag = false;
////			String[] aw = new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };
////			int min = 0;
////			int max = 9;
////			for (int aa = 0; aa < aw.length; aa++) {
////				double random10 = Math.random();
////				int random20 = (int) (random10 * (max - min + 1) + min);
//////						System.out.print(aw[random1]);
////			}
////
////			String[] ae = new String[] { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p",
////					"q", "r", "s", "t", "u", "v", "w", "x", "y", "z" };
////			int min1 = 0;
////			int max1 = 25;
////			for (int aa = 0; aa < 8; aa++) {
////				double random10 = Math.random();
////				int random20 = (int) (random10 * (max1 - min1 + 1) + min1);
//////					System.out.print(ae[random1]);
////
////			}
////
////			String[] ar = new String[] { "A", "A", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P",
////					"Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };
//////				int min2 = 0;
//////				int max2 = 25;
//////				for(int aa = 0; aa<8; aa++) {
//////					double random = Math.random();
//////					int random1 = (int)(random*(max1-min1+1)+min1);
//////					
//////					
////////					System.out.print(ar[random1]);
//////				}
////			String[][] at = { aw, ae, ar };
////			int v = 0;
////			int y = 0;
////			int u = 0;
////
////			for (int ab = 0; ab <= 7; ab++) {
////				double random4 = Math.random();
////				int random1 = (int)(random4* (max3 - min3 + 1) + min3);
////				double random5 = Math.random();
////				int random2 = (int) (random4 * (max4 - min4 + 1) + min4);
////				double random6 = Math.random();
////				int random3 = (int) (random5 * (max5 - min5 + 1) + min5);
////				if (random2 == 0) {
////					last[ab] = at[0][random3];
////					v++;
////				} else if (random2 == 1) {
////					last[ab] = at[1][random1];
////					y++;
////				} else if (random2 == 2) {
////					last[ab] = at[2][random1];
////					u++;
////				}
////				
////				if (v >= 2 && y >= 1 && u >= 1) {
////					flag= true;
////				}else if (!(v >= 2 && y >= 1 && u >= 1)){
////					ab=0;
////				}
////				
//////					출력
//////					last[0~8]
////					
//////				else 
//////					도르마무	
////			}
////			if(flag) {
////			for(int av = 0; av <=7; av++ ) {
////				
////				System.out.print(last[av]);
////			}
////			}
////			
////		}
System.out.println("____________________________________________________________");
		
//		문제 10
//	 	임시 비밀번호 8자리
//	 	내가 원하는건
//	 	조건만 채우면 규칙없이 나오는거
//	 	한번에 8자리가 나오게하고 조건이 맞으면 출력되게 하자
//	 	개수 이상을 어떻게 조건을 걸지

	
//	int[] ch = new int[8];
//	while (true) {
//		int count0 = 0;
//		int count1 = 0;
//		int count2 = 0;
//		int count3 = 0;
//		for (int a = 0; a < 8; a++) {
//
//			int random0 = (int) (Math.random() * 4); // 가위바위보
//			if (random0 == 0) { // 숫자
//					int random1 = (int) (Math.random() * (57 - 48 + 1) + 48); // 48~57 숫자
//					ch[a] = random1;//배열에 저장
//					count0++;// if발생횟수 저장
//			} else if (random0 == 1) { // 소문자
//					int random2 = (int) (Math.random() * (122 - 97 + 1) + 97); // 97~122 소문자
//					ch[a] = random2;//배열에 저장
//					count1++;// if발생횟수 저장
//			} else if (random0 == 2) { // 대문자
//					int random3 = (int) (Math.random() * (90 - 65 + 1) + 65); // 65~90 대문자
//					ch[a] = random3;//배열에 저장
//					count2++;// if발생횟수 저장
//			} else if (random0 == 3) { // 특수기호
//					int random4 = (int) (Math.random() * (47 - 33 + 1) + 33); // 33~47 특수기호
//					ch[a] = random4;//배열에 저장
//					count3++;// if발생횟수 저장// if발생횟수 저장
//			}
//		}
//		
//		if (count0 >= 2 && count1 >= 1 && count2 >= 1 && count3 >= 1) {
//			break; //조건 맞을때 탈출용
//		}
//	}
//	for (int a = 0; a < 8; a++) {
//		System.out.print( (char)ch[a]);//저장된 수 차 로 아스키코드로 뽑기
//	}
//	System.out.println();

	// 문제11
			// 자리가 10개 있는 소극장의 예약 시스템
			// 자리 번호는 1~10번 까지 번호의 자리가 있다
			// 메뉴: "1.예약 2.모든 좌석 현황 3.잔여 좌석 0.종료
			// 조건1 : 예약이 가능하다면 "n번 자리 예약 되었습니다"
			// 조건2 : 예약이 되어있다면 "이미 예약 되어 있습니다"
				System.out.println("------------------------------------------");
	int[] aq = new int[11];

	while (true) {
		int count = 0;// 예약 카운트
		System.out.println("-------------------------------------------------");
		System.out.println("1.예약" + "2.모든 좌석" + "3.잔여 좌석" + "0.종료");
		System.out.println("-------------------------------------------------");
		Scanner scan = new Scanner(System.in);
		int scan1 = scan.nextInt();
		if (scan1 == 1) {
			System.out.println("-------------------------------------------------");
			System.out.println("예약하실 자리를 입력 해주세요");
			System.out.println("-------------------------------------------------");
			Scanner scan3 = new Scanner(System.in);
			aq[0]=-1;
			int scan2 = scan3.nextInt();
			if (aq[scan2] == 0) {
				aq[scan2] = 1;
				System.out.println(scan2 + "번예약되었습니다");
			} else if (aq[scan2] == 1) {
				System.out.println(scan2 + "번 예약이 만료되었습니다");
			} else if(aq[scan2]==-1) {
				System.out.println("0번 자리는 없습니다");
			}

			else if (aq[scan2] == 1) {
				System.out.println("예약이 만료 되었습니다");
			}else if (aq[0]==0) {
				System.out.println("0번 자리는 없습니다");
			}
		} else if (scan1 == 2) {
			System.out.println("총 10자리의 좌석이 있습니다");			
		} else if (scan1 == 3) {
			for (int a = 1; a <= 10; a++) {
				
				if(aq[a]==0) {
					System.out.println("잔여좌석" +	a + "좌석남았습니다");
				}
			}
		} else if (scan1 == 0) {
			System.out.println("종료합니다");
			break;
		} else {
			System.out.println("없는 항목 입니다");
		}
	}
	
	
	
}
}