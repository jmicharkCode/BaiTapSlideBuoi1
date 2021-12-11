import java.util.Scanner;

public class Bai2 {
	public static void convertBinary(int num) {
		int binary[] = new int[40];
		int index = 0;
		while (num > 0) {
			binary[index++] = num % 2;
			num = num / 2;
		}
		for (int i = index - 1; i >= 0; i--) {
			System.out.print(binary[i]);
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Nhap so thap phan can chuyen: ");
		int decimalNumber = Integer.parseInt(scan.nextLine());
		System.out.print("He nhi phan cua " + decimalNumber + " la :");
		convertBinary(decimalNumber);
	}
}
