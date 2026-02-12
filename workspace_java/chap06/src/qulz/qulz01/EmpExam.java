package qulz.qulz01;

public class EmpExam {

	public static void main(String[] args) {

//		Emp e1 = new Emp();		
//		e1.setInfo("민권", "사원", 5, 4,  3000);	
//		Emp e2 = new Emp();		
//		e2.setInfo("민수", "사장", 1, 0, 9000);		
//		Emp e3 = new Emp();		
//		e3.setInfo("성범", "사원", 2, 1, 5000);
//		Emp e4 = new Emp();
//		e4.setInfo("종한", "사원", 3, 2, 4500);
//		Emp e5 = new Emp();
//		e5.setInfo("현수", "사원", 4, 3, 4000);
//		
//		
//		Emp[] emp1 = new Emp[] {e1, e2, e3, e4, e5};
		
//		for(int a = 0; a<emp1.length; a++) {
//			if(emp1[a].Salary>=4500) {
//				emp1[a].print();
//			}
//		}
//		System.out.println("6----------------1");
//		
//		for(int a = 0; a<emp1.length; a++) {
//			if(emp1[0].Femnb==emp1[a].Emnb) {
//				emp1[a].print();
//			}
//		}
		
//		EmpTable[] et = new EmpTable[5];
//		for(int a = 0; a<emp1.length; a++) {
//			System.out.println(et[a]);
//		}
		System.out.println("-----------Talbe--------------");
		 
		EmpTable et = new EmpTable();
		et.stressstress(et.stress3());
		et.stress();
		System.out.println("-------------연봉--------------");
		et.stress1();
		System.out.println("===============직송상사================");
		et.stress2();
		
	}

}
