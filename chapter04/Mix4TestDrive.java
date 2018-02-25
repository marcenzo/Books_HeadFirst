package br.com.headfirstjava.chapter04;

class Mix4
{
    private int counter = 0;
    private int x = 0;
    private int count;
    
    Mix4 [] m4a = new Mix4[20];
    
    public void Go() 
    {
	while(x < 19) //I do insert a code here
	{
	    m4a[x] = new Mix4();
	    m4a[x].counter = m4a[x].counter + 1;
	    count = count + 1;
	    count = count + m4a[x].maybeNew(x);
	    x = x + 1;
	}
	
	System.out.println("OutPut: [count = " + count + " " +  "counter = " + m4a[1].counter + "]");
    }
    
    public int maybeNew(int index) 
    {
	
	if(index < 1) //I do insert a code here
	{
	    Mix4 m4 = new Mix4();
	    m4.counter = m4.counter + 1;
	    
	    return 1;
	}
	return 0;
    }
}


public class Mix4TestDrive
{
    public static void main(String[] args)
    {
	Mix4 m = new Mix4();
	m.Go();
    }
    
}
//I do insert x < 9 more index < 5 = 14 1
//I do insert x < 20 more index < 5 = 25 1
//I do insert x < 7 more index < 7 = 14 1
//I do insert x < 19 more index < 1 = 20 1



