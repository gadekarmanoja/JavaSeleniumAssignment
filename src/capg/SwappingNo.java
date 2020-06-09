package capg;

import java.util.Scanner;

public class SwappingNo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No. for A= ");
		int a=sc.nextInt();
		System.out.println("Enter No. for B= ");
		int b=sc.nextInt();
		
		//1.using single line
		/*b=a+b-(a=b);*/
		/***********************************/
		
		int t=a;
		a=b;
		b=t;
	
		System.out.println("After Swapping a= "+a+"\nb= "+b);
		
	}

}
