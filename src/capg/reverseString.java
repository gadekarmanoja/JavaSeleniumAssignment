package capg;

import java.util.Scanner;

public class reverseString {

	public static void main(String[] args) {
		 //1.Using StringBuffer class & reverse() method
		
		/* StringBuffer a = new StringBuffer("abcd");
		 * System.out.println(a.reverse());
		 */
		/***********************************/
		//2.using + (concatenation) operator
		/*String rev = "";
		System.out.println("Enter the string:");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int len = str.length();
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println("Revesrse string is: " + rev);*/
		/***********************************/
		String rev = "";
		System.out.println("Enter the string:");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char charArr[]=str.toCharArray();
		int len = charArr.length;
		for (int i = len-1; i>=0; i--) {
			rev=rev+charArr[i];
		}
		System.out.println("Reverse string is: "+rev);
		
		
	}

}
