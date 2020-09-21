import java.util.*;
public class Permutation {

	public static boolean isPermutation(String input1, String input2) {
	 int n1=input1.length();
	 int n2=input2.length();
	 if(n1!=n2) {
		 return false;
	 }
	 //change to chararray
	 char ch1[]=input1.toCharArray();
	 char ch2[]=input2.toCharArray();
	 //sort array
	 Arrays.sort(ch1);
	 Arrays.sort(ch2);
	 //System.out.println(ch1);
	 for(int i=0;i<n1;i++){
		 if(ch1[i]!=ch2[i])
			 return false;
	 }
	 return true;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input1 = s.nextLine();
		String input2 = s.nextLine();
		boolean result = isPermutation(input1,input2);
System.out.print(result);
	}
}
