package br.com.headfirstjava.chapter04;

/**
 * @author Marcenzo Inc.Apple
 * @br.com.headfirstjava.chapter04 br.com.headFirstJava.chapter02
 * @HeadFirstCollection Life Goal  
 * @Nov 26, 2017 11/1072017 
 */

class TestStuff
{   
    public void Go() 
    {
	TestStuffB t = new TestStuffB();
	t.takeTwo(12, 34);
    }
    
    public void takeTwo(int x, int y)
    {
	int z = x + y;
	
	System.out.println(" Total is " + z);
    }
}

public class TestStuffTestDrive
{
    public static void main(String[] args)
    {
	TestStuffB t = new TestStuffB();
	
	t.Go();
    }
}
