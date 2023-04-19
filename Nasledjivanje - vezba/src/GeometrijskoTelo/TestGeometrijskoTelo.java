package GeometrijskoTelo;

public class TestGeometrijskoTelo {

	public static void main(String[] args) {
		
		Kocka kocka[] = new Kocka[3];
		
		kocka[0] = new Kocka(25.5);
		kocka[1] = new Kocka(10.5);
		kocka[2] = new Kocka(5.2);
		
		for(int i = 0; i < kocka.length; i++) {
			System.out.println("Povrsina " + (i+1) + ". kocke = " + kocka[i].izracunajPovrsinu());
			System.out.println("Zapremina " + (i+1) + ". koceke = " + kocka[i].izracunajZapreminu());
		}
		

	}

}
