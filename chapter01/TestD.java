package br.com.headfirstjava.chapter01;

public class TestD {
	void methodtheExercise() {

		int y = 0;
		int x = 0;

		while (x < 5) {

			 x = x + 1;
			 
			 y = y + x; 
		
			


			System.out.print(x + "" + y + " ");
			x = x + 1;
		}
	}

	public static void main(String[] args) {

		TestD t = new TestD();
		t.methodtheExercise();

		//Respost:11 34 59   
	}

}
