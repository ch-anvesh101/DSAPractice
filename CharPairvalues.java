package Seraching;

public class CharPairvalues {

	public static void main(String[] args) {
		String s="level";
		int l=0;
		int r=s.length()-1;
		while(l<r) {
			if(s.charAt(l)==s.charAt(r)) {
				l++;
				r--;
			}
			else {
				System.out.println("not a palindrome");
				return;
			}
			l++;
			r--;
			
		}
		System.out.println("palindrome");

	}

}
