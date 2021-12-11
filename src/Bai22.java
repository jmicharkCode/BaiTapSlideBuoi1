import java.util.Scanner;

public class Bai22 {
	// in ra string tu vi tri start den end
	public static void printSubStr(String str, int start, int end) {
		for (int i = start; i <= end; ++i)
			System.out.print(str.charAt(i));
	}
	// kiem tra xem mot string co la Palindrome
	public static boolean isPalindrome(String input) {
		if (input == null) {
			return false;
		}
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) != input.charAt(input.length() - 1 - i))
				return false;
		}
		return true;
	}

	public static void longestPalSubstr(String s) {
		int n = s.length();
		int maxLength = 1, start = 0;
		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j < s.length(); j++) {
				boolean flag = true;
				// check Palindrome
				String input = s.substring(i, j+1);
				if (!isPalindrome(input))
					flag = false;
				// is Palindrome
				if (flag && (j - i + 1) > maxLength) {
					start = i;
					maxLength = j - i + 1;
				}
			}
		}
		if (maxLength == 1)
			System.out.println("Chuoi khong co subString la Palindrome!");
		else {
			System.out.print("Chuoi subString Palindrome dai nhat la: ");
			printSubStr(s, start, start + maxLength / 2 - 1);
		}
	}

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Nhap chuoi: ");
		String s = scan.nextLine();
		longestPalSubstr(s);
	}

}
