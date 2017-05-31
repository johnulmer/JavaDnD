package Creatures;



public class Rat extends LivingThing {

	
	public Rat(String name, int health, int attackPower, int attackChance) {
		super(name, health, attackPower, attackChance);
		// TODO Auto-generated constructor stub
	}
	
	public void attack(LivingThing opponent){
		int attack = r.nextInt(11);
		if(attack > 7){
			opponent.takeDamage(1);
		}else{
			this.takeDamage(1);
		}
	}

}
