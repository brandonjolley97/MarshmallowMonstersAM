package marshmallows.controller;

import marshmallow.model.MarshmallowMonster;
import java.util.Scanner;
import marshmallows.view.MarshmallowOutput;

public class MonsterController
{
	private MarshmallowMonster bolinMonster;
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
		askQuestions();
		myOutput.displayMonsterInfo("New Monster Info" + bolinMonster.toString());
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
		System.out.println("")
		
		
	}
}
