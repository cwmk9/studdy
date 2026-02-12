package qulz.qulz01;

public class Emp {
	
	String Name;
	String Rank;
	int Emnb;
	int Femnb;
	int Salary;
	
	void setInfo(String Name, String Rank,  int Emnb, int Femnb, int Salary) {
		this.Name=Name;
		this.Rank=Rank;
		this.Emnb=Emnb;
		this.Femnb=Femnb;
		this.Salary=Salary;
	}
	
	void print() {
		System.out.println("이름"+this.Name+"직급"+this.Rank+"사번" +this.Femnb+ "상사사번" +this.Emnb+ "연봉"+this.Salary  );
	}
	
	
}
