package sec04._overloading;

public class CalcExam {

	public static void main(String[] args) {

		Calc calc = new Calc();
		
		calc.plus(1, 1);
		calc.plus(1.5, 1.8);
		
		System.out.println("문자");
		System.out.println(1);
		System.out.println();
		
		calc.plus(1, 1.5); //int로는 double가 표현이 안되서 더블로
		
		calc.fitness("덤벨", 20, 5);
	}

}
