package sec02;

public class ChinaExam {

	public static void main(String[] args) {

		China food = new China();
	 
		System.out.println(food.name + food.address +food.menus[0]);
		
		China food1 = new China();
		System.out.println(food1.name1 + food1.address + food1.menus1[0]);	
	
		food.name = "대길이짬봉";
		food.menus = new String[]{"고추잡채","우육면"}; 
		food.address = "조선 어딘가";
		System.out.println(food.name+":"  + food.menus[1]+"\n" +"장소:"+ food.address);
		
		
	}

}
