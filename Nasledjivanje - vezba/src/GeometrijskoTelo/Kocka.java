package GeometrijskoTelo;

public class Kocka extends GeometrijskoTelo {
	
	double stranica;
	
	Kocka(double stranica){
		if(stranica > 0)
			this.stranica = stranica;
		else
			System.out.println("Greska. Stranica mora biti veca od 0.");
	}
	
	public double izracunajPovrsinu() {
		return 6 * stranica * stranica;
	}
	
	public double izracunajZapreminu() {
		return stranica * stranica * stranica;
	}

}
