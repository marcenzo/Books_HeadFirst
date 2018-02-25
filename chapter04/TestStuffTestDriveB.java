package br.com.headfirstjava.chapter04;

class TestStuffB
{   
    public void Go() 
    {
	int foo = 7, bar =3;
	
	TestStuffB t = new TestStuffB();
	t.takeTwo(foo, bar);
    }
    
    public void takeTwo(int x, int y)
    {
	int z = x + y;
	
	System.out.println(" Total is " + z);
    }
}

public class TestStuffTestDriveB
{
    public static void main(String[] args)
    {
	TestStuffB t = new TestStuffB();
	
	t.Go();
    }
}
