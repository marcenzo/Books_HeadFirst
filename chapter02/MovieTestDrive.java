package br.com.headfirstjava.chapter02;


class Movie{
	String title, genre;
	int rating;
	
	void playIt() {
		System.out.println("Playing the movie");
	}
}

class movieTestDrive {
	public static void main(String[] args) {
		
		Movie m1 = new Movie();
		m1.title = "Gone with the Stock";
		m1.genre = "Tragic";
		m1.rating = -2;
		
		Movie m2 = new Movie();
		m2.title = "Lost in Cubicle Space";
		m2.genre = "Comedy";
		m2.rating = 5;
		m2.playIt();
		
		Movie m3 = new Movie();
		m3.title = "Byte club";
		m3.genre = "Tragic but ultimately uplifting";
		m3.rating = 127;
	}

}
