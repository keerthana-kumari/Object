
public class Object4 {

	 float i = 10.00f;
	 static float j=20.00f;
	 public static void main(String[] args) {
		 Object4 obj=new Object4();
	 	System.out.println(obj.i);
	 	System.out.println(obj.i+5);
	 	System.out.println(j);      // Static members are directly called without object creation
	 	}
	 
}
