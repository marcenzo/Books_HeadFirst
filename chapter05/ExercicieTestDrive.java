package br.com.headfirstjava.chapter05;


class Exercicie{
    
    public void Go() {
	int y = 7;
	System.out.println("Output:");
	
	for (int x = 1; x < 8 ; x++)
	{
	    y++;
	    
	    if (x > 4)
	    {
		System.out.print(++y + " ");
	    }
	    
	    if (y > 14)
	    {
		System.out.println("\tx = " +  x);
		break;
	    }
	}
	
	System.out.print("\nDone!");
    }
}

public class ExercicieTestDrive
{
    
    public static void main(String[] args)
    {
	Exercicie e = new Exercicie();
	e.Go();  
    }
    
}
