package br.com.headfirstjava.chapter05;

class MakeLoopIncremented
{
    private int y = 0 , x = ++y;
    
    public void going() 
    {
	System.out.println("OutPut:\n");
	while(x < 10) 
	{
	    x++ ;
	    
	    System.out.println("x = " + x + "\t y = "  +  y);
	    
	}
	System.out.println("\nDone!");
    }
}
public class MakeLoopIncrementedTestDrive
{   
    public static void main(String[] args)
    {
	
	MakeLoopIncremented m = new MakeLoopIncremented();
	m.going();
    }
    
}
