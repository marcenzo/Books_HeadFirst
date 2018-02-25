package br.com.headfirstjava.chapter01;

public class Exercise1b_c {

	void methodtheExercise() {
		
		int x = 5;
		x = x - 3;

		while (x > 1) {
			x = x - 1;

			if (x < 3) {
				System.out.println("small X");
			}
		}
	}


	public static void main(String[] args) {
		Exercise1b_c e = new Exercise1b_c();
		e.methodtheExercise();

	}

}
