package Scanner;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name[]= {"Anvesh","Sanjay","Mahesh","Hari","Abhinay"};
		
		System.out.println(name[0]);
		System.out.println(name[1]);
		System.out.println(name[2]);
		System.out.println(name[3]);
		System.out.println(name[4]);
		
		System.out.println("------------------");
		for(int i=0;i<5;i++)
		{
		  System.out.println(name[i]+" ");
		}
		System.out.println("----------------");
		for(int i=0;i<name.length;i++)
		{
			System.out.println(name[i]+" ");
		}
		
		

	}

}
