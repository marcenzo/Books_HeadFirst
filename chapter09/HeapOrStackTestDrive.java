package br.com.headfirstjava.chapter09;

@SuppressWarnings("unused")
class HeapOrStack
{
    public HeapOrStack Heap = new HeapOrStack();
    private HeapOrStack Stack;   
}

interface inter{}

class Duck
{
    private int size;
    public Duck()
    {
	System.out.println("Duck Grasna");
	
    }
    
    public void setSize(int s) 
    {
	size = s;
	System.out.println("Value of size is = " + size);
    }
}

class Duck_
{
    private int d;
    public Duck_(int sizeDuck) {
	d = sizeDuck;
	
	System.out.println("Value of d is = " + d);
    }
}
@SuppressWarnings("unused")
public class HeapOrStackTestDrive
{
    
    public static void main(String[] args)
    {
	Duck duck = new Duck();
	duck.setSize(23);
	
	Duck_ ducks = new Duck_(42);
    }
    
}
