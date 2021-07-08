package stringJava;
// String Methods
public class StringMethods {

	public static void main(String[] args) {
		String a = "MADAN";
		String b = "Rahul";
		String c = "    madan   ";
		String d = "";
		System.out.println(a.toLowerCase());// lowerCase
		System.out.println(b.toUpperCase());// UpperCASE
		System.out.println(a.concat(b)+" ");//ADD
		System.out.println(a.length());//count char
		System.out.println(c.trim());//remove space
		System.out.println(d.isEmpty());// check space
		
		System.out.println(a.indexOf('A'));
		System.out.println(b.charAt(2));
		

	}

}
