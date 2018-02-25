package br.com.headfirstjava.chapter06;

import java.util.*;

public class DotComBust2
{
    
    private GameHelper helper = new GameHelper(); 
    private ArrayList<SimpleDotCom> dotComsList  = new  ArrayList<SimpleDotCom>(); 
    private int numOfGuess = 0;
    
    public void setUpGame() 
    {
	SimpleDotCom one = new SimpleDotCom();
	SimpleDotCom two = new SimpleDotCom();
	SimpleDotCom three = new SimpleDotCom();
	
	one.setName("Pets.com");
	two.setName("eToys.com");
	three.setName("Go2.com");
	
	dotComsList.add(one);
	dotComsList.add(two);
	dotComsList.add(three);
	
	System.out.println("Your objective is eliminater the dot.com");
	System.out.println("Pets.com , eToys.com , Go2.com");
	System.out.println("Try to eliminate in a few tries\n");
	
	for(SimpleDotCom dotComToset:dotComsList)
	{
	    ArrayList<String>newLocation = helper.placeDotCom(3); 
	    dotComToset.setLocationCells(newLocation);   
	}
    }
    public void starPlaying() 
    {
	while(!dotComsList.isEmpty())
	{
	    String userGuess = helper.getUserInput("Insert a hunch, please!");
	    checkUserGuess(userGuess);
	}
    }
    
    public void checkUserGuess(String userGuess)
    {
	numOfGuess++;
	String result = "Wrong";
	
	for(SimpleDotCom dotComToTest:dotComsList)
	{
	    result = dotComToTest.checkYouSelf(userGuess);
	    if(result.equals("Remove"))
	    {
		dotComsList.remove(dotComToTest);
		break;
	    }
	}
	System.out.println("result");
    }
    public void finishGame() 
    {
	System.out.println("all dot.com were deleted. Did Now your conjunct this empty! ");
	if(numOfGuess >= 18)
	{
	    System.out.println("You used " + numOfGuess + " hunchs");
	    System.out.println("You exited before of elimited your options.");
	}
	else
	{
	    System.out.println("took too long " + numOfGuess + " hunchs");
	    System.out.println("there will be no fishing these options");
	}
    }
}