import java.util.Scanner;

public class Bai19 {
	public static void main(String[] args) {
		printMenu();
		doMenu();
	}

	private static void doMenu() {
		int nhap;
		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		do {
			System.out.print("Nhap lua chon: ");
			nhap = Integer.parseInt(scan.nextLine());
			switch (nhap) {
			case 1:
				giaiPhuongTrinhBac1();
				break;
			case 2:
				giaiPhuongTrinhBac2();
				break;
			case 0:
				System.out.println("Ket thuc chuong trinh");
				flag = false;
				break;
			default:
				System.out.println("Nhap theo huong dan");
				printMenu();
				break;
			}
		} while (flag);
	}

	private static void printMenu() {
		System.out.println("------- Chuong trinh --------");
		System.out.println("Nhap 1: Giai phuong trinh bac 1");
		System.out.println("Nhap 2: Giai phuong trinh bac 2");
		System.out.println("Nhap 0: Thoat chuong trinh");
	}

	private static void giaiPhuongTrinhBac1() {
		System.out.println("Giai phuong trinh ax + b = 0");
		Scanner scan = new Scanner(System.in);
		System.out.print("Nhap a: ");
		float a = Float.parseFloat(scan.nextLine());
		System.out.print("Nhap b: ");
		float b = Float.parseFloat(scan.nextLine());
		if (a == 0) {
			if (b == 0)
				System.out.println("Phuong trinh vo so nghiem");
			else
				System.out.println("Phuong trinh vo nghiem");
		} else
			System.out.println("Phuong trinh co nghiem x = " + (float) (-b / a));
	}

	private static void giaiPhuongTrinhBac2() {
		float a, b, c, x1, x2, delta;
		String ketQua = "";
		Scanner scan = new Scanner(System.in);

		System.out.println("Giai phuong trinh ax^2 + bx + c = 0");

		do {
			System.out.print("Nhap a (a # 0): ");
			a = Float.parseFloat(scan.nextLine());
		} while (a == 0);
		System.out.print("Nhap b: ");
		b = Float.parseFloat(scan.nextLine());
		System.out.print("Nhap c: ");
		c = Float.parseFloat(scan.nextLine());

		delta = (float) (Math.pow(b, 2) - 4 * a * c);

		if (delta < 0) {
			ketQua = "Phuong trinh vo nghiem!";
		} else if (delta == 0) {
			x1 = x2 = -b / (2 * a);
			ketQua = "Phuong trinh co nghiem duy nhat x = " + x1;
		} else {
			x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
			x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
			ketQua = "Phuong trinh có 2 nghiem x1 = " + x1 + " và x2 = " + x2 ;
		}

		System.out.println(ketQua);
	}
}