
package br.com.headfirstjava.chapter07_;

import br.com.headfirstjava.chapter07_.Animal.Animal;
import br.com.headfirstjava.chapter07_.Animal.Dog; 
import br.com.headfirstjava.chapter07_.Animal.Cat; 

class Vet
{
    public void giveShot(Animal a)
    {
	a.eat();
	a.makeNoise();
    }
}

class PetOwer
{   
    public void start()
    {
	Vet v = new Vet();
	Dog d = new Dog();
	Cat c = new Cat();
	v.giveShot(d);
	v.giveShot(c);
    }
    
}

public class VetTestDrive
{
    public static void main(String[] args)
    {
	PetOwer p = new PetOwer();
	
	p.start();
    }
    
}
