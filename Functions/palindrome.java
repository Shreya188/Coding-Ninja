import java.util.Scanner;

public class Palindrome {
	public static boolean checkPalindrome(String str){
		StringBuilder sb=new StringBuilder(str);
		sb.reverse();
		String rev=sb.toString();
		if(rev.equals(str)) {
			return true;
		}
		return false;
		}
		
	
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String str=s.next();
	boolean a=checkPalindrome(str);
	System.out.println(a);
}

}
//palindrome without setbuilder
/*  public static boolean palindrome(String s) {
	    int i=0;int j=s.length()-1;
	    if(s.charAt(i)==s.charAt(j)) {
	    	return true;
	    }
	    i++;j--;	
	    return false;
	    }
*/
