package br.com.headfirstjava.chapter07_;

@SuppressWarnings("unused")
class AnimalMatrix
{
    private String picture;
    private String Food;
    private int hunger;
    private int boundaries;
    private long location;
    
    public void makeNoise()
    {
	
    }
    
    public void eat()
    {
	System.out.println("meat");
	
    }
    
    public void sleep()
    {
	
    }
    
    public void roam()
    {
	
    }
    
    
}

class Felines extends AnimalMatrix
{
    public void roam()
    {
	
    }
}

class Canines extends AnimalMatrix
{
    public void roam()
    {
	
    }
}

class Lions extends Felines
{
    public void eat()
    {
	System.out.println("meat, milk");
	
    }
    
    public void makeNoise()
    {
	
    }
}

class Cats extends Felines
{
    public void eat()
    {
	System.out.println("Wyskas");
	
    }
    
    public void makeNoise()
    {
	System.out.println("Miau miau");

    }
}

class Tigers extends Felines
{
    public void eat()
    {
	
    }
    
    public void makeNoise()
    {
	
    }
}

class Dogs extends Canines
{
    public void eat()
    {
	System.out.println("hard bone");
	
    }
    
    public void makeNoise()
    {
	System.out.println("Au Au");

    }
}

class Wolfs extends Canines
{
    public void eat()
    {
	
    }
    
    public void makeNoise()
    {
	
    }
}

class Hippos extends AnimalMatrix
{
    public void makeNoise()
    {
	
    }
    
    public void eat()
    {
	
    }
    
}

public class AnimalMatrixTestDrive
{
    public static void main(String[] args)
    {
	
	AnimalMatrix [] animals = new AnimalMatrix[6];
	AnimalMatrix animal = new AnimalMatrix();
	
	
	animals[0] = new Dogs();
	animals[1] = new Cats();
	animals[2] = new Wolfs();
	animals[3] = new Tigers();
	animals[4] = new Hippos();
	animals[5] = new Lions();
	
	
	for(int i = 0; i < animals.length; i++) 
	{
	    animals[i].eat();
	    
	    animals[i].roam();
	    
	    animals[i].makeNoise();
	    
	}
	animal.eat();
	
	
    }
    
}

