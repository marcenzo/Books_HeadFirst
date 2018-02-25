package br.com.headfirstjava.chapter04;

class Clock{
    private String time;
    
    public String getTime() {
	return time;
    }
    
    public void setTime(String _t) {
	time = _t;
    }
    
    public void calling() {
	Clock c = new Clock();
	
	c.setTime("1 2 4 5 ");
	String tod = c.getTime();
	
	System.out.println("OutPut: The time is = [" + tod + "]");
    }
}

public class ClockTestDrive
{
    public static void main(String[] args)
    {
	Clock evoke = new Clock();
	evoke.calling();
    }
    
}
