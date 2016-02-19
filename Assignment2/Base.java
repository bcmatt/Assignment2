import java.util.Arrays;

class Base {
    // This method will be hidden in Derived
    public static void displayarray() {
    	String arryNum[] = new String[] {"John","Bob","Joe","Mike"};
        System.out.println(Arrays.toString(arryNum));
        }
     // Non-static method which will be overridden in derived class 
     public void print()  {
    	int L;
     	L = 4;
         System.out.println("Non-static or Instance method from Base");
    }
}