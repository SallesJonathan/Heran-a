package entities;

public class Individual extends Person{
	private Double heathExpenditures;
	
	public Individual() {
		super();
	}
	public Individual(String name, Double anualincome, Double heathExpenditures) {
		super(name, anualincome);
		this.heathExpenditures = heathExpenditures;
	}
	
	
	public Double getHeathExpenditures() {
		return heathExpenditures;
	}
	public void setHeathExpenditures(Double heathExpenditures) {
		this.heathExpenditures = heathExpenditures;
	}
	
	@Override
	public Double Tax() {
		double total=0;
		if(this.getAnualincome()<20000.00) {
			total=this.getAnualincome()*0.15;
			if(this.getHeathExpenditures()!=0) {
				total-=this.getHeathExpenditures()*0.5;
			}
		}else {
			if(this.getAnualincome()>20000.00){
				total=this.getAnualincome()*0.25;
				if(this.getHeathExpenditures()!=0) {
					total-=this.getHeathExpenditures()*0.5;
				}
			
		}
		}	
		return total;
	}
	
	
	
}
