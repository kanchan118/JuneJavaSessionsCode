package OOP_MultipleInheritance;

public class Page extends Web{	
	
	@Override	
	public void getColor() {
		System.out.println("Page -- Red Color");
	}
	
	public void getPageLoadTimeOut() {
		System.out.println("Page -- 20 secs");
	}
	
	

}
 