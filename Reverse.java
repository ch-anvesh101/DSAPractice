package Seraching;

public class Reverse {

	public static void main(String[] args) {
		String s="Anvesh";
		int l=0;
		int r=s.length()-1;
		char[] ch=s.toCharArray();
		while(l<=r)
		{
			char temp=s.charAt(l);
			ch[l]=ch[r];
			ch[r]=temp;
			l++;
			r--;
		}
		System.out.println(new String(ch));
		

	}

}
