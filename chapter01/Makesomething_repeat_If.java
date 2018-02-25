package br.com.headfirstjava.chapter01;

public class Makesomething_repeat_If {

	public static void main(String[] args) {

		String name = "Dirk" ; 
		int x = 10;

		if(x == 10)
		{
			System.out.println("x must be 10");
		}else {
			System.out.println("x isn't 10 ");
		}

		if((x > 2) && (name.equals("Dirk")))
		{
			System.out.println("Gently");
		}
		System.out.println("This line runs no matter what");
	}

}
