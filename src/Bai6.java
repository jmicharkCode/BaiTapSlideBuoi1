import java.util.Scanner;

public class Bai6 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Nhap chuoi: ");
		String line = scan.nextLine();
		for(int i = line.length() - 1; i >= 0; i--) {
			System.out.print(line.charAt(i));
		}
	}
}
