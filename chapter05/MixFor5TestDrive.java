package br.com.headfirstjava.chapter05;


class  MixFor5{
    
    public void CallingMethod()
    {
	int x = 0, y = 30;
	System.out.println("Output:");
	for(int outer = 0; outer < 3; outer++)
	{
	    for(int inner = 4; inner > 1; inner--)
	    {
		
		/*
		x = x + 6; == 60 10
		x = x + 3; == 54 06  //Inserted code here
		x = x + 2; == 45 06
		x++ = 	      36 06
		x-- =         18 06
		x = x + 0 ==  06 14 
		*/
			
		y = y - 2;
		
		if(x == 6)
		{
		    break;
		}
		x = x + 3;
	    }
	    y = y - 2;
 	    
	}
	System.out.println("x " + x + " y " + y);
	System.out.println("\nDone!");
    }
    
}

public class MixFor5TestDrive
{
    public static void main(String[] args)
    {
	MixFor5 m5 = new MixFor5();
	m5.CallingMethod();
    }
    
}
