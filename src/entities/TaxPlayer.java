package entities;

public abstract class TaxPlayer {
	private String name;
	private Double income;
	
	public TaxPlayer() {
	}

	public TaxPlayer(Double income, String name) {
		this.name = name;
		this.income = income;
	}

	public Double getIncome() {
		return income;
	}

	public void setIncome(Double income) {
		this.income = income;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract double TaxCalc();
	
}
