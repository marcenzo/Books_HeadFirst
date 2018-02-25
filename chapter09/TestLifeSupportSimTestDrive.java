package br.com.headfirstjava.chapter09;

import java.util.ArrayList;

class V2Radiator
{    @SuppressWarnings({ "rawtypes", "unchecked"})

V2Radiator(ArrayList list)
{
    for(int x = 0; x < 5; x++)
    {
	list.add(new SimUnit("V2Radiator"));
    }
}

}

class V3Radiator 
{
    @SuppressWarnings({ "rawtypes", "unchecked"})
    V3Radiator(ArrayList lglist)
    {
	for(int g = 0; g < 10; g++)
	{
	    lglist.add(new SimUnit("V3Radiator"));
	}
    }
}

@SuppressWarnings({ "rawtypes", "unchecked"})
class RetentionBoot
{
    RetentionBoot(ArrayList rlist){
	rlist.add(new SimUnit("Retention"));
    }
}

class SimUnit
{
    public String botType;
    SimUnit(String type)
    {
	botType = type;
    }
    
    public int powerUse() 
    {
	if("Retention".equals(botType) ) 
	{
	    return 2;
	    
	} else {
	    
	    return 4;
	}
    }
}

class code_
{
    @SuppressWarnings({ "rawtypes", "unused" })
    public void start()
    {
	ArrayList alist = new ArrayList();
	
	V2Radiator v2 = new V2Radiator(alist);
	V3Radiator v3 = new V3Radiator(alist);
	
	for(int z = 0; z < 20; z++)
	{
	    RetentionBoot ret = new RetentionBoot(alist);
	}
	
	System.out.println();
    } 
}

public class TestLifeSupportSimTestDrive
{
    
    public static void main(String[] args)
    {
	code_ c = new code_();
	c.start();
	
    }
    
}







