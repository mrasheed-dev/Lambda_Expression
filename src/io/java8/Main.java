package io.java8;

public class Main 
{
public static void main(String[] args) 
{
//	Greet greet = new Greet();
//	greet.sayHello();
	
	
	
	
//	//first anonymus class
//	Greeting greeting = new Greeting() 
//	{
//		@Override
//		public void sayHello()
//		{
//			System.out.println("Saying hello for the first time...");
//		}
//	};
//	greeting.sayHello();
//	
//	
//	
//	//second Anonymus class
//	Greeting greeting2 = new Greeting() 
//	{
//		@Override
//		public void sayHello()
//		{
//			System.out.println("Saying hello for the Second Time...");
//		}
//	};
//	greeting2.sayHello();
	
	
	//using interface with the help of lambda expression
	
	Greeting greeting = ()->
	{
		System.out.println("Very first lambda expression");
	};
	greeting.sayHello();
	
	Greeting greeting2 = ()->
	{
		System.out.println("second lambda expression...");
	};
	greeting2.sayHello();
}
}
