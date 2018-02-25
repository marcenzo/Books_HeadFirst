package br.com.headfirstjava.chapter05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class GameHelper{
    
    public String getUserInput(String prompt )
    
    {
	String inputLine = null;
	System.out.printf(prompt + " ");
	
	try
	{
	    BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
	    inputLine = is.readLine();
	    
	    if(inputLine.length() == 0)
	    {
		return null;
	    }
	}
	catch (IOException e)
	{
	    System.out.println(" IOException " + e );
	}
	return inputLine;
    }
}
class SimpleDotCom  //Code Preparation
{
    private int [] locationCells;
    private int numOfHits = 0 ;
    
    public void selfLocationCells(int [] Locs) 
    {
	locationCells = Locs;
    }    
    
    public String checkYouself(String stringGuess) 
    {
	int guess = Integer.parseInt(stringGuess);
	String result = "OutPut => Miss";
	
	for(int cell : locationCells) 
	{
	    if(guess == cell)
	    {
		result = "OutPut => ˜Hit˜ ";
		numOfHits++;
		break;
	    }
	}
	
	if(numOfHits == locationCells.length) 
	{
	    result = "kill";
	}
	
	System.out.println(result);
	return result;
    }
}


public class SimpleDotComTestDrive
{
    @SuppressWarnings("unused")//Variable without referenced
    public static void main(String[] args)
    { 
	SimpleDotCom dot = new SimpleDotCom();
	SimpleDotCom theDotcom = new SimpleDotCom();
	
	GameHelper helper = new GameHelper();
	
	int numRandom = (int) (Math.random()* 5); 
	
	
	int [] locations = {numRandom, numRandom + 1, numRandom + 2}; 
	int numOfGuess = 0;
	
	theDotcom.selfLocationCells(locations);
	boolean isAlive = true;
	
	while (isAlive == true)
	{
	    String guess =  helper.getUserInput("Insert a number, please! ");
	    String result = theDotcom.checkYouself(guess);
	    numOfGuess++;
	    
	    if(result.equals("Kill")) 
	    {
		isAlive = false;
		
		System.out.println(" OutPut:= You used " + numOfGuess + "hunches!");
	    }
	}
	
	
	dot.selfLocationCells(locations);
	
	String userGuess = "2";
	String result = dot.checkYouself(userGuess);
	
	
	
    }
    
}


