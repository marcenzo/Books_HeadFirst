package br.com.headfirstjava.chapter01;

public class PhraseOmatic {
	void creatExercise(){

		String [] wordListOne = {"24/7", "several layers", "30.000 feet", "B-to-B", "everybody wins ","Front-end", "based in web", 
				"widespread", "intelligent" , "Six sigma", "Critic way", "dinamic " };

		String [] wordListTwo = {"Habilited" , "Adevise", "Value agregred", "Oriented","Central","Distributed","grouped","Solidified",
				"Independent the machine", "Positioned", "Networking", "Dedicated", "Shared","cooperative", "accelerated" };	

		String [] wordListThree = {"Process", "Point", "Maximum","Solution","Architecture","Habilitation in the core","Strategy","MindShare", "Portal",
				"Space", "Vision" , "Paradigm" , "Mission"};

		int OneLenght = wordListOne.length;
		int TwoLenght = wordListTwo.length;
		int ThreeLenght = wordListThree.length;

		int rand1 = (int)(Math.random()* OneLenght);
		int rand2 = (int)(Math.random()* TwoLenght);
		int rand3 = (int)(Math.random()* ThreeLenght);

		String Phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

		System.out.println("We need = [" + Phrase + "]");

	}


	public static void main(String[] args) {
		PhraseOmatic p = new PhraseOmatic();
		p.creatExercise();

	}

}
