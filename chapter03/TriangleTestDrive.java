/**
 * 
 */
package br.com.headfirstjava.chapter03;

/**
 * @author Marcenzo Inc.
 * @br.com.headfirstjava.chapter03 br.com.headFirstJava.chapter03
 * @HeadFirstCollection Life Goal  
 * @Nov 24, 2017 11/1072017 
 */

class Triangle
{
    
    double area;
    int height,lenght;
    int x;
    int y;
    
    void callMethod() 
    {
	
	Triangle [] ta = new Triangle[4];
	
	while (x < 4) 
	{
	    ta[x] = new Triangle();
	    ta[x].height = ( x + 1) * 2;
	    ta[x].lenght = x + 4;
	    ta[x].setArea();
	    
	    System.out.print("triangule " +  " X "  +  area );
	    System.out.println(" = " +  ta[x].area );
	    
	    x = x + 1;
	}
	x = 27;
	Triangle t5 = ta[2];
	ta[2].area = 343;
	System.out.print("y = " + y);
	System.out.println(", t5 area = " + t5.area);
	
    }
    
    void setArea() 
    {
	area = (height * lenght) / 2;
    }
}

public class TriangleTestDrive 
{
    public static void main(String[] args) 
    {
	Triangle t = new Triangle();
	t.callMethod();
    }
}
