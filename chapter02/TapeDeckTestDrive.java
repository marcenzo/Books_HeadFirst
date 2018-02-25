package br.com.headfirstjava.chapter02;


class TapeDeck{
	boolean canRecord = false;

	void playTape() {
		System.out.println("Tape playing!");
	}

	void recordTape() {
		System.out.println("Tape recording!");
	}
}

public class TapeDeckTestDrive {
	public static void main(String[] args) {
		TapeDeck t = new TapeDeck(); //I did create a object "t"

		t.canRecord = true;
		t.playTape();

		if (t.canRecord == true) {
			t.recordTape();
		}
	}

}
