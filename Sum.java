package Seraching;

import java.util.Map;
import java.util.HashMap;


public class Sum {

	public static void main(String[] args) {
		int arr[]= {2,7,11,15,22};
		int target=9;
		
		//create empty map to store key and value pairs
        Map<Integer,Integer> map= new HashMap();
		for(int i=0;i<arr.length;i++)
		{
			int complement=target-arr[i];
		
		if (map.containsKey(complement))
		{
			System.out.println("index :"+map.get(complement)+" "+i);
			return;
		}
		map.put(arr[i], i);
		}
		

	}

	}

