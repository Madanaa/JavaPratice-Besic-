package stringJava;

public class StringLiteral {

	public static void main(String[] args) {
		String a = "Madan";// literal
		System.out.println(a);
		
		String b = "Madan kumar";
		System.out.println(b);
		a = a.concat(" singh");
         System.out.println(a);//not concat bcs string is immutable 
	}

}
