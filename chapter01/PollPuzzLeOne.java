package br.com.headfirstjava.chapter01;

public class PollPuzzLeOne {
	void methodtheExercise() {

		int x = 0 ;

		while (x < 4) {//I added

			System.out.print("a");//I added

			if (x < 1) { //this fixed on book
				System.out.print(" ");//I added
			}

			System.out.print("n");//I added

			if (x > 1) {//I added
				System.out.print(" oyster ");//I added
				x = x + 2;
			}

			if (x == 1) {//this fixed on book

				System.out.print("noys ");//I added
			}
			if (x < 1) {//I added

				System.out.print("oise");//I added
			}

			System.out.println("");//this fixed on book
			x = x + 1;

		}

	}



	public static void main(String[] args) {
		PollPuzzLeOne p = new PollPuzzLeOne();
		p.methodtheExercise();



	}

}
