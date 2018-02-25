package br.com.headfirstjava.chapter02;

class Dog{

	int size;
	String breed , name;

	void bark() {
		System.out.println("Output = [Ruff! Ruff]");
	}
}


public class DogTestDrive {
	public static void main(String[] args) {
		Dog d = new Dog();
		
		d.size = 40;
		d.bark();
	}
}
