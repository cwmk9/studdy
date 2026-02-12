package chap04;

import java.util.Scanner;

public class ForTest_01 {

	public static void main(String[] args) {
		
		  // 1단계
        // +++++
        for(int a = 1; a <=5; a++) {//5번 반복
        	System.out.print("*");//일렬로
        }
        System.out.println();
        System.out.println("_____________________");
        // 2단계
        // +_+_+_+_+_
        for (int a = 1; a<=10; a++ ) {//5번 반복
        	if(a%2==0) {
        		System.out.print("_"); // 별반복
        		}else {
        			System.out.print("*"); 	 // 언더바반복 합이 10이니까 정지선 바꿈
        		}
        	}									//그냥 병 언더바 나오면 안되니까 조건달기		
        	
        	System.out.println();
        	System.out.println("__________________");
        // 3단계
        // +++++
        // +++++
        // +++++
        // 15번 반복
        // 5번째 줄 바꿈
        for(int a = 1; a <= 15; a++) {
        	if(a%5==0) {
        		System.out.println("*");
        	}else {
        		System.out.print("*");// 가로줄
        	}
        }

        // 4단계
        // 11111
        // 22222
        // 33333
        // 44444
        // 55555
        // 1이 다섯번 반복되게
        // 이중for문
        for(int b=1; b<=5; b++) {//1이다섯번 반복되고 2가 나와야해서 
        	for(int a=1; a<=5; a++) {//늦게 수가 증가하는 바깥for문으로 만듬
        		System.out.print(b);
        		
        	}
        		System.out.println();// 한바퀴 돌고 작동해서 줄바꿈용도
        }							 // for문 안에 쓰면 다 세로로 써짐
        				
        // 5단계
        // 1
        // 22
        // 333
        // 4444
        // 55555
        // 1한번 반복되고 다음꺼는 2번 반복되야함
        // 일단 다 만들어
        for(int a = 1 ; a <= 5; a++) {
        	for(int b = 1; b <= a; b++) {//b가 한번만 돌아야 함
        		System.out.print(a);	 //a랑 같으면 한번만 돔
        	}
        		System.out.println();
        }
        
        // 6단계
        // +
        // ++
        // +++
        // ++++
        // +++++
        
        for(int a = 1 ; a <= 5; a++) {
        	for(int b = 1; b <= a; b++) {
        		if(a==a) {
        			System.out.print("*");//a만 if 붙여서 *로 만듬
        		}
        	}
        		System.out.println();
        }
        
        // 7단계
        // 11111		a   b
        // 2222			1   5번돔 
        // 333			2   4번돔
        // 44			3   3번돔 
        // 5			4   2번돔
        // 그려보기   	5  	1번돔 모든 a+b의 합이 6
        for(int b =1; b<=5; b++) {
        	for (int a = 1; a+b<=6; a++) { //1이 다섯번 돌아야함
        			System.out.print(b);//2는 4번 돌아야 함 
        	 }							
        			System.out.println();
        }			
        
        // 8단계		
        // +____
        // ++___
        // +++__
        // ++++_
        // +++++	
        // 6단계 7단계를 합친 모습
        // 하나의 포문에 두개의 포문을 넣어서 포분 두개가 한번에 돌아가게
        // 일단 포문 6단계 7단계 포문을 하나씩 만듬
        
       for(int e=1; e<=5; e++) {
    	   for(int b=1; b<=e; b++) {		//두개 포문을 큰 하나로 합쳐야함
    		   System.out.print("*");			//큰 포문이 리셋역할을 하게 
    	   }	   							//작은 포문안의 큰포문을 없앰 
    	   for(int c=1; c+e<=5; c++) {		//마지막 하나는 안나와야해서
    		   System.out.print("_");		//정지선 하나줄임
    	   }								//큰포문작동 밑에포문작
    	   System.out.println();			//그 밑에 포문 작동
       }									//큰포문으로 돌아감
       
        
      
         
       
        
       
        
        // 9단계
        // ____+
        // ___++
        // __+++
        // _++++
        // +++++
        //앞에껄 반대로
       for(int c=1; c<=5; c++) {
       		for(int a=1; a+c<=5; a++) {
       		System.out.print("_");
       		}
       		for(int b=1; b<=c; b++) {
       			System.out.print("*");
       		}
       			System.out.println();
       }
       
        // 10단계
        // ____+
        // ___+++
        // __+++++
        // _+++++++
        // +++++++++
        // 9단계에서 포문 하나추가
       for(int a=1; a<=5; a++) {
      		for(int b=1; b+a<=5; b++) {
      		System.out.print("_");
      		}
      		for(int c=1; c<=a; c++) {
      			System.out.print("*");
      		}
      		for(int d=1; d<=a-1; d++ ) {
      			System.out.print("*");
      		}
      			System.out.println();
       }
       
        // 11단계
        // ____+____
        // ___+++___
        // __+++++__
        // _+++++++_
        // +++++++++
        // 포문 하나 더 추가
       
       
        // 다이아 만들기
        // 반쪽다이아 뒤집어서 만들기
        // 대빵포문<큰포문<작은포문으로 만들기
      System.out.println("______________________");
       for(int f=1; f<=1; f++) {
       		for(int a=1; a<=5; a++) {
       			for(int b=1; b+a<=6; b++) {
       				System.out.print("_");
       				}
       			for(int c=1; c<=a; c++) {
       				System.out.print("*");
       			}
       			for(int d=1; d<=a-1; d++ ) {
       				System.out.print("*");
       			}
       			for(int e=1; e+a<=6; e++) {
       				System.out.print("_");
       			}
       				System.out.println();
       		} 
       		for(int a=1; a<=5; a++) {
       			for(int b=1; b<=a+1; b++) {
       				System.out.print("_");
       			}
       			for(int c=1; c+a<=5; c++) {
       				System.out.print("*");
       			}	
       			for(int d=1; d+a<=4; d++ ) {
       				System.out.print("*");
       			}
       			for(int e=1; e<=a+1; e++) {
       				System.out.print("_");
       			}
       				System.out.println();
       		} 
       }
       
       
       
       
       
       
       
       
       
       System.out.println("!!!!!!!!!!!!!!!!");
       
        // 12단계
        // 입력 받은 줄 수 대로 출력
        // 1입력하면 ____*____나오게
        // 2입력하면 ___***___나오게
        // if활용
        //조건이 맞으면
//       Scanner scan = new Scanner(System.in);
//       System.out.print("입력: ");
//       String scan0 = scan.nextLine();
//       int scan1 = Integer.parseInt(scan0);
//       if(scan1==1) {
//    	   for(int f=1; f<=1; f++) {
//      		for(int a=1; a<=1; a++) {
//      			for(int b=1; b+a<=5; b++) {
//      				System.out.print("_");
//      				}
//      			for(int c=1; c<=a; c++) {
//      				System.out.print("*");
//      			}
//      			for(int d=1; d<=a-1; d++ ) {
//      				System.out.print("*");
//      			}
//      			for(int e=1; e+a<=5; e++) {
//      				System.out.print("_");
//      			}
//      				System.out.println();
//      			}
//      		
//    	   	}
//       }else if(scan1==2) {
//    	   for(int f=1; f<=1; f++) {
//         		for(int a=1; a<=2; a++) {
//         			for(int b=1; b+a<=5; b++) {
//         				System.out.print("_");
//         				}
//         			for(int c=1; c<=a; c++) {
//         				System.out.print("*");
//         			}
//         			for(int d=1; d<=a-1; d++ ) {
//         				System.out.print("*");
//         			}
//         			for(int e=1; e+a<=5; e++) {
//         				System.out.print("_");
//         			}
//         				System.out.println();
//         			}
//         		
//       	   	}
//       }else if(scan1==3) {
//    	   for(int f=1; f<=1; f++) {
//        		for(int a=1; a<=3; a++) {
//        			for(int b=1; b+a<=5; b++) {
//        				System.out.print("_");
//        				}
//        			for(int c=1; c<=a; c++) {
//        				System.out.print("*");
//        			}
//        			for(int d=1; d<=a-1; d++ ) {
//        				System.out.print("*");
//        			}
//        			for(int e=1; e+a<=5; e++) {
//        				System.out.print("_");
//        			}
//        				System.out.println();
//        			}
//        		
//      	   	}
//      }else if(scan1==4) {
//   	   for(int f=1; f<=1; f++) {
//    		for(int a=1; a<=4; a++) {
//    			for(int b=1; b+a<=5; b++) {
//    				System.out.print("_");
//    				}
//    			for(int c=1; c<=a; c++) {
//    				System.out.print("*");
//    			}
//    			for(int d=1; d<=a-1; d++ ) {
//    				System.out.print("*");
//    			}
//    			for(int e=1; e+a<=5; e++) {
//    				System.out.print("_");
//    			}
//    				System.out.println();
//    			}
//    		
//  	   		}
//      }else if(scan1==5) {
//   	   for(int f=1; f<=1; f++) {
//    		for(int a=1; a<=5; a++) {
//    			for(int b=1; b+a<=5; b++) {
//    				System.out.print("_");
//    				}
//    			for(int c=1; c<=a; c++) {
//    				System.out.print("*");
//    			}
//    			for(int d=1; d<=a-1; d++ ) {
//    				System.out.print("*");
//    			}
//    			for(int e=1; e+a<=5; e++) {
//    				System.out.print("_");
//    			}
//    				System.out.println();
//    			}
//    		
//  	   		}
//      }else if(scan1==6) {
//    	  for(int f=1; f<=1; f++) {
//       		for(int a=1; a<=5; a++) {
//       			for(int b=1; b+a<=6; b++) {
//       				System.out.print("_");
//       				}
//       			for(int c=1; c<=a; c++) {
//       				System.out.print("*");
//       			}
//       			for(int d=1; d<=a-1; d++ ) {
//       				System.out.print("*");
//       			}
//       			for(int e=1; e+a<=6; e++) {
//       				System.out.print("_");
//       			}
//       				System.out.println();
//       		} 
//       		for(int a=1; a<=1; a++) {
//       			for(int b=1; b<=a+1; b++) {
//       				System.out.print("_");
//       			}
//       			for(int c=1; c+a<=5; c++) {
//       				System.out.print("*");
//       			}	
//       			for(int d=1; d+a<=4; d++ ) {
//       				System.out.print("*");
//       			}
//       			for(int e=1; e<=a+1; e++) {
//       				System.out.print("_");
//       			}
//       				System.out.println();
//       		} 
//       }
//    }else if(scan1==7) {
//  	  for(int f=1; f<=1; f++) {
//   		for(int a=1; a<=5; a++) {
//   			for(int b=1; b+a<=6; b++) {
//   				System.out.print("_");
//   				}
//   			for(int c=1; c<=a; c++) {
//   				System.out.print("*");
//   			}
//   			for(int d=1; d<=a-1; d++ ) {
//   				System.out.print("*");
//   			}
//   			for(int e=1; e+a<=6; e++) {
//   				System.out.print("_");
//   			}
//   				System.out.println();
//   		} 
//   		for(int a=1; a<=2; a++) {
//   			for(int b=1; b<=a+1; b++) {
//   				System.out.print("_");
//   			}
//   			for(int c=1; c+a<=5; c++) {
//   				System.out.print("*");
//   			}	
//   			for(int d=1; d+a<=4; d++ ) {
//   				System.out.print("*");
//   			}
//   			for(int e=1; e<=a+1; e++) {
//   				System.out.print("_");
//   			}
//   				System.out.println();
//   		} 
//   }
//}else if(scan1==8) {
//	  for(int f=1; f<=1; f++) {
//   		for(int a=1; a<=5; a++) {
//   			for(int b=1; b+a<=6; b++) {
//   				System.out.print("_");
//   				}
//   			for(int c=1; c<=a; c++) {
//   				System.out.print("*");
//   			}
//   			for(int d=1; d<=a-1; d++ ) {
//   				System.out.print("*");
//   			}
//   			for(int e=1; e+a<=6; e++) {
//   				System.out.print("_");
//   			}
//   				System.out.println();
//   		} 
//   		for(int a=1; a<=3; a++) {
//   			for(int b=1; b<=a+1; b++) {
//   				System.out.print("_");
//   			}
//   			for(int c=1; c+a<=5; c++) {
//   				System.out.print("*");
//   			}	
//   			for(int d=1; d+a<=4; d++ ) {
//   				System.out.print("*");
//   			}
//   			for(int e=1; e<=a+1; e++) {
//   				System.out.print("_");
//   			}
//   				System.out.println();
//   		} 
//   }
//}else if(scan1==9) {
//	  for(int f=1; f<=1; f++) {
//	   		for(int a=1; a<=5; a++) {
//	   			for(int b=1; b+a<=6; b++) {
//	   				System.out.print("_");
//	   				}
//	   			for(int c=1; c<=a; c++) {
//	   				System.out.print("*");
//	   			}
//	   			for(int d=1; d<=a-1; d++ ) {
//	   				System.out.print("*");
//	   			}
//	   			for(int e=1; e+a<=6; e++) {
//	   				System.out.print("_");
//	   			}
//	   				System.out.println();
//	   		} 
//	   		for(int a=1; a<=4; a++) {
//	   			for(int b=1; b<=a+1; b++) {
//	   				System.out.print("_");
//	   			}
//	   			for(int c=1; c+a<=5; c++) {
//	   				System.out.print("*");
//	   			}	
//	   			for(int d=1; d+a<=4; d++ ) {
//	   				System.out.print("*");
//	   			}
//	   			for(int e=1; e<=a+1; e++) {
//	   				System.out.print("_");
//	   			}
//	   				System.out.println();
//	   		} 
//	   }
//	}
       System.out.println("!!!!!!!");
       // 12단계
       // 입력 받은 줄 수 대로 출력
       // 1입력하면 ____*____나오게
       // 2입력하면 ___***___나오게
       // if활용
       // 조건이 맞으면
       // 크기
       
     Scanner scan = new Scanner(System.in);
//     System.out.print("입력: ");
//     String scan0 = scan.nextLine();
//     int scan1 = Integer.parseInt(scan0);
     	// 여기서 scan1이 들어간 자리는피라미드 크기를 정하는자리
        // scan1의 숫자만큼 가로 세로의 반복이 많이 일어나고 크기가 커짐
//    	   for(int a=1; a<=scan1; a++) { //세로반복 담당
//    		   for(int b=1; a+b<=scan1; b++) {// 여기부터는 가로반복 담당
//    			   System.out.print("_");
//    		   }
//    		   for(int d=1; d<=a; d++) {
//    			   System.out.print("*");
//    		   }
//    		   for(int c=1; c<=a-1; c++) {
//    			   System.out.print("*");
//    		   }
//    		   for(int e=1; e+a<=scan1; e++) {
//    			   System.out.print("_");
//    		   }
//    		   System.out.println();
//    	   }
       //줄수
//     		System.out.print("입력: ");
//     		String scan0 = scan.nextLine();
//   			int scan1 = Integer.parseInt(scan0);
//   			
//    	   for(int a=1; a<=scan1; a++) { //여기만 scan으로 바꾸면 
//    		   for(int b=1; a+b<=5; b++) {//정해진 크기로
//    			   System.out.print("_");//몇줄반복할지 정할 수 있음
//    		   }
//    		   for(int d=1; d<=a; d++) {
//    			   System.out.print("*");
//    		   }
//    		   for(int c=1; c<=a-1; c++) {
//    			   System.out.print("*");
//    		   }
//    		   for(int e=1; e+a<=5; e++) {
//    			   System.out.print("_");
//    		   }
//    		   System.out.println();
//    	   }
       
       
       
       System.out.println("!!!!!!!!!!");
       
       
       

       // 문제3
       // 구구단 3단씩 옆으로 출력
       // 2x1=2 3x1=3 4x1=4
       // 2x2=4 3x2=6 4x2=8
       // 2x3=6... 다시하기
//       for(int g=1; g<=1; g++) {
//       		for(int a=1; a<=9; a++) {
//       			for(int b=2; b<=4; b++) {
//       				System.out.print(b+"X"+a+"="+(b*a)+"\t");
//       			}
//       			System.out.println();
//       		}
//       		for(int c=1; c<=9; c++) {
//       			for(int d=5; d<=7; d++) {
//       				System.out.print(d+"X"+c+"="+(d*c)+"\t");
//       			}
//       			System.out.println();
//       		}
//       		for(int e=1; e<=9; e++) {
//       			for(int f=8; f<=9; f++) {
//       				System.out.print(f+"X"+e+"="+(f*e)+"\t");
//       			}
//       				System.out.println();
//       		}
//       }
       
    // 문제5
       // 주사위 2개를 굴려서
       // 합 별로 출력
       // 합2 : [1,1]
       // 합3 : [1,2] [2,1]
       /* 합4 : [1,3] [2,2] [3,1]
        * 합5 : [1,4] [2,3] [3,2] [4,1]
        * 합6 : [1,5] [2,4] [3,3] [4,2] [5,1] 
        * 합7 : [1,6] [2,5] [3,4] [4,3] [5,2] [6,1]
        * 합8 : [2,6] [3,5] [4,4] [5,3] [6,2]
        * 합9 : [3,6] [4,5] [5,4] [6,3]
        * 합10: [4,6] [5,5] [6,4]
        * 합11: [5,6] [6,5]
        * 합12; [6,6] 못풀었음 한달뒤에 다시보기 시발
        */
//			for (int a = 1; a <= 6; a++) {
//				for (int c = 0; c <= 6c - 1; c++) {
//					if((a-c)==1) {
//						System.out.print("["+a+","+(a - c)+"]");
//					}
//					System.out.println("["+a+","+(a - c)+"]");
//					
//				}
//			}	
//					System.out.println();
       	
       		
       
	}
}
