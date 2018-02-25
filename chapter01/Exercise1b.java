package br.com.headfirstjava.chapter01;

public class Exercise1b {
	void methodtheExercise() {
		int x = 1;

		while (x < 10) {
			x = x + 1;
		}	
			if (x > 3) {
				System.out.println("big x");
			}
		}
	
	
	
	public static void main(String[] args) {
		Exercise1b e = new Exercise1b();
		e.methodtheExercise();

	}

}
