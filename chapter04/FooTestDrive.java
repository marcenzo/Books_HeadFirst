package br.com.headfirstjava.chapter04;

class Foo{
 
    public void Go() {
	int x = 0; //Local variable must be initialized
	
	int z = x + 3;
	
	System.out.println("OutPut: Value of variable: " +  "z = " + z);
    }
}

public class FooTestDrive
{
    public static void main(String[] args)
    {
	 
	Foo f = new Foo();
	f.Go();
    }
    
}
