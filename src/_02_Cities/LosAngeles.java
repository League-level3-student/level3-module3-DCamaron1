package _02_Cities;

public class LosAngeles extends City {

	public LosAngeles(int population, double growthRate) {
		super(population, growthRate);

	}

	@Override
	public double getAnnualTaxes() {
		double taxes = population * growthRate;
		double bonus = growthRate / 2;
		taxes = taxes * bonus;
		return taxes;
	}

}
