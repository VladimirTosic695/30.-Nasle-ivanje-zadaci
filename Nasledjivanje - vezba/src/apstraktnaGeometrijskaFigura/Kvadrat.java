package apstraktnaGeometrijskaFigura;

public class Kvadrat extends GeometrijskaFigura {

	public double stranica;
	
	Kvadrat(double stranica){
		if(stranica > 0.0)
			this.stranica = stranica;
		else
			System.out.println("Greska. Duzina stranice mora biti pozitivna vrednost.");
	}
	
	public double izracunajPovrsinu() {
			return stranica * stranica;
	}

	
	public double izracunajObim() {
			 return 4 * stranica;
	}
	
	

}
