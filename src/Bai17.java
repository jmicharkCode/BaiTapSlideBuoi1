import java.util.Scanner;

public class Bai17 {
	public static final int MAX = 1000;
	public static final int MIN = 1;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int randNum = (int) ((Math.random()) * ((MAX - MIN) + 1) + MIN);
		int num;
		
		do {
			System.out.print("Nhap so ban doan: ");
			num = Integer.parseInt(scan.nextLine());
			if(num > randNum) System.out.println("Ban dang nhap mot so lon hon so bi mat");
			else if(num < randNum) System.out.println("Ban dang nhap mot so nho hon so bi mat");
			else System.out.println("Ban da nhap dung so!");
		} while(num != randNum);
	}

}
