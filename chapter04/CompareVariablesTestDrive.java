package br.com.headfirstjava.chapter04;



class CompareVariables
{
    private int a = 3;
    private byte b = 3;
    
    public void Go() 
    {
	
	if(a == b)
	{
	    System.out.println("OutPut: The variables are iquals => ");
	}else 
	    System.out.println("OutPut: The variables aren't equals => ");
    }
}  

public class CompareVariablesTestDrive
{
    public static void main(String[] args)
    {
	CompareVariables c = new CompareVariables();
	c.Go();
    }
    
}
