package br.com.headfirstjava.chapter05;

class MakeLoopFor{
    public void MakeLoop()
    {
	int i;
	for(i = 0;  i < 10;  i++)
	{
	    //System.out.println("outPut:= " + i);
	}
	System.out.println("OutPut:= " + i + "\n\nDone!");
     }
}

public class MakeLoopForTestDrive
{
    public static void main(String[] args)
    {
	
	MakeLoopFor make = new MakeLoopFor();
	make.MakeLoop();
    }
    
}
