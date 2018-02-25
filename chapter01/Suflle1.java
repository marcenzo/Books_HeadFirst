package br.com.headfirstjava.chapter01;

public class Suflle1 {
	void creatExercise() {
		int x = 3;

		if (x > 2) {
			System.out.print("Result: [a");
		}
		x = x -1;
		System.out.print("-");


		if (x == 2) {
			System.out.print("b c");

			x = x - 1;	
			System.out.print("-");

			if (x == 1) {
				System.out.print("d]");	

			}
		}
	}


	public static void main(String[] args) {
		Suflle1 s = new Suflle1();
		s.creatExercise();
	}

}
