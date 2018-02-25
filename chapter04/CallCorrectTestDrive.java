package br.com.headfirstjava.chapter04;

class CallCorrect{
    
    public int calcArea(int height, int width) 
    {
	return height * width;
    }
    
    public void Go() {
	//int a = calcArea(7, 12);
	//calcArea(2, 3);
	
	System.out.println("OutPut: The calculation of the area is => " + calcArea(2, 3));
    }
}

public class CallCorrectTestDrive
{
    public static void main(String[] args)
    {
	CallCorrect c = new CallCorrect();
	c.Go();
	
    }
    
}
// int a = calcArea(7, 12); True
// calcArea(2, 3); True