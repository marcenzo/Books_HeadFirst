package br.com.headfirstjava.chapter08;

import java.util.ArrayList;

class ReferenceWiyhObject
{
    
    public void go()
    {
	ArrayList<Dog> myList = new ArrayList<Dog>();
	
	Dog aDog = new Dog();
	myList.add(aDog);
	
	Dog dog = myList.get(0);
	
	System.out.println(myList.size());
	System.out.println(dog);
	
	
    }
    
    public void ObjectReference()
    {
	ArrayList<Object> myListObject = new ArrayList<Object>();
	
	Dog dogOBJ = new Dog();
	myListObject.add(dogOBJ);
	
	//Dog d = myListObject.get(0); No Valid
	
    }
    
    @SuppressWarnings("unused")
    public void TestOfObjects()
    {
	Dog dog = new Dog();
	//Dog sameDog = getObject(dog); No Valid
	Object sameDog = getObject(dog); 
	
	
    }
    
    public Object getObject(Object o )
    {
	return o;
    }
    
    
    
    ReferenceWiyhObject()
    {
	System.out.println("Output:");
    }
    
}

public class CreateReferencewithObject
{
    public static void main(String[] args)
    {
	ReferenceWiyhObject r = new ReferenceWiyhObject();
	r.go();
	System.out.println("\nDone!");
	
	
    }
    
}
