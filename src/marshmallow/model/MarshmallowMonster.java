package marshmallow.model;

public class MarshmallowMonster
{
	
	private String monsterName;
	private int monsterEyes;
	private int monsterNoses;
	private double monsterHairs;
	private double monsterLegs;
	private boolean monsterBellyButtons;

	private MarshmallowMonster()
	{
	
	}
	public MarshmallowMonster(String monsterName, int monsterEyes, int monsterNoses, double monsterHairs, double monsterLegs, boolean monsterBellyButtons)
	{
		this.monsterName = monsterName;
		this.monsterEyes = monsterEyes;
		this.monsterNoses = monsterNoses;
		this.monsterHairs = monsterHairs;
		this.monsterLegs = monsterLegs;
		this.monsterBellyButtons = monsterBellyButtons;
		
	}
	
	//Getters & Setters
	public String getMonsterName()
	{
		return monsterName;
	}
	
	
	public int getMonsterEyes()
	{
		return monsterEyes;
	}
	
	public int getMonsterNoses()
	{
		return monsterNoses;
	}
	
	public double getMonsterHairs()
	{
		return monsterHairs;
	}
	
	public double getMonsterLegs()
	{
		return monsterLegs;
	}
	
	public boolean getMonsterBellyButtons()
	{
		return monsterBellyButtons;
	}
	
	public void setMonsterName(String monsterName)
	{
		this.monsterName = monsterName;
	}
	
	public void setMonsterEyes(int monsterEyes)
	{
		this.monsterEyes = monsterEyes;
	}
	
	public void setMonsterNoses(int monsterNoses)
	{
		this.monsterNoses = monsterNoses;
	}
	
	public void setMonsterHairs(double monsterHairs)
	{
		this.monsterHairs = monsterHairs;
	}
	
	public void setMonsterLegs(double monsterLegs)
	{
		this.monsterLegs = monsterLegs;
	}
	
	public void setMonsterBellyButtons(boolean monsterBellyButtons)
	{
		this.monsterBellyButtons = monsterBellyButtons;
	}
	
	public String toString()
	{
		String monster = "This monster has " + monsterEyes + " eyes and its name is " + monsterName;
		
		return monster;
	}
	
}
