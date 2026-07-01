package Scanner;

public class SuperDemo {
	int salary=60000;
	public void getsalary(int salary)
	{
		salary=50000;
		System.out.println("my parent salary:"+salary);
	}

}
public class ThisDemo extends SuperDemo{
	int salary = 30000;
	public void getSalary(int Salary) {
		salary=20000;
		System.out.println(salary);
		System.out.println(This.salary);
		
	}
}
