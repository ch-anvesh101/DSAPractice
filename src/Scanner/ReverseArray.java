package Scanner;
import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int []a= new int[10];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Reverse Order");
		for(int i =a.length-1;i>=0;i--)
		{
		 System.out.println(a[i]);
		}
		System.out.println("Using for each loop");
		for(int j:a)
		{
			System.out.println(j);
		}
		
		

	}

}
