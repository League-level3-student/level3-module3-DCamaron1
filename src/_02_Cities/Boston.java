package _02_Cities;

public class Boston extends City {

	public Boston(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	public double getAnnualTaxes() {
		double taxes = population * growthRate;
		double bonus = .5 * population;
		taxes = taxes + bonus;
		return taxes;
	}

}
