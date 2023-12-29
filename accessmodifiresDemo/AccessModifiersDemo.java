package accessmodifiresDemo;

public class AccessModifiersDemo {
	// Public variable accessible from anywhere
	 public int publicVar = 10;

	 // Protected variable accessible within the same package and subclasses
	 protected int protectedVar = 20;

	 // Default (package-private) variable accessible within the same package
	 int defaultVar = 30;

	 // Private variable accessible only within this class
	 private int privateVar = 40;

	 // Public method accessible from anywhere
	 public void publicMethod() {
	     System.out.println("Public method called");
	 }

	 // Protected method accessible within the same package and subclasses
	 protected void protectedMethod() {
	     System.out.println("Protected method called");
	 }

	 // Default (package-private) method accessible within the same package
	 void defaultMethod() {
	     System.out.println("Default method called");
	 }

	 // Private method accessible only within this class
	 private void privateMethod() {
	     System.out.println("Private method called");
	 }

	 // Main method to demonstrate access modifiers
	 public static void main(String[] args) {
	     AccessModifiersDemo example = new AccessModifiersDemo();

	     // Accessing variables
	     System.out.println("Public variable: " + example.publicVar);
	     System.out.println("Protected variable: " + example.protectedVar);
	     System.out.println("Default variable: " + example.defaultVar);
	     System.out.println("Private variable: " + example.privateVar);

	     // Accessing methods
	     example.publicMethod();
	     example.protectedMethod();
	     example.defaultMethod();
	     example.privateMethod();
	 }

}
