package Scanner;
import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int t= sc.nextInt();
		for(int i=1;i<=20;i++) {
			System.out.println(t+"X"+i+"="+t*i);
			
		}
	}

}
