package marshmallows.controller;

import marshmallow.model.MarshmallowMonster;
import marshmallows.view.MarshmallowOutput;

public class MonsterController
{
	private MarshmallowMonster bolinMonster;
	private MarshmallowMonster myOutput;
	
	public MonsterController()
	{
		int eyes = 4;
		double legs = 7;
		double hairs = 2.2;
		int noses = 3;
		boolean hasBellyButton = true;
		String name = "Tragdor the Burninator";
		
		myOutput new MarshmallowOutput();
		bolinMonster = new MarshmallowMonster(name, eyes, noses, hairs, legs, hasBellyButton);
	}
	
	public void start()
	{
		myOutput.displayMonsterInfo(bolinMonster.toString());
	}
}
