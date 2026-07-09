package Seraching;

public class FindNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[]= {"bahu","bali","deva","sena"};
		String target="deva";
		boolean found=false;
		for(String name:arr)
		{
			if(name.equals(target))
			{
				found=true;
				break;
			}
		}
		System.out.println(found ?" present":"Absent");
		

	}

}
