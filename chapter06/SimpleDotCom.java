package br.com.headfirstjava.chapter06;

import java.util.ArrayList;

public class SimpleDotCom
{
    private ArrayList <String> locationCells;
    private String name;
    
    public void setLocationCells(ArrayList <String>  loc) 
    {
	locationCells = loc;
    }
    
    public void setName(String n) {
	name = n;
    }
    
    public String checkYouSelf(String UserInput) 
    {
	String result = "Wrong";
	
	int index = locationCells.indexOf(UserInput);
	
	if(index >= 0)
	{
	    locationCells.remove(index);
	    
	    
	    if(locationCells.isEmpty())
	    {
		result = "Kill";
		
		System.out.println("ora você afundou " + name + "   : ( ");
	    }else {
		result = "right";
	    }
	    
	}
	return result;
    }
    
}


