package br.com.headfirstjava.chapter07_;

class OverLoad{
    public String uniqueID;
    
    public int addNums(int a , int b)
    {
	return a + b;
    }
    
    public double addNums(double a , double b)
    {
	return a + b;
    }
    
    public void setUniqueID(String TheId) {
	uniqueID = TheId;
    }
    
    public void setUniqueID(int ssNumber)
    {
	String numStrings = "" + ssNumber;
	setUniqueID(numStrings);
    }
    
     
}
class Start
{
    OverLoad o = new OverLoad();
    
    public void init()
    {
	System.out.println(o.addNums(5.5, 5.5));
	System.out.println(o.addNums(4.5, 4.5));
	
    }
}

public class OverLoadTestDrive
{
    
    public static void main(String[] args)
    {
	Start s = new Start();
	s.init();
	
    }
    
}







