import java.util.Scanner;

public class Bai12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap so tu nhien tu 1 den 9: ");
		int n = Integer.parseInt(scan.nextLine());
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
					System.out.print(j);
			}
			System.out.println();
		}
	}

}
