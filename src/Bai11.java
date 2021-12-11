import java.util.Scanner;

public class Bai11 {
	public static int log(int x, int base)
	{
	    return (int) (Math.log(x) / Math.log(base));
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap n: ");
		int n = Integer.parseInt(scan.nextLine());
		System.out.println("So tu nhien can tim: " + log(n, 2));

	}

}
