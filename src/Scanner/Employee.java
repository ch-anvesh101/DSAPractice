package Scanner;

public class Employee {
	int empid;
	String empname;
	String empadd;
	int empsal;
	public Employee(int empid,String empname,String empadd,int emsal) {
		
		this.empid = empid;
		this.empname = empname;
		this.empadd = empadd;
		this.empsal = emsal;
	}
	public Employee() {
		
	}
	@Override
	public String toString() {
		return "Employee [empid="+ empid +",empname="+ empadd +",empsal="+ empsal +"]";
	}
	public static void main(String[] args) {
		Employee emp1=new Employee(1,"Anvesh","Hyd",25000);
		Employee emp2=new Employee(2,"Sanjay","Bng",25000);
		Employee emp3=new Employee(1,"Mahesh","MH",25000);
		Employee[] emp= {emp1,emp2,emp3);
		
		}
	}



	}

