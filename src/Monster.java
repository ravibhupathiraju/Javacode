package LivingThing;
import java.util.Random;
public abstract class LivingThing {
	public String name;
	public int health;
	public int attackPower;
	public boolean isAlive() {
		if (this.health > 0) {
		return true;
		} else {return false;}
	}
	abstract public void takeDamage();
	abstract public void attack(LivingThing creature);

	public void InitCreature(String name, int health, int attackPower) {
		this.name= name;
		this.health= health;
		this.attackPower= attackPower;
	}
	public static void main(String[] args) {
		Rat objRat = new Rat();
		Ogre objOgre = new Ogre();
		Goblin objGoblin = new Goblin();
		Hero objHero = new Hero();
//		System.out.println(objRat.name); 
		LivingThing[] creatures = new LivingThing[4];
		creatures[0] = new Rat ();
		creatures[1] = new Ogre();
		creatures[2] = new Goblin ();
		creatures[3] = new Hero ();
//		System.out.println(creatures[0].name);
//		System.out.println(creatures[0].health);
//		objHero.attack(objRat);
		objHero.attack(creatures[0]);

	}
}

class  Rat extends LivingThing {
	public void takeDamage(){	
		this.health--;
		
	}
	public void attack(LivingThing creature){
	}
	public Rat(){
		this.name= "rat";
		this.health=10;
		this.attackPower= 2;
	}

}

//ravi
class  Ogre extends LivingThing {
	public void takeDamage(){
		
	}
	public void attack(LivingThing creature){
	}
	public Ogre(){
		this.name= "ogre";
		this.health=5;
		this.attackPower= 10;
	}

}
//
class  Goblin extends LivingThing {
	public void takeDamage(){
		
	}
	public void attack(LivingThing creature){		
	}
	public Goblin(){
		this.name= "goblin";
		this.health=5;
		this.attackPower= 10;
	}

}
//
class  Hero extends LivingThing {
	
	public Hero () {
		this.name="hero";
		this.health=40;
		this.attackPower=4;
	}
	public void takeDamage( ){
		
	}
	
	public boolean isAlive() {
		if (this.health > 0) {
		return true;
		} else {return false;}
	}
	
	public void attack(LivingThing creature){
		Random r = new Random();
		double d = Math.ceil((r.nextDouble())*2);
		System.out.println(d); 
///*
		System.out.println(this.health);
		while (creature.isAlive() || this.isAlive()){
			Random r = new Random();
			double d = Math.ceil((r.nextDouble())*2);
		
		if (d==1){ 
			creature.health -= this.attackPower;
		} else {
			this.health -= creature.attackPower;
		} 
		}
		}
		
		if (creature.isAlive()){
			System.out.println("hero looses");
		} else {
			System.out.println("creature looses");
		}
			
			System.out.println("hero health" + this.health);
			System.out.println("rat health" + creature.health);
//*/
		
//		System.out.println(creature.name);
	}
	public void fight(LivingThing[] creatureArray){
	}
	

}