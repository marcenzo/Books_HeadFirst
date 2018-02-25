package br.com.headfirstjava.chapter10;

class Player
{
    static int playerCount = 0;
    @SuppressWarnings("unused")
    private static String name;
    
    public Player(String n)
    {
	name = n;
	playerCount++;
    }
    
    public static void Now( )
    {
	 
	System.out.println(name);
    }
}

public class PlayerTestDrive
{
    @SuppressWarnings("unused")
    public static void main(String[] args)
    {
	System.out.println(Player.playerCount);
	
	 new Player("Tigers Woods");
	
	System.out.println(Player.playerCount);
	
    }
    
}
