import java.util.Scanner;

public class Bai4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap so tu nhien: ");
		int n = Integer.parseInt(scan.nextLine());
		int count = 0;
		do {
			count++;
			n /= 10;
		} while(n > 0);
		System.out.println("So cac chu so cua so do la: " + count);
	}

}
