package br.com.headfirstjava.chapter07_.Animal;

@SuppressWarnings("unused")
public class Animal
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
	
    }
    
    public void sleep()
    {
	
    }
    
    public void roam()
    {
	
    }
    
}

class Feline extends Animal
{
    public void roam()
    {
	
    }
}

class Canine extends Animal
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
	
    }
}

class Tiger extends Feline
{
    public void eat()
    {
	
    }
    
    public void makeNoise()
    {
	
    }
}

 

class Wolf extends Canine
{
    public void eat()
    {
	
    }
    
    public void makeNoise()
    {
	
    }
}

class Hippo extends Animal
{
    public void makeNoise()
    {
	
    }
    
    public void eat()
    {
	
    }
}


