package Assignment;

//Java Program to Demonstrate Inherited constructor
//calls the parent constructor by default

//Class 1
//Main class
class Main {

	// Main driver method
	public static void main(String[] a)
	{
		// Inherited constructor calling
		new child();
		new child(100);
	}
}

//Class 2
//Parent class (Helper class)
class parent {

	// Constructor of parent class
	parent()
	{
		// Print statement
		System.out.println("I am parent class constructor");
	}
}

//Class 3
//Child class (Helper class)
class child extends parent {

	// Constructor 1
	// Constructor of child class
	child()
	{
		// Print statement
		System.out.println("I am child class constructor");
	}

	// Constructor 2
	// Constructor of child class
	child(int x)
	{
		// Print statement
		System.out.println(
			"I am param child class constructor");
	}
}

