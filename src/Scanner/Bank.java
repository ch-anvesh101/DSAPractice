package Scanner;
import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int bal=5000;
		System.out.println("Enter the amount");
		int Withdraw= sc.nextInt();
		
		if(Withdraw<=bal)
		{
			System.out.println("withdraw Success:" +Withdraw);
		}
		else {
			System.out.println("Withdraw failed:");
		}
		
	}

}
