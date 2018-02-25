package br.com.headfirstjava.chapter04;

class DogGood{
    
    private int size;
    
    public int getSize()
    {
	return size;
    }
    
    public void setSize(int _size) 
    {
	size = _size;
    }
    
    public void bark() 
    {
	if (size > 60)
	{
	    System.out.println("        Wooof! Wooof! ");
	}
	else if(size > 14) 
	{
	    System.out.println("        Ruff! Ruff! ");
	}
	else 
	{
	    System.out.println("        Yip! Yip!\n ");
	}
    }
}

public class DogGoodTestDrive
{
    public static void main(String[] args)
    {
	DogGood dogA = new DogGood();
	dogA.setSize(70);
	
	DogGood dogB = new DogGood();
	dogB.setSize(8);
	
	System.out.println("OutPut: DogA: " + dogA.getSize());
	System.out.println("        DogB: " + dogB.getSize());
	
	dogA.bark();
	dogB.bark();
	
    }
    
}