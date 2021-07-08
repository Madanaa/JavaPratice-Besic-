package stringJava;

public class StringReverse {

	public static void main(String[] args) {
	
		   String a = "Madan";
		   String b = "";
		   int l =a.length();// l =5            n      a    d    a    M
		   for(int i = l -1; i >=0; i--) // i = 4 ---->3--->2--->1--->0
		   
		   {
			   b = b + a.charAt(i);
		   }
		
		//StringBuilder r = new StringBuilder("Madan");
		//System.out.println(r.reverse());
		   System.out.println(b);
	}

}
