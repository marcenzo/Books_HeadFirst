package br.com.headfirstjava.chapter08;

interface Nose{  //Insert Code the word "class"
    public int iMethod();
}

abstract class Picasso implements Nose
{
    public int iMethod() 
    {
	return 7;
    }   
}

class Clowns extends Picasso{}

class Acts extends Picasso
{
    public int iMethod() 
    {
	return 5;
    }
}

class of76 extends Clowns{
    
    void Go() {
	
	Nose [] i = new Nose[3];
	i[0] = new Acts();
	i[1] = new Clowns(); 
	i[2] = new of76();
	
	for(int x = 0; x < 3; x++) 
	{
	    System.out.println(i[x].iMethod() + " " + i[x].getClass().getSimpleName());
	}
    }
}

public class NoseTestDrive
{    
    public static void main(String[] args)
    {
	
	of76 o = new of76();
	o.Go();
    }
    
}
