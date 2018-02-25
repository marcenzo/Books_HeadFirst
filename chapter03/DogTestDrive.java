package br.com.headfirstjava.chapter03;

class Dog{
    String name;

    void DogBark() {
	System.out.println(name + " Au Au! ");
    }
}

public class DogTestDrive {
    public static void main(String[] args) {

	//Create One Object Dog
	Dog dog1 = new Dog();
	//dog1.DogBark();
	dog1.name = "Bela ";

	//Create a matrix myDogs

	Dog [] myDogs = new  Dog[3];

	myDogs [0] = new Dog();
	myDogs [1] = new Dog();
	myDogs [2] = dog1;

	myDogs[0].name = "Maisa";
	myDogs[1].name = "Enzo";


	System.out.println("What's the name of dog? \n");
	System.out.println(myDogs[2].name);

	int x = 0;

	while (x < myDogs.length) {
	    myDogs[x].DogBark();

	    x = x + 1;
	}

    }

}










