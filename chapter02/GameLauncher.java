package br.com.headfirstjava.chapter02;

class GuessGame{
	Player p1, p2, p3;

	public void starGame() {
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();

		int guessp1 = 0;
		int guessp2 = 0;
		int guessp3 = 0;

		boolean p1isRight = false;
		boolean p2isRight = false;
		boolean p3isRight = false;

		int targetNumber = (int) (Math.random() * 10);
		System.out.println("I'm thinking of a number between 0 is 9...");

		while (true) {
			System.out.println("The number the guess is " + targetNumber + "\n");

			p1.guess();
			p2.guess();
			p3.guess();

			guessp1 = p1.number;
			System.out.println("\n" + "The Player one provides the hunch " + guessp1 );

			guessp2 = p2.number;
			System.out.println("The Player two provides the hunch " + guessp2);

			guessp3 = p3.number;
			System.out.println("The Player three provides the hunch " + guessp3 + "\n");


			if(guessp1 == targetNumber) {
				p1isRight = true;
			}

			if(guessp2 == targetNumber) {
				p2isRight = true;
			}

			if(guessp3 == targetNumber) {
				p3isRight = true;
			}


			if(p1isRight || p2isRight || p3isRight) {
				System.out.println("Have a win!" + "\n");
				System.out.println("The player one hit " + p1isRight);
				System.out.println("The player two hit " + p2isRight);
				System.out.println("The player three hit " + p3isRight);
				System.out.println("End the Game!");
				break;
			}else {
				System.out.println("The players will have what try again! ");

			}
		}
	}
}

class Player{
	int number = 0;

	void guess() {
		number = (int) (Math.random() * 10);
		System.out.println(" I am thinking in the a number " + number);

	}
}

public class GameLauncher {
	public static void main(String[] args) {
		GuessGame game = new GuessGame();
		game.starGame();

	}

}
