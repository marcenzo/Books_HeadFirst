package br.com.headfirstjava.chapter05;

class MakeLoopOfWhile
{
    private int x = 0;
    
    public void going() 
    {
	System.out.print("Output:\n");
	while(x < 10) 
	{
	    x++ ;
	    
	    System.out.print(" " + x  );
	     
	}
	System.out.println("\n\nDone!");
    }
}

public class MakeLoopOfWhileTestDrive
{
    public static void main(String[] args)
    {
	MakeLoopOfWhile make = new MakeLoopOfWhile();
	make.going();
    }   
}
