package Seraching;

public class Character {

	public static void main(String[] args) {
		String d="Developer";
		char target='p';
		int index=0;
		for(char c:d.toCharArray())
		{
			if(target==c)
			{
				System.out.println(c+"found at"+index);
				
				
			}
			index++;
			
		}
		System.out.println("not found");
		

	}

}
