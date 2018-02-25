package br.com.headfirstjava.chapter07_;



class code{
     
     public void Going() 
    {
	System.out.println("Output:");
	Monster [] ma = new Monster[3];
	
	ma[0] = new Vampire();
	ma[1] = new Dragon();
	ma[2] = new Monster();
	
	for(int x = 0; x < 3; x++)
	{
	    ma[x].frighten(x);
	}
	System.out.println("\nDone!");
    }
     
}

class Monster
{
    public boolean frighten(int d)
    {
	System.out.print("\n\tarrrgh");
	return true;
    }
}

class Vampire extends Monster
{
    public boolean frighten (int x)
    {
	System.out.print("\ta bite?");
	return false;
    }
}

class Dragon extends Monster
{
    public boolean frighten(int degree)
    {
	System.out.print("\n\tbreath Fire");
	return true;
    }
}

public class MonsterTestDrive
{
    public static void main(String[] args)
    {
	
	code c = new code();
	c.Going();
	
	//Sequence 1
    }
    
}
