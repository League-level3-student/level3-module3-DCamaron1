package _02_Cities;

public class SanDiego extends City {

	public SanDiego(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	public double getAnnualTaxes() {
		double taxes = population * growthRate;
		double bonus = 1000000;
		taxes = taxes + bonus;
		return taxes;
	}
}
