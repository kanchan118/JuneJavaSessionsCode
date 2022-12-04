package oop_encapsulation;

public class Browser {

	public void launchBrowser() {
		System.out.println("launching browser");
		checkBrowserVersion();
		checkOSCompatible();
		enoughRAMSpace();
		checkBrowserUpgrade();

	}

	private void checkBrowserVersion() {
		System.out.println("checkBrowserVersion");
	}

	private void checkOSCompatible() {
		System.out.println("checkOSCompatible");
	}

	private void enoughRAMSpace() {
		System.out.println("enoughRAMSpace");
	}

	private void checkBrowserUpgrade() {
		System.out.println("checkBrowserUpgrade");
	}

}
