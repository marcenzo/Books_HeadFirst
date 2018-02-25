package br.com.headfirstjava.chapter04;

class AddThings{
    private int a = 12, b = 12;
    
    public int getAddThings() 
    {
	int total = a + b;
	
	return total;
	
    }
    
    public void setAddThings(int _a , int _b ) 
    {
	a = _a;
	b = _b;
    }
    
    public void AddThingsMethod()
    {
	System.out.println("OutPut: Value of variable:  total => " + getAddThings());
    }
}

public class AddThingsTestDrive
{
    public static void main(String[] args)
    {
	AddThings add = new AddThings();
	add.AddThingsMethod();
	
    }
    
}
