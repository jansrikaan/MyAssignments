package week3.day1;

public class ChromeC extends BrowserP {
	
	public void openINcognito() {
		System.out.println("This is openIncognito ");

	}
	public void clearCache() {
		System.out.println("THis is clearCache");

	}
	
	public static void main(String[] args) {
		ChromeC cc = new ChromeC();
		cc.clearCache();
		cc.closeBrowser();
		cc.openINcognito();
		cc.clearCache();
	}

}
