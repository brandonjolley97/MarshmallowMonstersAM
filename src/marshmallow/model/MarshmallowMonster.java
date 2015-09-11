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
	
}
