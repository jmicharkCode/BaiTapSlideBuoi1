import java.util.Scanner;

public class TinhTienKaraoke {
	public static final int GIA_CHAI_NUOC = 10000;
	public static final int GIA_TRONG_3_GIO = 30000;
	public static final float PHAN_TRAM_GIAM_GIA = 0.2f;
	public static final float PHAN_TRAM_GIO_KE_TIEP = 0.3f;

	public static int hour, minute;

	public static void nhap() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Nhap so gio: ");
		hour = Integer.parseInt(scan.nextLine());
		System.out.print("Nhap so phut: ");
		minute = Integer.parseInt(scan.nextLine());
	}

	public static float tinhTienTrong3Gio(float usingTime, int soChaiNuoc) {
		return GIA_TRONG_3_GIO * usingTime + soChaiNuoc * GIA_CHAI_NUOC;
	}

	public static float tinhTien(float startingTime, float endingTime, int soChaiNuoc) {
		float tienThanhToan;

		float usingTime = endingTime - startingTime;
		if (startingTime <= 17) {
			if (usingTime <= 3)
				tienThanhToan = tinhTienTrong3Gio(usingTime, soChaiNuoc) * (1 - PHAN_TRAM_GIAM_GIA);
			else {
				float tienTrong3h = tinhTienTrong3Gio(3, soChaiNuoc);
				tienThanhToan = (tienTrong3h + PHAN_TRAM_GIO_KE_TIEP * GIA_TRONG_3_GIO * (usingTime - 3))
						* (1 - PHAN_TRAM_GIAM_GIA);
			}
		} else {
			if (usingTime <= 3)
				tienThanhToan = tinhTienTrong3Gio(usingTime, soChaiNuoc);
			else {
				tienThanhToan = tinhTienTrong3Gio(3, soChaiNuoc)
						+ PHAN_TRAM_GIO_KE_TIEP * GIA_TRONG_3_GIO * (usingTime - 3);
			}
		}
		return tienThanhToan;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float startingTime, endingTime;

		System.out.println("Gio bat dau: ");
		nhap();
		startingTime = hour + (float) minute / 60.0f;

		System.out.println("Gio ket thuc: ");
		nhap();
		endingTime = hour + (float) minute / 60.0f;

		System.out.print("So chai nuoc da uong: ");
		int soChai = Integer.parseInt(scan.nextLine());

		System.out.println("Tong chi phi: " + tinhTien(startingTime, endingTime, soChai));

	}

}
