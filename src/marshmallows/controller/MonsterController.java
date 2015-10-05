package marshmallows.controller;

import marshmallow.model.MarshmallowMonster;
import java.util.Scanner;
import monster.input.view.MonsterPopupDisplay;

public class MonsterController
{
	private MarshmallowMonster bolinMonster;
	private MarshmallowMonster userMonster;
	private MonsterPopupDisplay myOutput;
	private Scanner monsterScanner;
	
	
	public MonsterController()
	{
		int eyes = 4;
		double legs = 7;
		double hairs = 2.2;
		int noses = 3;
		boolean hasBellyButton = true;
		String name = "Tragdor the Burninator";
		
		monsterScanner = new Scanner(System.in);
		myOutput = new MonsterPopupDisplay();
		bolinMonster = new MarshmallowMonster(name, eyes, noses, hairs, legs, hasBellyButton);
	}
	
	public void start()
	{
		String monsterName = myOutput.grabAnswer("Type in your monster's name.");
		myOutput.showResponse("You typed: " + monsterName);
		
		
		String monsterEyes = myOutput.grabAnswer("Type in the number of eyes your monster has");
		int monstEyes;
		
		while(!isInteger(monsterEyes))
		{
			monsterEyes=myOutput.grabAnswer("Type in a positive integer for the number of eyes!");
		}
		
		if(isInteger(monsterEyes))
		{
			monstEyes = Integer.parseInt(monsterEyes);
		}
		else
		{
			monstEyes = 666;
		}
		myOutput.showResponse("You typed: " + monsterEyes);
		
		String monsterNoses = myOutput.grabAnswer("Type in the number of noses your monster has.");
		int monstNoses;
		
		while(!isInteger(monsterNoses))
		{
			monsterNoses = myOutput.grabAnswer("Type in a positive integer for the number of noses!!!");
		}
		
		if(isInteger(monsterNoses))
		{
			monstNoses = Integer.parseInt(monsterNoses);
		}
		else
		{
			monstNoses = 666;
		}
		myOutput.showResponse("You typed: " + monsterNoses);
		
		String monsterHairs = myOutput.grabAnswer("Type in the number of hairs your monster has.");
		double monstHairs;
		
		while (!isDouble(monsterHairs))
		{
			monsterHairs = myOutput.grabAnswer("Type in a positive number with a decimal for the number of hairs!!!");
		}
		
		if(isDouble(monsterHairs))
		{
			monstHairs = Double.parseDouble(monsterHairs);
		}
		else
		{
			monstHairs = 6.66;
		}
		myOutput.showResponse("You typed: " + monsterHairs);
		
		String monsterLegs = myOutput.grabAnswer("Type in the number of legs your monster has.");
		double monstLegs;
		
		while(!isDouble(monsterLegs))
		{
			monsterLegs = myOutput.grabAnswer("Type in a positive number with a decimal for the number of legs!!!");
		}
		
		if(isDouble(monsterLegs))
		{
			monstLegs = Double.parseDouble(monsterLegs);
		}
		else
		{
			monstLegs = 6.66;
		}
		myOutput.showResponse("You typed: " + monsterLegs);
		
		String monsterHasBellyButton = myOutput.grabAnswer("Type in whether your monster has a bellybutton.");
		boolean monstHasBellyButton;
		
		while(!isBoolean(monsterHasBellyButton))
		{
			monsterHasBellyButton = myOutput.grabAnswer("Type in true or false for your answer!!!");
		}
		
		if(isBoolean(monsterHasBellyButton))
		{
			monstHasBellyButton = Boolean.parseBoolean(monsterHasBellyButton);
		}
		else
		{
			monstHasBellyButton = true;
		}
		myOutput.showResponse("You typed: " + monsterHasBellyButton);
		
	}
	
	private boolean isInteger(String input)
	{
		boolean isInt = false;
		
		try
		{
			int monster = Integer.parseInt(input);
			isInt = true;
		}
		catch(NumberFormatException error)
		{
			myOutput.showResponse("Not an Int - Bad value will be used.");
		}
		
		return isInt;
	}
	
	private boolean isDouble(String input)
	{
		boolean isDouble = false;
		
		try
		{
			double monster = Double.parseDouble(input);
			isDouble = true;
		}
		catch(NumberFormatException error)
		{
			myOutput.showResponse("Not a Double - Bad value will be used.");
		}
		
		return isDouble;
	}
	
	private boolean isBoolean(String input)
	{
		boolean isBoolean = false;
		
		if(false == Boolean.parseBoolean(input))
		{
			myOutput.showResponse("Regardless of what you typed, false will be used.");
		}
		else
		{
			isBoolean = true;
		}
		
		return isBoolean;
	}
	
	
	
	private void askQuestions()
	{
		
		System.out.println("Type a better name for the monster");
		String betterMonsterName = monsterScanner.nextLine();
		bolinMonster.setMonsterName(betterMonsterName);
		System.out.println("Type in a better number of eyes for the monster");
		int betterMonsterEyes = monsterScanner.nextInt();
		bolinMonster.setMonsterEyes(betterMonsterEyes);
		System.out.println("Type in a better number of noses for the monster");
		int betterMonsterNoses = monsterScanner.nextInt();
		bolinMonster.setMonsterNoses(betterMonsterNoses);
		System.out.println("Type in a better number of hairs for the monster");
		double betterMonsterHairs = monsterScanner.nextDouble();
		bolinMonster.setMonsterHairs(betterMonsterHairs);
		System.out.println("Type in a better number of legs for the monster");
		double betterMonsterLegs = monsterScanner.nextDouble();
		bolinMonster.setMonsterLegs(betterMonsterLegs);
		System.out.println("Does it have a belly button?");
		
		
	}
	
	/**
	 * This method will get the information to create an instance of a MarshmallowMonster.
	 */
	
	private void makeUserMonster()
	{
		//Step one: Get Variables
		String userName;	//Declare a String type called userName.
		int userEyes;	//Declare an Int type called userEyes.
		int userNoses;	//Declare an Int type called userNoses.
		double userHairs;	//Declare a Double type called userHairs.
		double userLegs;	//Declare a Double type called userLegs.
		boolean userBellyButton;	//Declare a Boolean type called userBellyButton.
		
		//Step two: Define variables by using Scanner to get user input.
		System.out.println("Type in your name for your monster.");
		userName = monsterScanner.nextLine();
		System.out.println("Type in the number of eyes for your monster.");
		userEyes = monsterScanner.nextInt();
		System.out.println("Type in the number of noses for your monster.");
		userNoses = monsterScanner.nextInt();
		System.out.println("Type in the number of hairs for your monster.  Type a decimal.");
		userHairs = monsterScanner.nextDouble();
		System.out.println("Type in the number of legs for your monster.  Type a decimal");
		userLegs = monsterScanner.nextDouble();
		System.out.println("Does your monster have a belly button?  true or false.");
		userBellyButton = monsterScanner.nextBoolean();
		
		//Step three: Make a monster - Use the Constructor!!!
		userMonster = new MarshmallowMonster(userName, userEyes, userNoses, userHairs, userLegs, userBellyButton);
		
	}
}

