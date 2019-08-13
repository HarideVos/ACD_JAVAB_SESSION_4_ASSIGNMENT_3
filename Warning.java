package fourpointthree;

public class Warning {
	public void overloadMethod() {
		System.out.println("overloadMethod with no parameters");
	}
	public void overloadMethod(int i) {
		this.overloadMethod();
		System.out.println("overloadMethod with 1 parameter: " + i);
	}
	
	public static void main(String[] args) {
		Warning eo = new Warning();
		eo.overloadMethod(3);
	}
}
