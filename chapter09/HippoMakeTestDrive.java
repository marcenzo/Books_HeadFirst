package br.com.headfirstjava.chapter09;

abstract class _Animal
{
    private String name;
    
    public String getName() 
    {	
	return name;
    }
    
    public _Animal(String theName) 
    {
	name = theName;
    }
}

class _Hippo extends _Animal
{
    public _Hippo(String name) {
	super(name);
	
	System.out.println("Output\n");
    }
}

public class HippoMakeTestDrive
{
    public static void main(String[] args)
    {
	_Hippo h = new _Hippo("Enzo");
	System.out.println(h.getName());
	System.out.println("\nDone!");
	
    }
    
}
