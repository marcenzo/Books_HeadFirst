package br.com.headfirstjava.chapter08;

@SuppressWarnings("unused")
class Animal_
{
    private String picture;
    private String Food;
    private int hunger;
    private int boundaries;
    private long location;
    
    public void makeNoise()
    {
	System.out.println("Äu au ");
    }
    
    public void eat()
    {
	
    }
    
    public void sleep()
    {
	
    }
    
    public void roam()
    {
	
    }
    
}

interface Pet
{
    
    public abstract void beFriendly(); 
    public abstract void play();
    
}

class Feline extends Animal_
{
    public void roam()
    {
	
    }
}

class Robot{
    
}

class RobotDog extends Robot implements Pet{
    public void beFriendly() 
    {
	
    }
    public void play() 
    {
	
    }
}


class Canine_ extends Animal_
{
    public void roam()
    {
	
    }
}

class Lion extends Feline
{
    public void eat()
    {
	
    }
    
    public void makeNoise()
    {
	System.out.println("Miau ");
	super.makeNoise();

    }
}

class Tiger extends Feline
{
    public void eat()
    {
	
    }
    
    public void makeNoise()
    {
	System.out.println("AHAAHHA ");

    }
}

class Dog_ extends Canine_ implements Pet{
    public void beFriendly() 
    {
	
    }
    public void play() 
    {
	
    }
    
    public void roam()
    {
	
    }
}

class Cat_ extends Feline implements Pet{
    public void beFriendly() 
    {
	
    }
    public void play() 
    {
	
    }
}
class Wolf_ extends Canine_
{
    public void eat()
    {
	
    }
    
    public void makeNoise()
    {
	
    }
}

class Hippo_ extends Animal_
{
    public void makeNoise()
    {
	
    }
    
    public void eat()
    {
	
    }
}

public class Animal_TestDrive_
{
    
    public static void main(String[] args)
    {
	Lion lion = new Lion();
	lion.makeNoise();
	
    }
    
}
