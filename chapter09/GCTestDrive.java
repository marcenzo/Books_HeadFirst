package br.com.headfirstjava.chapter09;

class GC
{
    public static GC doStuff() 
    {
	GC newGC = new GC();
	doStuff2(newGC);
	
	return newGC;
    }
    
    @SuppressWarnings("unused")
    public static void doStuff2(GC CopyGC) 
    {
	GC  localGC =  CopyGC;
    }
    
    public void code() 
    {
	GC gc1;
	GC gc2 = new GC();
	GC gc3 = new GC();
	GC gc4 = gc3;
	gc1 = doStuff();
	
	//CopyGC = null; 
	//gc2 = null;
	// newGC = gc3;
	//gc1 = null;
	//newGC = null;
	//gc4 = null;
	
	System.out.println(gc1);
	System.out.println(gc2);
	System.out.println(gc3);
	System.out.println(gc4);
	
    }
    
    public void start() {
	code();
    }
}

public class GCTestDrive
{
    public static void main(String[] args)
    {
	GC gc = new GC();
	gc.start();
	
	
	
	
    }
    
}
