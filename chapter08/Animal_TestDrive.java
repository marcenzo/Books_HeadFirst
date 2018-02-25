package br.com.headfirstjava.chapter08;

class MyAnimalList
{
    private Animal[] Animals = new Animal[5];
    
    private int nextIndex = 0;
    
    public void add(Animal a)
    {
	if(nextIndex < Animals.length)
	{
	    Animals[nextIndex] = a;
	    
	    System.out.println("Animal add in " + nextIndex );
	    //  System.out.println("Animal add in " + nextIndex );
	    nextIndex++;
	}
    }
}

class Start_
{
    
    public void init()
    {
	
	System.out.println("Output:\n");
	MyAnimalList list = new MyAnimalList();
	
	Dog  dog = new Dog();
	Cat cat = new Cat();
	//Wolf wolf = new Wolf();
	
	list.add(dog);
	list.add(cat);
	
	
	
    }
}

public class Animal_TestDrive
{   
    public static void main(String[] args)
    {
	Start_ s = new Start_();
	s.init();
	
    }
    
}
