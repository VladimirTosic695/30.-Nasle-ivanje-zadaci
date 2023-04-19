package apstraktnaGeometrijskaFigura;

public class TestGeometrijskaFigura {

	public static void main(String[] args) {
		
		Kvadrat niz[] = new Kvadrat[3];
		
		niz[0] = new Kvadrat(25.5);
		niz[1] = new Kvadrat(10.5);
		niz[2] = new Kvadrat(5.2);
		
		
		
		for(int i = 0; i < niz.length; i++) {
			System.out.println("Povrsina " + (i + 1) +". kvadrata: " + niz[i].izracunajPovrsinu());
			System.out.println("Obim " + (i + 1) +". kvadrata: " + niz[i].izracunajObim());
		}
		
		
		

	}

}
