public class UseWarrior {
	public static void main(String[] args) /*Main Method*/
	{
		Warrior.battle() ;
		Warrior myNinja  ;  
		myNinja = new Warrior() ;  /*Constructor is a Method that has the same
		name as the class it is part of. It is a special method that is solely
		used to instantiate an object of the class*/
		
		System.out.println(myNinja.doBattleNinja());
		System.out.println(myNinja.doBattleCrossbowman());
		Warrior.battle();       
	}

}

