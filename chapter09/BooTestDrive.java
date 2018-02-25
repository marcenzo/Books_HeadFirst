package br.com.headfirstjava.chapter09;

class boo
{
    public boo(int i){ 
	//System.out.println("boo(int i)");
	
    }
    
    public boo(String s){
	//System.out.println("boo(String s)");
	
    }
    
    public boo(String s, int i){
	//System.out.println("boo(String s, int i)");
    }
    
    
}

class SonOfBoo extends boo
{
    public SonOfBoo() 
    {
	super("Boo");
	System.out.println("super(\"Boo\") ");
	
    }
    
    public SonOfBoo(int i) 
    {
	super("int i");
	System.out.println("super(\"int i\") ");
	
    }
    
    public SonOfBoo(String s) 
    {
	super(42);
	System.out.println("super(42)");
	
    }
    
    //  public SonOfBoo(int i, String s) 
    {
	//super("int i, String s ");
	//System.out.println("super(\"int i, String s \")");
	
    }
    
    // public SonOfBoo(String b, String a, String c) 
    {
	//super(a,b);
    }
    
    public SonOfBoo(int i, int j) 
    {
	super("int i, int j");
	System.out.println("super(int i, int j) ");
	
    }
    
    // public SonOfBoo(int i, int x, int y) 
    {
	//super(i , "star");
    }
    
    
    
    
    
}
public class BooTestDrive
{
    @SuppressWarnings("unused")
    public static void main(String[] args)
    {
	SonOfBoo s = new SonOfBoo(1,1 );	
	
    }
    
}
