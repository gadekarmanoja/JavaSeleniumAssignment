//Date:29/05/2020
package capg;
//display all the prime numbers between 1 and 100
/*The number which is only divisible by 1 and itself is known as a prime number.
 * For example 2, 3, 5, 7, 11… are prime numbers.
 */
public class PrimeNumbersOneToHundred {
	public static void main(String[] args) {
		int i = 0;
		int num = 0;
		String primeNumbers = "";

		for (i = 1; i <= 100; i++) {
			int counter = 0;
			for (num = i; num >= 1; num--) {
				if (i % num == 0) {
					counter = counter + 1;
				}
			}
			if (counter == 2) {
				primeNumbers = primeNumbers + i + " ";
			}
		}
		System.out.println("Prime numbers from 1 to 100 are :");
		System.out.println(primeNumbers);
	}
}
