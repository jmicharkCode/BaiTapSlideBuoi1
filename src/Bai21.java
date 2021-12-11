import java.util.Scanner;

public class Bai21 {
	public static void main(String[] args) {
		float x1, x2, v1, v2;
		Scanner scan = new Scanner(System.in);
		System.out.print("Nhap vi tri cua kan1: ");
		x1 = Float.parseFloat(scan.nextLine());
		System.out.print("Nhap toc do cua kan1: ");
		v1 = Float.parseFloat(scan.nextLine());
		System.out.print("Nhap vi tri cua kan2: ");
		x2 = Float.parseFloat(scan.nextLine());
		System.out.print("Nhap toc do cua kan2: ");
		v2 = Float.parseFloat(scan.nextLine());
		
		float count = (x2 - x1) / (v1 - v2);
		if(count >  (int)count) System.out.println("2 con Kan khong gap duoc nhau");
		else System.out.println("2 con Kan gap duoc nhau");
	}
}
