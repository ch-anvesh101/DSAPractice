package Seraching;

public class PairValues {

	public static void main(String[] args) {
		int arr[]= {1,2,4,6,8,10};
		int target=10;
		int l=0;
		int r=arr.length-1;
		while(l<r) {
			int sum=arr[l]+arr[r];
			if(sum==target)
			{
				System.out.println("pair found :"+arr[l]+" "+arr[r]);
				l++;
				r--;
			}
			else if(sum<target) {
				l++;
			}
			else {
				r--;
			}
		}

	}

}
