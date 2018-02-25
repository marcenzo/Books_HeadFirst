package br.com.headfirstjava.chapter09;

class Animal
{
    public Animal() 
    {
	System.out.println("Create a object Animal!");
    }  
}

class Hippo extends Animal
{
    public Hippo() 
    {
	System.out.println("Create a object Hippo!");
	System.out.println("\nDone!");	
    }
}

class Horse extends Animal
{
    public int size;
    public Horse(int newsize)
    {
	super();
	size = newsize;
	System.out.println("The value of variable Size is = " + size);

    }
}
@SuppressWarnings("unused")
public class HippoTestDrive
{
    public static void main(String[] args)
    {
	System.out.println("Output:\n");
	System.out.println("Initialization!");
	
	Hippo h = new Hippo();	
	Horse c = new Horse(1);
    }
    
}
