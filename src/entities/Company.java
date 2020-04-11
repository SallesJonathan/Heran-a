package entities;

public class Company extends Person{
	private Integer employee;
	
	public Company() {
		
	}
	
	public Company(String name, Double anualincome, Integer employee) {
		super(name, anualincome);
		this.employee = employee;
	}
	
	public Integer getEmployee() {
		return employee;
	}

	public void setEmployee(Integer employee) {
		this.employee = employee;
	}
	
	
	@Override
	public Double Tax() {
		double total=0;
		if(this.getEmployee()<=10) {
			total= this.getAnualincome()*0.16;
		}else {
			total=this.getAnualincome()*0.14;
		}
		return total;
	}
	
}
