package Seraching;

public class Char {

	public static void main(String[] args) {
		String arr[]= {"bahu","bali","deva","sena"};
		String target="deva";
		int low=0;
		int high=arr.length-1;
		
		while(low<=high)
		{
			int mid=(low+high)/2;
		if(arr[mid]==target) {
			System.out.println("found at :"+mid);
			return;	
		}
		else if(target==arr[mid]) {
			high=mid-1;
		}
		else {
			low=mid+1;
		}
		}
		System.out.println("not found");
		
		

	}

}
