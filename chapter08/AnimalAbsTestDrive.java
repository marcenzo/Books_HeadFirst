package br.com.headfirstjava.chapter08;

@SuppressWarnings("unused")
abstract class _Animal
{
   
    private String picture;
    private String Food;
    private int hunger;
    private int boundaries;
    private long location;
    
    public abstract  void makeNoise();
    
    public abstract  void eat();
    
    public abstract  void sleep();//Abstract method
    
    public abstract  void roam();
    
    public void go() {//Abstract not method
	
    }
    
}

abstract class _Feline extends _Animal
{
    public void roam()
    {
	
    }
    
    public void eat() {
	
    }
    
    public void makeNoise() {
	
    }
    
    public void sleep() {
	
    }
}

abstract class _Canine extends _Animal
{
    public void roam()
    {
	
    }
    
    public void eat() {
	
    }
    
    public void makeNoise() {
	
    }
    
    public void sleep() {
	
    }
}

class _Lion extends _Feline
{
    
}

class _Cat extends _Feline
{ 
    
}

class _Tiger extends _Feline
{
    
    
}

class _Dog extends _Canine
{
    
}

class Wolf extends _Canine
{
    
}

class Hippo extends _Animal
{
    public void roam()
    {
	
    }
    
    public void eat() {
	
    }
    
    public void makeNoise() {
	
    }
    
    public void sleep() {
	
    }
    
}


public class AnimalAbsTestDrive
{
    
    public static void main(String[] args)
    {
	// TODO Auto-generated method stub
	
    }
    
}
