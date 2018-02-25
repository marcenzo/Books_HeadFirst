package br.com.headfirstjava.chapter04;

class ElectricGuitar{
    
    private String brand;
    private int numOfPickups;
    private boolean rockStarUseIt;
    
    public String getBrand() {
	return brand;
    }
    
    public void setBrand(String _Brand) {
	brand = _Brand;
    }
    
    public int getNumOfPickups() {
	return numOfPickups;
    }
    
    public void setNumOfPichups(int _NumOfPickups) {
	numOfPickups = _NumOfPickups;
    }
    
    public boolean getRockStarUseIt() {
	return rockStarUseIt;
    }
    
    public void setRockStarUseIt(boolean yesOrNo) {
	rockStarUseIt = yesOrNo;
    }
    
    public void insert() {
	ElectricGuitar e = new ElectricGuitar ();
	
	e.setBrand("enzo");
	e.setNumOfPichups(5);
	e.rockStarUseIt = true;
	
	if(e.rockStarUseIt == true) {
	    System.out.println("OutPut: RockStarUseIt = " + e.getRockStarUseIt());
	    System.out.println("OutPut: Pickups = " + e.getNumOfPickups());
	    System.out.println("OutPut: Brand =  " + e.getBrand());
	}else {
	    System.out.println("OutPut: RockStarUseIt = False" );
	    System.out.println("OutPut: Pickups =  No");
	    System.out.println("OutPut: Brand =  SomeOne");
	}
	
    }
    
    
}

public class ElectricGuitarTestDrive
{
    public static void main(String[] args)
    {
	ElectricGuitar evoke = new ElectricGuitar ();
	evoke.insert();
	
    }
}







