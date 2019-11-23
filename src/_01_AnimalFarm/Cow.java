package _01_AnimalFarm;

public class Cow extends Animal{
	
	@Override
	public void makeNoise() {
		System.out.println("MOO");
	}
	
	public void eatFood() {
		System.out.println("I'm eating grass");
	}
}
