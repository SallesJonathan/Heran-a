package entities;


public abstract class Person {
	
	private String name;
	private Double anualIncome;
	
	public Person() {
		
	}
	public Person(String name, Double anualincome) {
		this.name = name;
		this.anualIncome = anualincome;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getAnualincome() {
		return anualIncome;
	}
	public void setAnualincome(Double anualincome) {
		this.anualIncome = anualincome;
	}
	
	public abstract Double Tax();

	
}
