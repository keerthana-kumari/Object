
public class Object2 {

	int i = 10;
	 static int j=20;
	 public static void main(String[] args) {
		 Object2 obj=new Object2();
	 	System.out.println(obj.i);
	 	System.out.println(obj.i+5);
	 	System.out.println(j);        // Static members are directly called without object creation
	 	}

}
