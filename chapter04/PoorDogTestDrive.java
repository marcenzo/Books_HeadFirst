package br.com.headfirstjava.chapter04;

class PoorDog
{
    
    private int size;
    private String name;
    
    public int getSize() 
    {
	return size;
    }
    
    public void setSize(int _size)
    {
	size = _size;
    }
    
    public String getName()
    {
	return name;
    }
    
    public void setName(String _name)
    {
	name = _name;
    }
    
    public void Go() 
    {
	System.out.println("OutPut: Value of variable: " + "size = " + getSize());
	System.out.println("OutPut: Value of variable: " +  "name = " + getName());
    }
    
}

public class PoorDogTestDrive
{
    public static void main(String[] args)
    {
	PoorDog p = new PoorDog();
	p.Go();
    }
    
}
