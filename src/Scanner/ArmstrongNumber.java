package Scanner;
import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int i =sc.nextInt();
		int n =sc.nextInt();
		int ArmstrongNumber,temp,sum;
		while(i<n) {
			ArmstrongNumber=i;
			sum=0;
			for(;i!=0;)
			{
				temp=i%10;
				sum=sum+temp*temp*temp;
				i=i/10;	
			}
			i=ArmstrongNumber;
			if (sum==ArmstrongNumber)
			{
				System.out.println("ArmstrongNumber is "+ArmstrongNumber);
			}
			i++;
			n--;
		}
	
		
		

	}

}
