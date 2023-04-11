
public abstract class Product {

	public int amount; //property
	public int prijs;
	public String name;
	public boolean electric;

	// abstract method
	public abstract int getPrice();
	public abstract int getStartTime();
	
	// Constructors
	//public Product() {
	//	System.out.println("In constructor");
	//}
	
	//public Product(int amount, int prijs, String name, boolean electric) {
	//	this.amount = amount;
	//	this.prijs = prijs;
	//	this.name = name;
	//	this.electric = electric;
	//}
	
	//public Product(int amount) {
	//	this.amount = amount;
	//}
	
	public void doeIets() {
		System.out.println(amount);
	} // methods

	public void doeIets2() {
		System.out.println(name);
	} // method

	public void doeIets3() {
		System.out.println(electric);
	} // method

	public void stelPrijsIn(int prijs) {
		System.out.println("Prijs = " + this.prijs);
		this.prijs = prijs;
		System.out.println("Nieuwe prijs = " + this.prijs);
	}

	public void stelHoeveelheidIn(int amount) {
		this.amount = amount;
		System.out.println(amount);
	}

	public void stelNaamIn(String name) {
		this.name = name;
		System.out.println(name);
	};
	
	
	// getter
	public String watIsDeNaam() {
		return name;
	}
	
	public int watIsDePrijs() {
		return prijs;
	}
	
	public int watIsDeHoeveelheid() {
		return amount;
	}
	

}

