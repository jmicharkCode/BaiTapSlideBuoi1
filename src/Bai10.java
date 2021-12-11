import java.util.Scanner;

public class Bai10 {

	public static boolean checkPrime(int num) {
		if(num == 0 || num == 1) return false;
		int temp;
		for (int i = 2; i <= num / 2; i++) {
			temp = num % i;
			if (temp == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap n: ");
		int n = Integer.parseInt(scan.nextLine());
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			if(checkPrime(i)) sum += i;
		}
		System.out.println("Tong cac so nguyen to tu 1 den n: " + sum);
	}

}
