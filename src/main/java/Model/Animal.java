package Model;

public class Animal {
	private boolean isMammal;
	private String diet;
	private boolean isMale;
	
	
	public Animal(boolean isMammal, String diet, boolean isMale) {
		super();
		this.isMammal = isMammal;
		this.diet = diet;
		this.isMale = isMale;
	}


	public Animal() {
		super();
		this.isMale=false;
		this.isMammal=false;
		this.diet="";
	}


	public boolean isMammal() {
		return isMammal;
	}


	public void setMammal(boolean isMammal) {
		this.isMammal = isMammal;
	}


	public String getDiet() {
		return diet;
	}


	public void setDiet(String diet) {
		this.diet = diet;
	}


	public boolean isMale() {
		return isMale;
	}


	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}
	
	
	
	
	

}
