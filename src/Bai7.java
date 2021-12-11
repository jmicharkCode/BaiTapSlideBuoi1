import java.util.Scanner;

public class Bai7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap so tu nhien n: ");
		int n = Integer.parseInt(scan.nextLine());
		System.out.println("Cac uoc so cua n la: ");
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				System.out.print(i + " ");
			}
		}
	}

}
