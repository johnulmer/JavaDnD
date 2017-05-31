package Creatures;

import java.util.Random;

public class LivingThing {

	private int health;
	private int attackPower;
	private int attackChance;
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
			if (this instanceof Hero) {
			System.out.println("woohoo - alive");
			}
			return true;
		} else {
			if (this instanceof Hero) {
			System.out.println("aww - dead.  for a 99 cent in app purchase you will get 5 more health.");
			} 
			//else {
				//System.out.println(this.name + "'s time has come - deceased.");
			//}
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
		this.health = this.health - (2 * damage);
		System.out.println("totally lame creature has no special attack.");
	}
	
	public void attack(LivingThing opponent){

		int attack = r.nextInt(11);
		if ((attack < attackChance) && opponent.isAlive()) {
			opponent.takeDamage(attackPower);
			System.out.println("Opponent: " + opponent.name 
					+ " got hit for this much damage: " + opponent.attackPower);
			this.gainHealth(1);
			System.out.println(this.name + " current health is: " + this.health);
		}else{
			if (opponent.isAlive()) {
			this.takeDamage(opponent.attackPower);
			System.out.println(this.name + " got hit for this much damage: " 
					+ opponent.attackPower);
			System.out.println(this.name + " current health is: " + this.health);
			}
		}
	}
}
