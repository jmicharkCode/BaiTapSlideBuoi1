import java.util.Scanner;

import jdk.jfr.Unsigned;

public class Bai18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Nhap so tien gui: ");
		int tienGui = Integer.parseInt(scan.nextLine());
		System.out.print("Nhap so tien muon co: ");
		int tienMuonCo = Integer.parseInt(scan.nextLine());
		System.out.print("Nhap lai suat theo nam (don vi %): ");
		float laiSuatTheoPhanTram1Nam = Integer.parseInt(scan.nextLine());
		int soNam = 0;
		while(tienGui < tienMuonCo) {
			tienGui *= (1 + ((float)laiSuatTheoPhanTram1Nam / 100));
			soNam++;
		}
		System.out.println("So nam it nhat phai doi ke tu khi gui tien la: " + soNam);
	}

}
