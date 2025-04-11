package entities;

public class NaturalPerson extends TaxPlayer{
	private Double healthExpenses;
	
	public NaturalPerson() {
		super();
	}

	public NaturalPerson(Double income, String name, Double healthExpenses) {
		super(income, name);
		this.healthExpenses = healthExpenses;
	}

	public Double getHealthTax() {
		return healthExpenses;
	}

	public void setHealthTax(Double healthExpenses) {
		this.healthExpenses = healthExpenses;
	}

	@Override
	public double TaxCalc() {
		if(super.getIncome() > 20000.0) {
			return getIncome() * 0.25 - healthExpenses * 0.5;
		}else {
			return getIncome() * 0.15 - healthExpenses * 0.5;
		}
	}

}
