package Creatures;

public class Hero extends LivingThing {

private int xp;	
	
public Hero(String name, int health, int attackPower, int attackChance, int xp) {
		super(name, health, attackPower, attackChance);
		this.xp = xp;
	}
public boolean isAlive() {
	if (health > 0) {
		//System.out.println("The hero takes it all.");
		return true;
	} else {
		System.out.println("The hero takes a fall.");
		return false;
	}
}

	public void fight(LivingThing[] opponents) {
		for (int i = 0; i < opponents.length; i++) {
			if ((!(opponents[i].isAlive())) && (opponents.length > 1)) {
				opponents = removeDeadMonster(opponents, i);
			}
			this.attack(opponents[i]);
			gainXP(1);
			if (!(this.isAlive())) {
				System.out.println("Heroic Harry died in combat.");
				break;
			}
		}
	}
	private LivingThing[] removeDeadMonster (LivingThing[] opponents, int idx) {
		LivingThing[] returnArray = new LivingThing[opponents.length-1];
		int j = 0;
		for (int i = 0; i < opponents.length; i++) {
			if (!(i == idx)) {
				returnArray[j] = opponents[i];
				j++;
			}
		}
		return returnArray;
	}

	public void gainXP(int xp) {
		this.xp += xp;
	}
}
