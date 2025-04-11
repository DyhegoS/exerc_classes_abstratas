package entities;

public class LegalEntity extends TaxPlayer{
	private int numberOfEmployees;
	
	public LegalEntity() {
		super();
	}
	
	public LegalEntity(Double income, String name, int numberOfEmployees) {
		super(income, name);
		this.numberOfEmployees = numberOfEmployees;
	}

	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public double TaxCalc() {
		if(numberOfEmployees > 10) {
			return getIncome() * 0.14;
		}else {
			return getIncome() * 0.16;
		}
	}

}
