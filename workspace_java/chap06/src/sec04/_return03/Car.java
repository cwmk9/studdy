package sec04._return03;

public class Car {

	int gas;
	
	void setGas(int g) {
		gas=g;
	}
	
	boolean isLeftGas() {
		// else가 있다는 건 무조건 하나는 실행 한다는 의미
		if(gas == 0) {
			System.out.println("gas 없음");
			return false;
		}else {
			System.out.println("gas있음");
			return true;
		}
	}
	
	
	boolean isLeftGas2() {
		// return하는 순간에 메소드 종료
		if(gas == 0) {
			System.out.println("gas 없음");
			return false;
		}
		
			System.out.println("gas있음");
			return true;
	}
			//에러: 도달할수 없는 코드
//			System.out.println();

			//return을 딱 한번만 하는 방식
			boolean isLeftGas3() {
				boolean result = false;
				if(gas == 0) {
					System.out.println("gas 없음");
					result = false;
				}else {
					System.out.println("gas있음");
					result = true;
				}
				return result;
			}	
				boolean isLeftGas4() {
				
					return gas!=0;
				}		
			void run() {
				while(true) {
					if (gas>0) {
						System.out.println("가즈아!!잔량:"+gas);
						gas--;
					}else {
						System.out.println("멈춰!! 잔량:"+gas);
						return;
					}
				}
			
	}
}
