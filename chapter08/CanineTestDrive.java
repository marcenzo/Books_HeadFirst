package br.com.headfirstjava.chapter08;


abstract class Animal{
    
}

abstract class Canine extends Animal{
    public void roam() {
	
    }
}

class Dog extends Canine{
    
}

class Cat extends Canine{
    
}

class MakeCanine{
    public void go() {
	
    }
}

class code{
    public void test()
    {
	Canine c;
	c = new Dog();
	
	//c = new Canine();
	System.out.println(c);
    }
    
}

public class CanineTestDrive
{
    public static void main(String[] args)
    {
	
	
    }
    
}
