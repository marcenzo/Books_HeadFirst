package br.com.headfirstjava.chapter05;

class MultFor
{
    public void Going()
    {
	System.out.println("Output:");
	
	for (int x = 0; x < 4; x++)
	{
	    for (int y = 4; y > 2; y--)
	    {
		System.out.println(" x " + x + " y " + y);
	    }
	    if(x == 1)
	    {
		x++;
	    }
	}    
	
	System.out.println("\nDone!");
    }  
    
}
public class MultForTestDrive
{
    public static void main(String[] args)
    {
	MultFor m = new MultFor();
	m.Going();
    }
    
}
