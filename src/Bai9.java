import java.util.Scanner;

public class Bai9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap so 1: ");
		int so1 = Integer.parseInt(scan.nextLine());
		System.out.println("Nhap so 2: ");
		int so2 = Integer.parseInt(scan.nextLine());
		
		int temp1 = so1 / 10;
		int temp2 = so2 / 10;
		boolean flag = false;
		if((so1 % 10) == (so2 % 10)) {
			flag = true;
		}
		else if(temp1 == (so2 % 10)) {
			flag = true;
		}
		else if(temp2 == (so1 % 10) ) {
			flag = true;
		}
		else if(temp2 == temp1) {
			flag = true;
		}
		else {
			flag = false;
		}
		System.out.println(flag);
	}

}
