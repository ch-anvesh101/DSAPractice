package Collections;

import java.util.function.Function;
import java.util.function.Supplier;

class Customer{
	public Customer() {
		System.out.println("i am regular here....");
	}
	String name;
	
	public Customer(String name) {
		this.name =name;
	}
}

public class CustomerDemo {
	public static void main(String[] args) {
		Supplier<Customer> s= Customer::new; //default constructor
		Customer c= s.get();
		
		Function<String,Customer> fun=Customer::new;//para constructor
		Customer ct=fun.apply("Anvesh");
		System.out.println(ct.name);
		
	}

}
