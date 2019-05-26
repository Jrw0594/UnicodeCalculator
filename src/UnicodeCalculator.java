import java.util.Scanner;

public class UnicodeCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First String?");
		String str1 = sc.nextLine();
		
		System.out.println("Enter Second String?");
		String str2 = sc.nextLine();
		
		int str1UnicodeTotal = 0;
		// loop through all chars in the string. Calculate their unicode value and sum it up.
		for (int i = 0; i < str1.length(); i++) {
			char c = str1.charAt(i);
			int unicode = str1.codePointAt(i);
			str1UnicodeTotal += unicode;
			System.out.println(c + ": " + unicode);
		}
		
		int str2UnicodeTotal = 0;
		// loop through all chars in the string. Calculate their unicode value and sum it up.
		for (int i = 0; i < str2.length(); i++) {
			char c = str2.charAt(i);
			int unicode = str2.codePointAt(i);
			str2UnicodeTotal += unicode;
			System.out.println(c + ": " + unicode);
		}
		
		// finally print out the difference of the summed unicodes
		System.out.println("Difference (as absolute value): " + (str2UnicodeTotal - str1UnicodeTotal));
	}
}
