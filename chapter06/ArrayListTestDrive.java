package br.com.headfirstjava.chapter06;

import java.util.*;

class Egg{
    
    public void Go() {
	ArrayList<Egg>myList = new ArrayList<Egg>();
	Egg s = new Egg();//Create new object
	Egg b = new Egg();
	
	myList.add(s);	//Add
	myList.add(b);	
	
	int thesize = myList.size();//Size
	boolean IsNo = myList.contains(s);//Content
	int index = myList.indexOf(b);//Localization
	boolean empty = myList.isEmpty();
	myList.remove(s);
	
	System.out.println(thesize);//Show Size of object
	System.out.println(IsNo);//Content
	System.out.println(index);//Localization
	System.out.println(empty);//Array empty
	System.out.println(myList.remove(s));//Remove object of list
	
    }
}
public class ArrayListTestDrive
{
    public static void main(String[] args)
    {
	
	Egg make = new Egg();
	make.Go();
	
    }
    
}
