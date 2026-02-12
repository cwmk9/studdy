package qulz.qulz01;

public class EmpTable {

	Emp[] et = new Emp[5];
	
//	void stress() {
//		for(int a=0; a<et.length;a++) {
//			et[a].print();
//		}
//	}
	
	Emp[] stress3() {
	Emp e1 = new Emp();		
	e1.setInfo("민권", "사원", 5, 4,  3000);	
	Emp e2 = new Emp();		
	e2.setInfo("민수", "사장", 1, 0, 9000);		
	Emp e3 = new Emp();		
	e3.setInfo("성범", "사원", 2, 1, 5000);
	Emp e4 = new Emp();
	e4.setInfo("종한", "사원", 3, 2, 4500);
	Emp e5 = new Emp();
	e5.setInfo("현수", "사원", 4, 3, 4000);
	return new Emp[] {e1, e2, e3, e4, e5};
	}
	
//	Emp[] emp1 = new Emp[] {e1, e2, e3, e4, e5};
	
	void stressstress(Emp[] et) {
		for(int a=0; a<et.length;a++) {
			this.et[a]=et[a];
		}
	
	}
	
	void stress() {
		for(int a=0; a<et.length;a++) {
			et[a].print();
		}
	}
	
	void stress1() {
		for(int a = 0; a<et.length; a++) {
			if(et[a].Salary>=4500) {
				et[a].print();
			}
		}
	}
	
	void stress2() {
		for(int a = 0; a<et.length; a++) {
			if(et[0].Femnb==et[a].Emnb) {
				et[a].print();
			}
		}
	}
	
}
