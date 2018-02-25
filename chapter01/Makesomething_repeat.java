/**
 * 
 */
package br.com.headfirstjava.chapter01;

/**
 * @author Apple
 *
 */
public class Makesomething_repeat {

	void init()
	{
		loop();
	}

	void loop()
	{

		int x = 5;

		while(x < 20)

		{
			x = x + 1;

			System.out.println(x);

		}

	}


	public static void main(String[] args) {
		Makesomething_repeat m = new Makesomething_repeat(); 

		m.init();


	}

}
