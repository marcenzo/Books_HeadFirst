package br.com.headfirstjava.chapter04;

class Horse{
    
    private double height = 15.5;
    private String breed;
    
    public void callingMethod() 
    {
	System.out.println("OutPut: Value of variable:  height => " + height);
	System.out.println("OutPut: Value of variable:  breed => " + breed);
    }
}

public class HorseTestDrive
{ 
    public static void main(String[] args)
    {
	Horse h = new Horse();
	h.callingMethod();
    }
}
