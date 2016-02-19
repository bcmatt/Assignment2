import java.util.Arrays;

class Extended extends Base {
    // This method is hidden  
    public static void displayarray() {
    	String[] arryNum2 = new String[] {"John","Mike","Bob","Joe"};
    	System.out.println(Arrays.toString(arryNum2));
        } 
    // This method overrides the print method in Base 
    public void print() {
    	int L;
    	L = 3;
        System.out.println("The int in Derived is " + 3);
   }
}