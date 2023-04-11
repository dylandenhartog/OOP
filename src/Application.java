
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world!");
		
		//Product p = new Product(); //product aangemaakt
		//p.amount = 12;
		//p.prijs = 100;
		//p.name = "TV";
		//p.electric = true;
		//p.doeIets();
		//p.doeIets2();
		//p.doeIets3();
		
		//p.stelPrijsIn(101);
		//p.stelHoeveelheidIn(15);
		//p.stelNaamIn("naam1");
		
		//String name = p.watIsDeNaam();
		//int prijs = p.watIsDePrijs();
		//int amount = p.watIsDeHoeveelheid();
		
		//System.out.println(name);
		//System.out.println(prijs);
		//System.out.println(amount);
		
		
		
		//Product p2 = new Product(); //object
		//p2.name = "Wasmachine";
		//p2.doeIets();
		//p2.doeIets2();
		//p2.doeIets3();
		
		//p2.stelPrijsIn(20);
		//p2.stelHoeveelheidIn(25);
		//p2.stelNaamIn("naam2");
		
		//Product p3 = new Product();
		//Product p4 = new Product(1, 2, "Naam", true);
		//Product p5 = new Product(3);

		TV t = new TV(); 
		Wasmachine w = new Wasmachine(); 
		Laptop l = new Laptop(); 
		
		t.length = 20;
		w.weight = 10;
		l.model = 2;
		
		t.getPrice();
		t.getStartTime();
		w.getPrice();
		w.getStartTime();
		l.getPrice();
		l.getStartTime();
	}

}
