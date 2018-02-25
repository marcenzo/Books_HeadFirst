package br.com.headfirstjava.chapter01;

public class LoopWhileAgain {

	public static void main(String[] args) 
	{
		int x = 1;

		System.out.println("before loop!");
		System.out.println("The value is " + x );

		while(x < 4) {
			System.out.println("\nInside the Loop!" );
			System.out.println("The value is " + x );
			
			x = x + 1;
		}
		
		System.out.println("\nThis is the end the Loop!");
		System.out.println("The value is " + x );


	}

}
