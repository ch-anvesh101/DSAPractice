package Seraching;

import java.util.Arrays;

public class Duplicate {

	public static void main(String[] args) {
	int arr[]= {1,1,2,2,2,3,3,3,3,4,4,4,4};
	int f=0;
	int s=0;
	while(s!=arr.length) {
		if(arr[f]!=arr[s]) {
			f++;
			int temp=arr[f];
			arr[f]=arr[s];
			arr[s]=temp;
			s++;
			
		}
		else {
			s++;
		}
	}
	System.out.println(Arrays.toString(arr));
	

	}

}
