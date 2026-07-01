package Scanner;

public class MaximumNumber {

	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5,6};
		int fm=0;
		int min=arr[0];
		for(int num:arr) {
			if(num>fm) {
				fm=num;
			}
			if(num<min) {
				min=num;
			}
		}
		System.out.println("Max is "+fm);
		System.out.println("min is "+min);


	}

}
