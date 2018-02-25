package br.com.headfirstjava.chapter01;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;


public class Party {
	public void buildInvitide() {
		@SuppressWarnings("unused")
		Frame frame = new Frame();
		Label label = new Label("Party at Tim's.");
		Button buttonA = new Button("Ÿob bet");
		@SuppressWarnings("unused")
		Button buttonB = new Button("Shoot me!"); 
		Panel panel = new Panel();
		panel.add(buttonA, label);
		//panel.add(buttonB);

	}

	public void Init() {
		buildInvitide();
	}

	public static void main(String[] args) {
		Party p = new Party();

		p.Init();

		System.out.println("Out the dades!");
	}
}