package br.com.headfirstjava.chapter04;

class TestOfValue{
    public int x = 7;
    
    public void go(int z) 
    {
	z = 3;
	System.out.println("The Value of 'X' is " + x + " \nThe Value of 'Z' is " + z );
	
    }
    
    public void callGo() 
    {
	TestOfValue t = new TestOfValue();
	t.go(x);
	
    }
}


public class TestOfValues
{
    public static void main(String[] args)
    {
	TestOfValue t = new TestOfValue();
	t.callGo();
	
    }
    
}
