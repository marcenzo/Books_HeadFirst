package br.com.headfirstjava.chapter01;

public class TestB {
	void methodtheExercise() {

		int y = 0;
		int x = 0;

		while (x < 5) {

			 y = y + x;


			System.out.print(x + "" + y + " ");
			x = x + 1;
		}
	}

	public static void main(String[] args) {

		TestB t = new TestB();
		t.methodtheExercise();

		//Respost: 00 11 23 36 410

	}

}

