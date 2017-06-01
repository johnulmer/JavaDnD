package Creatures;

public class HorribleGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LivingThing[] monsters = new LivingThing[3]; 
		LivingThing rat = new Rat("ralph rat", 200, 1, 6);
		monsters[0] = rat;
		LivingThing ogre = new Ogre("ogre bob", 14, 8, 3);
		monsters[1] = ogre;
		LivingThing goblin = new Goblin("jimmy the goblin", 14, 2, 5);
		monsters[2] = goblin;
		Hero harry = new Hero("heroic harry", 30, 3, 7, 0);
		
		while (harry.isAlive() && (rat.isAlive() || ogre.isAlive() || goblin.isAlive())) {
			harry.fight(monsters);
		}
	}

}
