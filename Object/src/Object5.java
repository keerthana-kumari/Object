
public class Object5 {
	public static void main(String[] args) {
		Object5 obj = new Object5();
		
		// After calling testMethod we will get Output
		obj.testMethod();
		// here we are not calling testMethod1 so the o/p will be only testMethod
	}

	public void testMethod() {
		System.out.println("Test Method1");
	}

	public void testMethod1() {
		System.out.println("Test Method2");
	}
}
