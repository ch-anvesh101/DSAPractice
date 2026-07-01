package arrays;

import java.util.Arrays;

public class ZerotoEnd {

	public static void main(String[] args) {
		int[]arr= {1,0,3,0,2};
		//int position=
		int j=0;
		int[]arr1=new int[arr.length];
		for(int i =0;i<arr1.length;i++) {
			if(arr[i]==0) {
				continue;
			}
			arr1[j]=arr[i];
			
			j++;
		}
		System.out.println(Arrays.toString(arr1));
		// TODO Auto-generated method stub

	}

}
