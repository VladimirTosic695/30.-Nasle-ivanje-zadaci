package Polimorfizam;

public class TestPolimorfizam {
	
	public static void crtajOblik(Oblik objekat) {
		objekat.crtaj();
	}

	public static void main(String[] args) {
		
		Krug krug = new Krug();
		Pravougaonik p = new Pravougaonik();
		Zvezda zve = new Zvezda();
		
		crtajOblik(krug);
		crtajOblik(p);
		crtajOblik(zve);
		
		System.out.println();
		
		krug.crtaj();
		p.crtaj();
		zve.crtaj();
		

	}

}
