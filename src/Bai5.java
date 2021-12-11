import java.util.Scanner;

class ToaDo {
	float x;
	float y;
	
}

public class Bai5 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ToaDo A = new ToaDo();
		ToaDo B = new ToaDo();
		System.out.println("Nhap toa do A: ");
		System.out.print("x: ");
		A.x = Float.parseFloat(scan.nextLine());
		System.out.print("y: ");
		A.y = Float.parseFloat(scan.nextLine());
		System.out.println("Nhap toa do B: ");
		System.out.print("x: ");
		B.x = Float.parseFloat(scan.nextLine());
		System.out.print("y: ");
		B.y = Float.parseFloat(scan.nextLine());
		
		double doDai = Math.sqrt(Math.pow(A.x - B.x, 2) + Math.pow((A.y - B.y), 2));
		System.out.println("Do dai doan thang AB: " + doDai) ;
	}

}
