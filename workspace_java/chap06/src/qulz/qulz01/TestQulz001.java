package qulz.qulz01;

public class TestQulz001 {

	public static void main(String[] args) {

		 // 문제 1
        // 내 나이를 저장
        int years = 28;
        // 문제 2
        // 운전면허가 있다/없다
        boolean 운전면허 = true;
        System.out.println("운전면허있다" + 운전면허);
        // 문제 3
        // 우리집에 있는 스마트 폰의 개수
        int count = 0;
       String[] phone = new String[] {"부 ","모 ","누나 ","나"};
       for (int a = 0; a<phone.length; a++ ) {
    	   count++;    	   
    	   System.out.print(phone[a]);
       }
       System.out.println();
       System.out.println(count + "개");
        // 문제 4
        // 내 이름 저장
        String name = "김민권";
        // 문제 5
        // 1평은 3.3제곱미터입니다. 
        // 5평이 몇 제곱미터인지 계산해서 저장
        double 일평 = 3.3;
        double 오평 = 일평*5;
        System.out.println(오평 + "제곱미터");
        
     // 문제 6
        // 6-1 : 두 변수 x, y에 각각 숫자를 넣고
        //    출력 결과 : "3 > 4 결과는 false 입니다"
        int x = 3;
        int y = 4;
        System.out.println("x>y 결과는 " + (x>y) + " 입니다");
        // 6-2 : x, y 값 바꿔서 정답 나오는지 출력
        int z = 0;
        z = x;
        x = y;
        y = z;
        	System.out.println("x>y 결과는 " + (x>y) + " 입니다");
        
        // 문제 7
        /*
         * 숫자 149
         * ---------
         * 출력 결과
         * ---------
         * "백의 자리 : 1"
         * "십의 자리 : 4"
         * "일의 자리 : 9"
         */
        	int num = 149;
        	int num1 = num / 100;
        	System.out.println(num1);
        	int num2 = (num - num1*100) / 10;
        	System.out.println(num2);
        	int num3 = (num - num1*100-num2*10);
        	System.out.println(num3);
        // 문제 8
        // 회식비 43000원
        // 참석인원 4명
        // 인 당 얼마?
        // 8-1 : 디테일하게 원단위까지
        	int 회식비 = 50000;
        	int people = 4;
        	int people1 = 회식비 / people;
        	System.out.println(people1);
        // 8-2 : 만원 단위까지만 받기
        	int people2 = (people1 / 1000) *1000;
        	System.out.println(people2);
        // 8-2-1 : 주최자는 얼마 내야하는가?
        	int master = (people1-people2)*people+people2;
        	System.out.println(master);
        // 문제 9
        String left = "오예스";
        String right = "사탕";
        // 뭔가 하기
        String nothing;
        nothing = left;
        left = right;
        right = nothing;
        System.out.println("left: "+ left);  // 사탕
        System.out.println("right: "+ right);// 오예스
        
        // 문제1
        // 난 돈이 10000원있음
        // 1. 4500원 짜리 쌍화차를 최대 몇 잔 살 수 있는가?
        // 2. 그리고 남는 돈은?
        int me = 50000;
        int 쌍화 = 4500;
        int 잔=0;
        while(true) {
        	if(me>=쌍화) {
        			me=me-쌍화;
        			잔++;
        		}else {
        			break;
        		}
        	}
        	System.out.println("남은돈" + me + "원");
        	System.out.println(잔+ "잔");
        // 문제2
        // 올영에서 꿀홍차가 8000원인데
        // 15% 세일! 그렇다면 가격은?
        	int 꿀홍차 = 10000;
        	double 세일꿀홍차 = 꿀홍차 * 1.15;
        	int 세일꿀홍차1 = (int)세일꿀홍차;
        	System.out.println(세일꿀홍차 + "원");
        	System.out.println(세일꿀홍차1+"원");
        // 문제3-0
        // 1234를 10의 자리 이하 버림
        // 결과 : 1200
        int number = 1234;
        int number1 = (number / 100) * 100;
        System.out.println(number1);
        // 문제3
        double v1 = 1000;
        double v2 = 794.0;
        System.out.println(v1 / v2); // 1.2594458438287153
        // v1 / v2를 소수점 3자리까지만 출력하시오
        // 오칙연산만 plz
        // 결과 : 1.259
        double v3 = (v1 / v2) * 1000;
        int v4 = (int)v3;
        double v5 = (double)v4 / 1000;
        System.out.println(v5);
        // 문제4
        // 17000원이 있을 때
        // 5천원 몇장
        // 1천원 몇장
        int money = 13000;
        int money1 = 5000;
        int money2 = 1000;
        int 오천 = 0;
        int 천원 = 0;
        while(true) {
        	if(money>=money1) {
        		money=money-money1;
        		오천++;
        	}else if (money>=money2) {
        		money=money-money2;
        		천원++;
        	}else {
        		break;
        	}
        }
        System.out.println(오천 + "장");
        System.out.println(천원 + "장");
        
        // 임의의 수를 입력받아
        // 문제1
        // "양수", 0, "음수" 판단하여 출력
        // 문제2
        // 홀수인지 짝수인지 판단하여 출력
        int random = (int)((Math.random()*21)-10);
        if(random==0) {
        	System.out.println(random + "0입니다");
		}else if (random>0 && random%2==0 ) {
        	System.out.println(random + "짝수,양수 입니다");
        }else if(random%2==1) {
        	System.out.println(random + "홀수,양수 입니다");
        }else if(random<0 && random%2==0) {
        	System.out.println(random + "짝수,음수입니다");
        }else if(random%2==-1) {
        	System.out.println(random + "홀수,음수입니다");
        }
        
        
        
        
        // 문제3
        // 임의의 두 수 x, y를 받아서
        // 둘 중에 큰 값 출력
        int x1 = (int)((Math.random()*10)+1);
        int y1 = (int)((Math.random()*10)+1);
        if(x1>y1) {
        	System.out.println("x: "+x1+" y: "+y1+" x가 커용");
        }else if(x1<y1) {
        	System.out.println("x: "+x1+" y: "+y1+" y가 커용");
        }else if(x1==y1) {
        	System.out.println("x: "+x1+" y: "+y1+" 같아용");
        }
        
        
        
        
        // 문제4
        // 임의의 money를 입력 받아서
        // 7000원 이상이면 "택시타자" 출력
        // 7000~3000 사이면 "버스타자" 출력
        // 3000 미만임면 "걸어가자" 출력
        int money27 = (int)((Math.random()*91)+10)*100;
        if(money27>7000) {
        	System.out.println(money27+" 택시타자");
        }else if(money27<=7000 && money27>=3000) {
        	System.out.println(money27+" 버스타자");
        }else if(money27<3000) {
        	System.out.println(money27+" 걸어가자");
        }
        // ----- 도전해 볼만한 ------
        // 문제5
        // '가위', '바위', '보' 입력 받아서
        // 5-1 컴퓨터는 항상 '바위'만 낼 경우
        // 5-2 컴퓨터도 random으로
        // '이겼다', '비겼다', '졌다' 출력
		int b가위바위보 = (int) (Math.random() * 3);
		int a가위바위보 = (int) (Math.random() * 3) - 2;
		int 가위바위보 = (int) Math.random() + 1;
		if(가위바위보==1) {
			 if (a가위바위보 == b가위바위보) {
				System.out.println(a가위바위보+"a: 바위 " +"vs"+ " 바위 :b"+b가위바위보);
				System.out.println( "비겻다" );
			}else if(a가위바위보+1==0 && b가위바위보-1==0) {
				System.out.println(a가위바위보+"a: 가위 " +"vs"+ " 가위 :b"+b가위바위보);
				System.out.println( "비겻다" );
			}else if(a가위바위보+2==0 && b가위바위보-2==0) {
				System.out.println(a가위바위보+"a: 보 " +"vs"+ " 보 :b"+b가위바위보);
				System.out.println( "비겻다" );
			}else if(a가위바위보+2==0 && b가위바위보==0) {
				System.out.println(a가위바위보+"a: 보 " +"vs"+  " 바위 :b"+b가위바위보);
				System.out.println( "a가 이겻다" );
			}else if(a가위바위보+2==0 && b가위바위보-1==0) {
				System.out.println(a가위바위보+"a: 보 " +"vs"+ " 가위 :b"+b가위바위보);
				System.out.println( "b가 이겻다" );
			}else if(a가위바위보==0 && b가위바위보-2==0) {
				System.out.println(a가위바위보+"a: 바위 " +"vs"+ " 보 :b"+b가위바위보);
				System.out.println( "b가 이겻다" );
			}else if(a가위바위보==0 && b가위바위보-1==0) {
				System.out.println(a가위바위보+"a: 바위 " +"vs"+ " 가위 :b"+b가위바위보);
				System.out.println( "a가 이겻다" );
			}else if(a가위바위보+1==0 && b가위바위보==0) {
				System.out.println(a가위바위보+"a: 가위 " +"vs"+ " 바위 :b"+b가위바위보);
				System.out.println( "b가 이겻다" );
			}else if(a가위바위보+1==0 && b가위바위보-2==0) {
				System.out.println(a가위바위보+"a: 가위 " +"vs"+ " 보 :b"+b가위바위보);
				System.out.println( "a가 이겻다" );
			}
		}
			 
        	
        // 문제6
        // 임의 세 수 x, y, z를 받아서
        // z가 x~y 사이에 있는지(포함) 판단
        
        // 문제7
        // 月을 입력 받아서
        // 계절 출력
        // 13, -1등 입력하면 "정확히 입력해주세요" 출력
        
        // 문제8
        // 임의의 수를 입력받아서 다음과 같이 출력
        // 예 : 125
        // 입력한 수는 100보다 크고, 양수이고, 홀수입니다.
        
        // 문제9
        // 온도를 입력받아서 다음과 같이 출력
        // 예 : -3
        // 영하 3도 입니다
        // 예 : 5
        // 영상 5도 입니다
        
        // ----- 멘탈 챙길 자신 있으면 ------
        // 문제10
        // 시, 분을 입력 받아서 35분 후의 시, 분을 출력
        // 3, 51을 입력받으면
        // 4시 26분 출력
        
        // 문제11
        // 두자리 숫자를 입력받아서
        // 10의 자리와 1의 자리가 같은지 판단
        // 예 : 77 => 같음, 94 => 다름
        
        // 문제12
        // 1~99까지 369게임
        // 임의의 수를 받아서 3,6,9 숫자가 있으면 "박수" 출력
        // 없으면 그 숫자 그대로 출력
        // 예 : 33 => 박수, 31 => 박수, 12 => 12, 14 => 14
        
        // 문제13
        // 사각형의 한쪽 모서리 : x1:10, y1:20
        // 반대편 모서리 : x2:90, y2:100
        // 입력받은 두 수를 좌표로 하는 점이 사각형에 겹치는가
	}

}
