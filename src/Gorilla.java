
public class Gorilla extends Mammal {
	public void throwSomething() {
		boolean throwing = true;
		this.energyLevel = energyLevel - 5;
		System.out.println("Gorilla has thrown something (-5). Her energy level is now at "+ energyLevel + '.');
	}
	
	public void eatBananas() {
		boolean eating = true;
		this.energyLevel = energyLevel + 10;
		System.out.println("Gorilla is satisfied (+10). Her energy level is now at "+ energyLevel + '.');
	}
	
	public void climb() {
		boolean climbing = true;
		this.energyLevel = energyLevel - 10;
		System.out.println("Gorilla has climbed a tree (-10). Her energy level is now at " + energyLevel + '.');
	}

}
