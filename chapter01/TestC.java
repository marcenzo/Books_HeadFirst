package br.com.headfirstjava.chapter01;

public class TestC {
	void methodtheExercise() {

		int y = 0;
		int x = 0;

		while (x < 5) {

			 y = y + 2;
			 
			 if (y > 4) {
				y = y - 1;
			}


			System.out.print(x + "" + y + " ");
			x = x + 1;
		}
	}

	public static void main(String[] args) {

		TestC t = new TestC();
		t.methodtheExercise();

		//Respost:  02 14 25 36 47

	}

}
