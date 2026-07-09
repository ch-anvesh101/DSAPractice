package Seraching;

public class EvenNumber {

	public static void main(String[] args) {
	int arr[]= {23,89,47,15,38,19,24};
	for(int num:arr)
	{
		if(num%2==0)
		{
			System.out.println("First Even Number :" +num);
			return;
		}
	}
	System.out.println("Not Found");
	

	}

}
