package br.com.headfirstjava.chapter04;

class DogMatriz
{
    private int size;
    
    public int getSize() 
    {
	return size;
    }
    
    public void setSize(int _size) 
    {
	size = _size;
    }
    
    public void Go() 
    {
	DogMatriz [] pets;
	pets = new DogMatriz[7];
	
	pets[0] = new DogMatriz(); 
	pets[1] = new DogMatriz();
	
	pets[0].setSize(3);
	int x = pets[0].getSize();
	pets[1].setSize(8);
	
	System.out.println("OutPut:\n" + pets[0].getSize());
	System.out.println( pets[1].getSize());
	System.out.println( x);
    }
}

public class DogMatrizTestDrive
{
    public static void main(String[] args)
    {
	 DogMatriz dog = new DogMatriz();
	 dog.Go();
	
    }
    
}
