package br.com.headfirstjava.chapter01;

public class TestE {
	void methodtheExercise() {

		int y = 0;
		int x = 0;

		while (x < 5) {

			if (y < 5) {
				x = x + 1;
				if (y < 3) {
					x = x - 1;
				}
			}
			y = y + 2;
			
			System.out.print(x + "" + y + " ");
			x = x + 1;
		}
	}

	public static void main(String[] args) {

		TestE t = new TestE();
		t.methodtheExercise();

		//Respost:02 14 36 48 
	}

}