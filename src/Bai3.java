
public class Bai3 {

	public static void main(String[] args) {
		
		String version = System.getProperty("java.version");
		System.out.println("Java version: " + version);
		System.out.println("Java Runtime Version: " +System.getProperty("java.runtime.version"));
	
		String vm = System.getProperty("java.home");
		System.out.println("Java Home: " + vm);
		String vendor = System.getProperty("java.vendor");
		System.out.println("Java Vendor: " + vendor);
		String vendorUrl = System.getProperty("java.vendor.url");
		System.out.println("Java Vendor URL: " + vendorUrl);
		String classPath = System.getProperty("java.clash.path");
		System.out.println("Java Class Path: " + classPath);
	
	}
}
