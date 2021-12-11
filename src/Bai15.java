import java.util.Scanner;

public class Bai15 {
	public static void printMenu() {
		System.out.println("1. In ra do dai cua chuoi");
		System.out.println("2. In ra ky tu (char) tai mot vi tri nhat ðinh (index)");
		System.out.println("3. Kiem tra xem, trong chuoi vua nhap co chuoi phu \"abcdef\" hay khong");
		System.out.println("4. Thoat");
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		do {
			System.out.println("Nhan 1 de nhap chuoi");
			System.out.println("Nhan 2 de thoat");
			int nhap = Integer.parseInt(scan.nextLine());
			switch(nhap) {
			case 1:
				System.out.println("Nhap chuoi: ");
				String s = scan.nextLine();
				System.out.println("Chon cac thao tac sau day");
				printMenu();
				do {
					System.out.print("Chon: ");
					int button = Integer.parseInt(scan.nextLine());
					if(button == 4) break;
					xuLy(scan, s, button);
				} while(true);
			case 2:
				System.out.println("Ket thuc chuong trinh");
				flag = false;
				break;
			}
		} while(flag);
	}

	public static void xuLy(Scanner scan, String s, int button) {
		switch (button) {
		case 1:
			System.out.println("Do dai cua chuoi: " + s.length());
			break;
		case 2:
			System.out.print("Chon vi tri can in ky tu: ");
			int index = Integer.parseInt(scan.nextLine());
			System.out.println("Ki tu tai vi tri thu " + index + " la: " + s.charAt(index));
			
			break;
		case 3:
			System.out.print("Nhap chuoi con can tim: ");
			String subS = scan.nextLine();
			if (s.contains(subS))
				System.out.println("Chuoi " + subS + " la chuoi con cua " + s);
			else
				System.out.println("Chuoi " + subS + " khong la chuoi con cua " + s);
			break;
		default:
			System.out.println("Moi nhap dung theo huong dan");
			printMenu();
			break;
		}
	}
}
