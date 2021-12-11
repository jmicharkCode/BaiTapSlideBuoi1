import java.util.Scanner;

public class Bai8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap chuoi: ");
		String line = scan.nextLine();
		char s = line.charAt(0);
		s -= 32;
		line = line.replace(line.charAt(0), s);
		System.out.println(line);
	}
}
		
		

