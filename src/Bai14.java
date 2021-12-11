import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai14 {
	public static boolean kiemTraTrungLap(List<Float> arr, float num) {
		for (Float pt : arr) {
			if (num == pt) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap so phan tu cua mang: ");
		int n = Integer.parseInt(scan.nextLine());
		List<Float> arr = new ArrayList<Float>();
		System.out.println("Nhap tung phan tu trong mang: ");
		for (int i = 0; i < n; i++) {
			Float num = Float.parseFloat(scan.nextLine());
			arr.add((float) num);
		}
		System.out.println("Mang hien tai la: ");
		for (float pt : arr) {
			System.out.print(pt + " ");
		}
		System.out.println();
		List<Float> listXuatHien1Lan = new ArrayList<Float>();
		int i = 0;
		while (i < arr.size()) {
			if (kiemTraTrungLap(listXuatHien1Lan, arr.get(i))) {
				listXuatHien1Lan.add(arr.get(i));
				i++;
			} else {
				arr.remove(i);
			}
		}
		System.out.println("Mang sau khi xoa cac phan tu lap lai la: ");
		for (Float pt : arr) {
			System.out.print(pt + " ");
		}
	}

}
