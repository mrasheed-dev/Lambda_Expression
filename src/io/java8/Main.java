package io.java8;

public class Main 
{
public static void main(String[] args) 
{
//	Greet greet = new Greet();
//	greet.sayHello();
	
	
	
	
	//first anonymus class
	Greeting greeting = new Greeting() 
	{
		@Override
		public void sayHello()
		{
			System.out.println("Saying hello for the first time...");
		}
	};
	greeting.sayHello();
	
	
	
	//second Anonymus class
	Greeting greeting2 = new Greeting() 
	{
		@Override
		public void sayHello()
		{
			System.out.println("Saying hello for the Second Time...");
		}
	};
	greeting2.sayHello();
}
}
