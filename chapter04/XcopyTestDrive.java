package br.com.headfirstjava.chapter04;

class Xcopy{
    private int orig = 42;
    
    public int Go(int arg) 
    {
	arg = arg * 2;
	return arg;
    }
    
    public void Calling() {
	Xcopy x = new Xcopy();
	
	int y = x.Go(orig);
	
	System.out.println("OutPut: The value of ORIG is => " + orig);
	System.out.println("OutPut: The value of Y is => " + y);
    }
    
}
public class XcopyTestDrive
{
    public static void main(String[] args)
    {
	Xcopy evoke = new Xcopy();
	evoke.Calling();
	
    }
}


