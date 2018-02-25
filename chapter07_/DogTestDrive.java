package br.com.headfirstjava.chapter07_;

class TestEquals
{
    TestEquals() 
    {
	System.out.println("Output: ");
    }
    
    @SuppressWarnings("unlikely-arg-type")
    public void go() 
    {
	//System.out.println("Output: ");
	Dog d = new Dog();
	Cat c = new Cat();
	
	System.out.println("This Class is = " + c.getClass());//Show class Object
	System.out.println("This Class is = " + d.getClass() + "\n");
	
	System.out.println("This HashCode is = " + d.hashCode());//Show hashcode Object
	System.out.println("This HashCode is = " + c.hashCode()+ "\n");
	
	System.out.println("This ToString is = " + d.toString());//Show toString Object
	System.out.println("This ToString is = " + c.toString() + "\n");
	
	
	
	if(c.equals(d)) {
	    System.out.println("This references are equals `True` ");//Comparate if are references are equals 
	}else {
	    System.out.println("This references are equals `False`");
	    
	}
	System.out.println("\nDone!");
    }
    
}

class Show{
    
}

public class DogTestDrive
{    
    public static void main(String[] args)
    {
	TestEquals t = new TestEquals();
	
	 
	t.go();
	
    }
    
}
