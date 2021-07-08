package stringJava;
// String Comparison in java
public class StringComparasion {

	public static void main(String[] args) {
		String a = "Madan"; //String literal
		String b = new String("Madan"); // new keyword
		if(a.equals(b)){
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}

}
