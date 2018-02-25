package br.com.headfirstjava.chapter07_;


class Rowboat extends Boat{
    public void	rowTheBoat () {
	System.out.print("stroke Natasha");
    }
}

class Boat {
    private int length ;
    
    public void setLength(int len){
	length = len;
    }
    public int getlength() {
	return length;
    }
    
    public void move()
    {
	System.out.print(" drift ");
    }
}


class Sailboat extends Boat {
    public void move(){
	System.out.print(" hoist sail ");
    }
}


class Init 
{
    Init(){
	 
    }
    public void code() {
	Boat b1 = new Boat();
	Sailboat b2 = new Sailboat();
	Rowboat  b3 = new Rowboat();
	
	b2.setLength(32);
	b1.move();
	b3.move();
	b2.move();
    }
}
public class BoatsTestDrive
{
    public static void main(String[] args)
    {
	Init i = new Init();
	i.code();
	
    }
    
}
