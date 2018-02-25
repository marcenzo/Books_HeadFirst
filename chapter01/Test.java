package br.com.headfirstjava.chapter01;

public class Test {
	void methodtheExercise() {

		int y = 0;
		int x = 0;

		while (x < 5) {

			y = x - y;


			System.out.print(x + "" + y + " ");
			x = x + 1;
		}
	}

	public static void main(String[] args) {

		 
		Test t = new Test();
		t.methodtheExercise();
		
		//Respost: 00 11 21 32 42

	}

}
