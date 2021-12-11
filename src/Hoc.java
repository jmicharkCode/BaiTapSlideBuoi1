import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hoc {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		int num;
		for(int i = 0; i < 5; i++) {
			num = Integer.parseInt(scan.nextLine());
			list.add(num);
		}
		boolean flag = true;
		for(int j = 0; j < list.size()/2; j++) {
			if(list.get(j) != list.get(list.size() - 1 - j)) {
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println("Day Palidrome");
		}
		else {
			System.out.println("Khong phai day Palidrome");
		}
	}
}