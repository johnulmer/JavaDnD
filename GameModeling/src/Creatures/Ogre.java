package Creatures;

public class Ogre extends LivingThing {

	public Ogre(String name, int health, int attackPower, int attackChance) {
		super(name, health, attackPower, attackChance);
		// TODO Auto-generated constructor stub
	}
	public void SpecialAttack(int damage) {
		this.health = this.health - (3*damage);
		System.out.println("ogre smash!");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
