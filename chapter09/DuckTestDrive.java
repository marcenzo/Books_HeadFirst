package br.com.headfirstjava.chapter09;


class _Duck
{
    public int pounds = 6;
    public float floatability = 2.1F;
    public String name = "Generic";
    public long [] feathres = {1,2,3,4,5,6};
    public boolean canFly = true;
    public int maxSpeed = 25;
    
    public _Duck() 
    {
	System.out.println("type 1 duck");//d[0] = new _Duck(); = 1
    }
    
    public _Duck(boolean fly) 	//d[3] = new _Duck(canFly); = 5

    {
	canFly = fly;
	System.out.println("type 2 duck");
    }
    
    public _Duck(String n , long [] f) //d[2] = new _Duck(); 3
    {
	name = n;
	feathres = f;
	System.out.println("type 3 duck");
    }
    
    public _Duck(int w, float f)	//d[6] = new _Duck(airSpeed, density);= 2

    {
	pounds = w;
	floatability = f;
	System.out.println("type 4 duck");
    }
    
    public _Duck(float density, int max)//d[1] = new _Duck(); = 5
    {
	maxSpeed = max;
	floatability = density;
	System.out.println("type 5 duck");
    }
    
}

class Code
{
    public int weight = 8;
    public float density = 2.3F;
    public String name = "Donald";
    public long [] feathers = {1,2,3,4,5,6};
    public boolean canFly = true;
    public int airSpeed = 22;
    
    public void coding() 
    {
	_Duck [] d = new _Duck[7];
	
	d[0] = new _Duck();
	d[1] = new _Duck(density, weight);
	d[2] = new _Duck(name, feathers);
	d[3] = new _Duck(canFly);
	d[4] = new _Duck(3.3F, airSpeed);
	d[5] = new _Duck(false);
	d[6] = new _Duck(airSpeed, density);
    }
    
}

public class DuckTestDrive
{
    
    public static void main(String[] args)
    {
	Code c = new Code();
	c.coding();
    }
    
}
