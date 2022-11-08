/**
 * 
 */
package OverrideStaticPrivate;

/**
 * @author S546647
 *
 * 
 */
class OverrideStaticPrivate {
	private static void display() {
		System.out.println("Static or class method from SuperClass");
		}
}
class OvrStPrivate extends OverrideStaticPrivate {
	private static void display() {
		System.out.println("Static or class method from Subclass");
	}
}

class DriverClass {

public static void main(String args[]){
	OverrideStaticPrivate obj= new OvrStPrivate();
	obj.display();
	} 
	
}
