package Creatures;

import java.util.Random;

public class LivingThing {

	public int health;
	public int attackPower;
	public int attackChance;
	public String name;
	public Random r;

	public LivingThing(String name, int health, int attackPower, int attackChance) {
		super();
		r = new Random();
		this.name = name;
		this.health = health;
		this.attackPower = attackPower;
		this.attackChance = attackChance;
	}
	
	public boolean isAlive() {
		if (health > 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public void takeDamage(int damage) {
		this.health = this.health - damage;
	}
	public void gainHealth(int healing) {
		this.health = this.health + healing;
		System.out.println(this.name + " healed for " + healing);
	}
	public void SpecialAttack(int damage) {
		this.health = this.health - damage;
		System.out.println("totally lame creature has no special attack.");
	}
	
	public void attack(LivingThing opponent){
System.out.println(this.name + " attacking " + opponent.name);
		int attack = r.nextInt(11);
		if ((attack < attackChance) && opponent.isAlive()) {
			opponent.takeDamage(attackPower);
			this.gainHealth(1);
		} else if ((attack == attackChance) && opponent.isAlive()) {
			opponent.SpecialAttack(attackPower);
		} else {
			if (opponent.isAlive()) {
			this.takeDamage(opponent.attackPower);
			}
		}
	}
}
