package br.com.headfirstjava.chapter02;

class DVDplayer{
	boolean canRecord = false;

	void RecordDVD() {
		System.out.println("Dvd recording");
	}

	void playDVD() {//I did create a method "playDVD"
		System.out.println("Dvd playing");
	}
}

public class DVDplayerTestDrive {
	public static void main(String[] args) {

		DVDplayer d = new DVDplayer();
		d.canRecord = true;
		d.playDVD();

		if (d.canRecord == true) {
			d.RecordDVD();
		}

	}

}
