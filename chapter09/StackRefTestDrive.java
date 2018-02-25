package br.com.headfirstjava.chapter09;

@SuppressWarnings("unused")
class  Stack
{
    public void foof() 
    {
	barf();
    }
    
    public void barf() 
    {
	StackRefTestDrive s = new StackRefTestDrive();
    }
}

class ReRef
{
    StackRefTestDrive d = new StackRefTestDrive();
    public void go() 
    {
	
	d = new StackRefTestDrive(); 
    }
}

public class StackRefTestDrive
{
    public static void main(String[] args)
    {
	
	
    }
    
}
