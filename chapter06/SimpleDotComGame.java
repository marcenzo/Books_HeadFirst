package br.com.headfirstjava.chapter06;

 
public class SimpleDotComGame
{
    @SuppressWarnings("unused")
    public void Go()
    {
	int numOfGuess = 0; 
	
	GameHelper helper = new GameHelper();
	SimpleDotCom theDotCom = new SimpleDotCom();
	
	int randomNum = (int)Math.random() * 5;
	int [] locations = {randomNum, randomNum++, randomNum + 2};
	
	//theDotCom.setLocationCells(loc);
	
	boolean isAlive = true;
	
	while (isAlive == true)
	{
	    String guess =  helper.getUserInput("Insert a number, please! ");
	    String result = theDotCom.checkYouSelf(guess);
	    numOfGuess++;
	    
	    if(result.equals("Kill")) 
	    {
		isAlive = false;
		
		System.out.print("\n\nOutPut:= You used " + numOfGuess + " hunches! \n\nDone");
	    }
	}
	
    }
}
