package br.com.headfirstjava.chapter04;

class Puzzle4
{
    
    private int x = 0;
    private int y = 1;
    private int result = 0;
    
    Puzzle4b [] obs = new Puzzle4b[6];           
    
    public void Go()
    {
	         
	
	while(x < 6) 
	{
	    obs[x] = new Puzzle4b(); // I do insert code here 
	    obs[x].ivar = y;
	    
	    y = y * 10;
	    x = x + 1;  		// I do insert code here 
	}
	
	x = 6;
	
	while(x > 0)
	{
	    x = x - 1; 		// I do insert code here 
	    
	    result = result  + obs[x].doStuff(x);  // I do insert code here 
	}
	System.out.println("OutPut: result = " + result);   
    }
}

class Puzzle4b
{			 
    int ivar;
    
    public int doStuff(int factor)			// I do insert code here 
    {
	if(ivar > 100)
	{
	    return 	ivar * factor;		// I do insert code here 
	}
	else 
	{
	    return 	ivar * (5 - factor);		// I do insert code here 
	}
    }
}

public class Puzzle4TestDrive
{
    public static void main(String[] args)
    {
	Puzzle4 p = new Puzzle4();
	p.Go();
    }
}


