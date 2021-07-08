package arrayJava;


public class ArrayDuplicate {
	
	void findD(int a[], int n) {
		int i;

        for (  i = 0; i < n; i++) {
            int j = Math.abs(a[i]);
            if(a[j] >= 0) 
                a[j] = -a[j];
            
            else 
                System.out.print(j+ " ");
            

        }
    }
    public static void main(String []args) {
        
        ArrayDuplicate ar = new ArrayDuplicate();
        int a[] = { 1, 2, 3, 1, 3, 6, 6 };
         int  n =a.length;
       
          ar.findD(a,n);
    }

    
}