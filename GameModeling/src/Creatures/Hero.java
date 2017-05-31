package Creatures;

public class Hero extends LivingThing {

private int xp;	
	
public Hero(String name, int health, int attackPower, int attackChance, int xp) {
		super(name, health, attackPower, attackChance);
		this.xp = xp;
	}

	public void fight(LivingThing[] opponents) {
		for (int i = 0; i < opponents.length; i++) {
			this.attack(opponents[i]);
			gainXP(1);
		}
System.out.println(this.name + " died with xp: " + this.xp);
	}

	public void gainXP(int xp) {
		this.xp += xp;
	}
}
