package br.com.headfirstjava.chapter09;

class Bees
{
    Honey [] beeHA;
}

class Ranccoon
{
    Kit k;
    Honey rh;
}

class Kit
{
    Honey kh;
}

class Bear
{
    Honey hunny;
}

class Honey
{
    public void code()
    {
	Honey honeyPot = new Honey();
	Honey [] ha = {honeyPot,honeyPot,honeyPot,honeyPot};
	Bees b1 = new Bees();
	b1.beeHA = ha;
	Bear [] ba = new Bear[5];
	
	for(int x = 0; x < 5; x++)
	{
	    ba[x] = new Bear();
	    ba[x].hunny = honeyPot;	    
	}
	    System.out.println(ba);

	
	Kit k = new Kit();
	k.kh = honeyPot;
	Ranccoon r = new Ranccoon();
	
	r.rh = honeyPot;
	r.k = k;
	k = null;
	
    }
    
    public void start()
    {
	code();
    }
}

public class HoneyTestDrive
{
    public static void main(String[] args)
    {
	Honey honey = new Honey();
	honey.start();
    }
    
}
