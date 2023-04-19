package Uredjaj2;

public class TestUredjaj {

	public static void main(String[] args) {
		
		Uredjaj u = new Uredjaj("Samsung", true);
		
		KlimaUredjaj klima = new KlimaUredjaj("Gorenje" , false, 25);
		
		u.iskljuci();
		
		klima.ukljuci();
		
		klima.povecajTemperaturu();
		
		System.out.println("Podaci o klimi:");
		klima.ispisi();

	}

}
