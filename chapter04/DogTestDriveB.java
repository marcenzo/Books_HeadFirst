package br.com.headfirstjava.chapter04;

/**
 * @author Marcenzo Inc.Apple
 * @br.com.headfirstjava.chapter04 br.com.headFirstJava.chapter02
 * @HeadFirstCollection Life Goal  
 * @Nov 26, 2017 11/1072017 
 */

class DogTest2{
    
    //public int size;
   // public String name;
    
    public void bark(int numOfbarks) 
    {
	while (numOfbarks > 0)
	{
	    System.out.println(" Ruff! Ruff! ");
	    numOfbarks = numOfbarks - 1;
	} 
    }
}

public class DogTestDriveB
{
    public static void main(String[] args)
    {
	DogTest2 one = new DogTest2();
	
	one.bark(5);
	 
    }
    
}
