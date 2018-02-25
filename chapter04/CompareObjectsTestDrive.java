package br.com.headfirstjava.chapter04;

class CompareObjects{
    
    public void Go() {
	CompareObjects a = new CompareObjects();
	CompareObjects b = new CompareObjects();
	CompareObjects c = a;
	
	if(a == b)
	{
	    System.out.println("OutPut -> The Objects aren't iquals  ");
	}
	else 
	    System.out.println("OutPut -> The Objects aren't equals  ");
	
	if(a == c) 
	{
	    System.out.println("OutPut -> The Objects are iquals   ");
	}
	else 
	    System.out.println("OutPut ->The Objects aren't equals  ");
	
	if(b == c) 
	{
	    System.out.println("OutPut -> The Objects aren't iquals  ");
	}
	else 
	    System.out.println("OutPut -> The Objects aren't equals ");
    }
    
}


public class CompareObjectsTestDrive
{
    public static void main(String[] args)
    {
	CompareObjects evoke = new CompareObjects();
	evoke.Go();
	
    }
    
}
