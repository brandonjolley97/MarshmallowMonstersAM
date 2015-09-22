package marshmallows.controller;

import marshmallow.model.MarshmallowMonster;
import java.util.Scanner;
import marshmallows.view.MarshmallowOutput;

public class MonsterController
{
	private MarshmallowMonster bolinMonster;
	private MarshmallowMonster userMonster;
	private MarshmallowOutput myOutput;
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
		myOutput = new MarshmallowOutput();
		bolinMonster = new MarshmallowMonster(name, eyes, noses, hairs, legs, hasBellyButton);
	}
	
	public void start()
	{
		myOutput.displayMonsterInfo(bolinMonster.toString());
		myOutput.displayMonsterGUI(bolinMonster.toString());
		//this.makeUserMonster();
		//myOutput.displayMonsterInfo("New Monster Info" + userMonster.toString());
		myOutput.displayTerminatorGUI(bolinMonster.toString());
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

