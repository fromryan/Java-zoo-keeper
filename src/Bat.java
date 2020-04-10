
public class Bat extends Mammal {
	
	int energyLevel = 300;
	
	public int displayEnergyLevel() {
		System.out.println("Initial energy level:"+ energyLevel);
		return energyLevel;
	}
	
	public void fly() {
		this.energyLevel -= 50;
		System.out.println("The bat is flying (-50). It's energy level is now at " + energyLevel + '.');
	}
	
	public void eatOthers() {
		this.energyLevel += 25;
		System.out.println("The bat is eating (+25). It's energy level is now at " + energyLevel + '.');	
	}
	
	public void attackTown() {
		this.energyLevel -= 100;
		System.out.println("The bat attacked the town (-100). It's energy level is now at " + energyLevel + '.');
	}
	
}
