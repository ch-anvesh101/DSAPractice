package arrays;

import java.util.Arrays;

public class InsertArray {

	public static void main(String[] args) {
		int[] arr = {1,8,3,9,2,47};
		int pos = 3;
		
		int[]arr1=new int[arr.length-1];
		for(int i=0;i<pos;i++) {
			arr1[i]=arr[i];
		}
		for(int i=pos+1;i<arr.length;i++) {
			arr1[i-1]=arr[i];
		}
		System.out.println("old array:"+Arrays.toString(arr));
		System.out.println("new array:"+Arrays.toString(arr1));
	}

}
