package capg;

public class FreqChar {

	public static void main(String[] args) {
		String str = "i am expert in automation";
		char ch = 'i';
		int freq = 0;
		for (int i = 0; i < str.length(); i++) {
			if (ch == str.charAt(i)) {
				freq++;

			}
		}
		System.out.println("freq of character e:" + freq);
	}

}
/*
System.out.println("Enter a string value ::");
Scanner sc = new Scanner(System.in);
String str = sc.nextLine();

System.out.println("Enter a particular character ::");
char character = sc.nextLine().charAt(0);
int count = 0;

for (int i=0; i<str.length(); i++){
   if(character == str.charAt(i)){
      count++;
   }
}
System.out.println("Frequency of the give character:: "+count);
*/