import java.util.Scanner;

public class Bai16 {
	public static void main(String[] args) {
		int year;
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap vào nam can kiem tra:");
		year = scan.nextInt();
		scan.close();
		boolean isLeap = false;
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0)
					isLeap = true;
				else
					isLeap = false;
			} else
				isLeap = true;
		} else {
			isLeap = false;
		}
		if (isLeap == true)
			System.out.println(year + " la nam nhuan.");
		else
			System.out.println(year + " khang phai la nam nhuan.");
	}
}