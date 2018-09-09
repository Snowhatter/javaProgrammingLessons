/*class name starts with capital letter*/
public class Warrior {
	
	public String wType	;
	public String wName	;
	public String wWeapon	;
	public int intNumberofWeapons	;
	public boolean isGood	;
	
	/*method names are in lower case*/
	public static void battle() 
	{
		System.out.println("All warriors fight!");
	}
	
	public String doBattleNinja()
	{
		return "Throws fighting stars" ;
	}
	
	public String doBattleCrossbowman()
	{
		return "Shoots arrows" ; 
	}

}
