//Date:29/05/2020
package capg;
import java.util.Scanner;
//to find the given number is a prime number or not by getting input from the user
public class PrimeNoVerification {
	public static void main(String args[]) {
		int i, j, flag = 0;
		System.out.print("Enter any number which you want to verify whether it is a prime number or not :");
		Scanner s = new Scanner(System.in);
		j = s.nextInt();
		for (i = 2; i < j; i++) {
			if (j % i == 0) {
				flag = 0;
				break;
			} else {
				flag = 1;
			}
		}
		if (flag == 1) {
			System.out.println(j + " is  a prime number.");
		} else {
			System.out.println(j + " is not a prime number.");
		}
	}

}
