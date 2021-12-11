import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai13 {
	public static void printMenu() {
		System.out.println("Bam so theo menu:" + " \r1. Tinh gia tri trung binh"
				+ " \r2. Tim phan tu lon nhat, nho nhat" + "	\r3. Tim phan tu am lan nhất, nho nhat trong mang"
				+ "	\r4. Tim phan tu duong lon nhat, nho nhat trong mang" + "	\r5. In ra cac phan tu chan, le"
				+ "	\r6. Them mot phan tu theo index" + "	\r7. Xoa mot phan tu theo index" + "\n8. Thoat");
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		do {
			System.out.println("----- Chuong Trinh -------");
			System.out.println("Nhap 1 de tao mang");
			System.out.println("Nhap 2 de thoat");
			int nhap = Integer.parseInt(scan.nextLine());
			switch(nhap) {
			case 1:
				List<Float> arr = nhapMang(scan);
				printMenu();
				do {
					System.out.println("Moi nhap phim chuc nang: ");
					int button;
					button = Integer.parseInt(scan.nextLine());
					if(button == 8) break;
					// Chay chuong trinh
					doMenu(scan, arr, button);
				} while(true);
				break;
			case 2:
				System.out.println("Ket thuc chuong trinh");
				flag = false;
				break;
			}
		} while(flag);
		
	}

	private static List<Float> nhapMang(Scanner scan) {
		System.out.println("Nhap so phan tu cua mang: ");
		int n = Integer.parseInt(scan.nextLine());
		List<Float> arr = new ArrayList<Float>();
		System.out.println("Nhap tung phan tu trong mang: ");
		for (int i = 0; i < n; i++) {
			Float num = Float.parseFloat(scan.nextLine());
			arr.add((float) num);
		}
		System.out.println("Mang hien tai la: ");
		for(float pt: arr) {
			System.out.print(pt + " ");
		}
		System.out.println();
		return arr;
	}

	private static void doMenu(Scanner scan, List<Float> arr, int button) {
		boolean flag;
		
		switch (button) {
		case 1:
			tinhGiaTriTB(arr);
			break;
		case 2:
			timPhanTuMaxvaMin(arr);
				break;
		case 3:
			timPhanTuAmMaxVaMin(arr);
			break;
		case 4:
			timPhanTuDuongMaxVaMin(arr);
			break;
		case 5: 
			inRaPhanTuChanVaLe(arr);
			break;
		case 6:
			themPhanTu(scan, arr);
			break;
		case 7:
			xoaPhanTu(scan, arr);
			break;
		}
	}

	private static void xoaPhanTu(Scanner scan, List<Float> arr) {
		System.out.println("Nhap vi tri can xoa: ");
		int indexRe = Integer.parseInt(scan.nextLine());
		if(indexRe >= arr.size()) indexRe = arr.size();
		arr.remove(indexRe);
		System.out.println("Mang sau khi xoa: ");
		for(Float pt: arr) {
			System.out.print(pt + " ");
		}
		System.out.println();
	}

	private static void themPhanTu(Scanner scan, List<Float> arr) {
		System.out.println("Nhap phan tu can them: ");
		float addPT = Float.parseFloat(scan.nextLine());
		System.out.println("Nhap vi tri can them: ");
		int indexAdd = Integer.parseInt(scan.nextLine());
		if(indexAdd >= arr.size()) indexAdd = arr.size();
		arr.add(indexAdd, addPT);
		System.out.println("Mang sau khi them: ");
		for(Float pt: arr) {
			System.out.print(pt + " ");
		}
		System.out.println();
	}

	private static void inRaPhanTuChanVaLe(List<Float> arr) {
		List<Float> listChan = new ArrayList<Float>();
		List<Float> listLe = new ArrayList<Float>();
		for(int i = 0; i < arr.size(); i++) {
			if(Math.abs(arr.get(i)) % 2 == 0) {
				listChan.add(arr.get(i));
			}
			if(Math.abs(arr.get(i))% 2 == 1) {
				listLe.add(arr.get(i));
			}
		}
		System.out.println("Cac phan tu chan: ");
		for(int i = 0; i < listChan.size(); i++) {
			System.out.println(listChan.get(i) + " ");
		}
		System.out.println("Cac phan tu le: ");
		for(int i = 0; i < listLe.size(); i++) {
			System.out.println(listLe.get(i) + " ");
		}
	}

	private static void timPhanTuDuongMaxVaMin(List<Float> arr) {
		boolean flag;
		float maxIn = 0;
		float minIn = 0;
		int tempIn = 0;
		flag = false;
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) > 0) {
				maxIn = arr.get(i);
				minIn = arr.get(i);
				tempIn = i;
				flag = true;
				break;
			}
		}
		if (!flag)
			System.out.println("Khong co phan tu duong trong mang");
		else {
			for (int i = tempIn + 1; i < arr.size(); i++) {
				if (maxIn < arr.get(i) && arr.get(i) > 0)
					maxIn = arr.get(i);
				if (minIn > arr.get(i) && arr.get(i) > 0)
					minIn = arr.get(i);
			}
			System.out.println("Phan tu duong lon nhat: " + maxIn);
			System.out.println("Phan tu duong nho nhat: " + minIn);
		}
	}

	private static void timPhanTuAmMaxVaMin(List<Float> arr) {
		boolean flag;
		float maxPos = 0;
		float minPos = 0;
		int temp = 0;
		flag = false;
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) < 0) {
				maxPos = arr.get(i);
				minPos = arr.get(i);
				temp = i;
				flag = true;
				break;
			}
		}
		if (!flag)
			System.out.println("Khong co phan tu am trong mang");
		else {
			for (int i = temp + 1; i < arr.size(); i++) {
				if (maxPos < arr.get(i) && arr.get(i) < 0)
					maxPos = arr.get(i);
				if (minPos > arr.get(i) && arr.get(i) < 0)
					minPos = arr.get(i);
			}
			System.out.println("Phan tu am lon nhat: " + maxPos);
			System.out.println("Phan tu am nho nhat: " + minPos);
		}
	}

	private static void timPhanTuMaxvaMin(List<Float> arr) {
		float max = arr.get(0);
		float min = arr.get(0);
		for (int i = 1; i < arr.size(); i++) {
			if (max < arr.get(i))
				max = arr.get(i);
			if (min > arr.get(i))
				min = arr.get(i);
		}
		System.out.println("Phan tu lon nhat: " + max);
		System.out.println("Phan tu nho nhat: " + min);
	}

	private static void tinhGiaTriTB(List<Float> arr) {
		Float sum = 0.f;
		for (int i = 0; i < arr.size(); i++) {
			sum += arr.get(i);
		}
		System.out.println("Gia tri trung binh: " + (float)sum/arr.size());
	}

}
