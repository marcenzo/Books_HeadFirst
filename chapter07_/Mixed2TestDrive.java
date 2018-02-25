package br.com.headfirstjava.chapter07_;

class A
{
    public int Ivar = 7;
    
    public void m1() 
    {
	System.out.println("[A's M1, ]");
    }
    
    public void m2() 
    {
	System.out.println("[A's M2, ]");
    }
    
    public void m3() 
    {
	System.out.println("[A's M3, ]");
    }
}

class B extends A
{
    public void m1() 
    {
	System.out.println("[B's M1, ]");
    }
}

class C extends B
{
    public void m3() 
    {
	System.out.println("[C's M3, ]" + (Ivar + 6));
    }
}

class Starts
{
    @SuppressWarnings("unused")
    public void Acess() 
    {
	A a = new A();
	B b = new B();
	C c = new C();
	A a2 = new C();
	
	a.m1(); //A's  M1
	a.m2(); //A's  M2
	a.m3(); //A's  M3
	
	/* 
	   c.m1(); B's  M1
	   c.m2(); A's  M2
	   c.m3(); C's  M3 13
		   
	   a.m1(); A's  M1
	   b.m2(); A's  M2
	   c.m3(); C's  M3 13
	  
	   b.m1(); B's M1
	   c.m2(); A's M2
           a.m3(); A's M3 
	 */
    }
}

public class Mixed2TestDrive
{
    public static void main(String[] args)
    {
	Starts s = new Starts();
	
	s.Acess();
    }
    
}
