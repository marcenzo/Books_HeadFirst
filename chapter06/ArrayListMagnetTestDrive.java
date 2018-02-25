package br.com.headfirstjava.chapter06;

import java.util.ArrayList;

class ArrayListMagnet
{
    public void Code() {
	ArrayList<String> a = new ArrayList<String>();
	a.add(0, "Zero");
	a.add(1, "One");
	a.add(2, "Two");
	
	a.add(3, "Three");
	printAL(a);
	
	if(a.contains("Three"))
	{
	    a.remove(2);
	    a.add("Four");   
	}
	printAL(a);
	
	if(a.indexOf("Four") != 4)
	{
	    a.add(4, "4.2");
	}
	printAL(a);
	printAL(a);
    }
    
    
    public static void  printAL(ArrayList<String> al)
    {
	for(String element : al) 
	{
	    System.out.print(element + " ");    
	}
	System.out.println(" "); 
    }
    
    public void Init()
    {	
	ArrayListMagnet t = new ArrayListMagnet();
	t.Code();
    }
}

public class ArrayListMagnetTestDrive
{
    public static void main(String[] args)
    {
	ArrayListMagnet s = new ArrayListMagnet();
	s.Init();
    }
    
}
