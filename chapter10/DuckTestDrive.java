package br.com.headfirstjava.chapter10;

class Duck
{
    private static  int size;
    @SuppressWarnings("unused")
    private static int duckCount = 0;
    
    public Duck()
    {
	 
	System.out.println(duckCount++);
    }
    
    public void setSize(int s)
    {
	size = s;
    }
    
    public static int getSize()
    {
	return size;
    }
    
    public  void show()
    {
	
	System.out.println(" Size of Duck is = " + size);
    }
}

class  init
{
    
}

public class DuckTestDrive
{
    public static void main(String[] args)
    {
     
     
    }
    
}
