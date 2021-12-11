import java.util.Scanner;

public class Bai20 {
	public static void main(String[] args) {
	    int n, c, d;
	    Scanner scanner = new Scanner(System.in);
	         
	    do {
	        System.out.println("Nhap vao so phan tu cua mang: ");
	        n = scanner.nextInt();
	    } while (n <= 0);
	         
	    int A[] = new int[n];
	    int chan[] = new int[n]; 
	    int le[] = new int[n];  
	         
	    System.out.println("Nhap cac phan tu cho mang: ");
	    for (int i = 0; i < n; i++) {
	        System.out.print("Nhap phan tu thu " + i + ": ");
	        A[i] = scanner.nextInt();
	    }
	    // c: so phan tu mang chan
	    // d: so phan tu mang le
	    c = d = 0;
	         
	    for (int i = 0; i < n; i++) {
	        if (A[i] % 2 == 0) {
	            chan[c] = A[i];
	            c++;
	        } else {
	            le[d] = A[i];
	            d++;
	        }
	    }
	         
	    System.out.println("Mang chan: ");
	    for (int i = 0; i < c; i++) {
	        System.out.print(chan[i] + " ");
	    }
	         
	    System.out.println("\nMang le: ");
	    for (int i = 0; i < d; i++) {
	        System.out.print(le[i] + " ");
	    }
	}
}
