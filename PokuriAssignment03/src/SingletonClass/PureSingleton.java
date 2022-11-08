/**
 * 
 */
package SingletonClass;

/**
 * @author S546647
 *
 * 
 */
public class PureSingleton {
	private static PureSingleton single_instance = null;
	public String s;
	private PureSingleton()
    {
        s = "Hello I am a string part of Singleton class";
    }
	public static PureSingleton getInstance()
    {
        if (single_instance == null)
            single_instance = new PureSingleton();
  
        return single_instance;
    }

}
class SingletonDriver {
    public static void main(String args[])
    {
    	PureSingleton x = PureSingleton.getInstance();
    	PureSingleton y = PureSingleton.getInstance();
    	PureSingleton z = PureSingleton.getInstance();
        System.out.println("Hashcode of x is "+ x.hashCode());
        System.out.println("Hashcode of y is "+ y.hashCode());
        System.out.println("Hashcode of z is " + z.hashCode());
        if (x == y && y == z) {
            System.out.println(
                "Three objects point to the same memory location on the heap i.e, to the same object");
        }
        else {
            System.out.println(
                "Three objects DO NOT point to the same memory location on the heap");
        }
    }
}
