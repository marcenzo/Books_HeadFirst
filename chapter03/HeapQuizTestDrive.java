package br.com.headfirstjava.chapter03;


class HeapQuiz
{
    int id , x  = 0 ;
    
    void callMethod() 
    {
	HeapQuiz [] hq = new HeapQuiz[5];
	while (x < 3)
	{
	    hq[x] = new HeapQuiz();
	    hq[x].id = x;
	    
	    x = x + 1;
	}
	
	hq[3] = hq[1];
	hq[4] = hq[1];
	hq[3] = null;
	hq[4] = hq[0];
	hq[0] = hq[3];
	hq[3] = hq[2];
	hq[2] = hq[0];
	
	System.out.println("The values are = " + hq[3].id);
	System.out.println("The values are = " + hq[4].id);
	System.out.println("The values are = " + hq[3].id);
	System.out.println("The values are = " + hq[4].id);
	System.out.println("The values are = " + hq[0] + "Lost the reference");
	System.out.println("The values are = " + hq[3].id);
	System.out.println("The values are = " + hq[2] + "Lost the reference");
	
    }   
}

/*class HeapQuizHelp
{
    int x = 0 ;
    
    void callMethod() 
    {
		
	HeapQuiz [] hq = new HeapQuiz[5];
	while (x < 3)
	{
	    hq[x] = new HeapQuiz();
	    hq[x].id = x;
	    
	    x = x + 1;
	}
    }
}
 */
public class HeapQuizTestDrive
{   
    
    public static void main(String[] args)
    {
	HeapQuiz evoke = new HeapQuiz();
	evoke.callMethod();
	
    }
    
    
    
}


