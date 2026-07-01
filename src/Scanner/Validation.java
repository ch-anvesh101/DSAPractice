package Scanner;
import java.util.Scanner;

public class Validation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the user name");
		String User= sc.nextLine();
		System.out.println("Enter the password");
		String Password= sc.nextLine();
		
		if(User.equals("Anvesh")&& Password.equals("Anvesh123"))
		{
			System.out.println("Login Success");
		}
		else {
			System.out.println("oopps...Login Denied...");
		}

	}

}
