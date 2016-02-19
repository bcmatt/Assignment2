
public class Test {
    public static void main(String args[ ])  {
       Base test = new Extended();
       //Calls to class Extended static overridden method. Since static method can not be overridden, it 
       // calls Base's displayarray() instead 
       test.displayarray(); 
       try {Thread.sleep(3000);}
   		catch (Exception e){}
       // Since print is not static overriding works so the Base method is overwritten by the derived method
       test.print();     
    }
}