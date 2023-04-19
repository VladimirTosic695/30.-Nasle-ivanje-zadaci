package vezbaNASLEDJIVANJE;

public class TestPas {

	public static void main(String[] args) {
		
		Pas p = new Pas();
		
		p.dahci();
		p.laj();
		
		ZlatniRetriver z = new ZlatniRetriver();
		
		z.aport();
		z.laj();
		z.dahci();
		z.brzinaApotriranja = 10;
		
		z.setBrzinaDahtanja(150);
		z.setFrekvencijaLaveza(1500);
		
		System.out.println("Zlatni retriver laje frekvencijom od " + z.getFrekvencijaLaveza()
		+ " db, dahce brzinom od " + z.getBrzinaDahtanja() + " udisaja u minuti i aportira u"
				+ " roku od " + z.getAport() + " sekundi. ");
		
		LhasaApso la = new LhasaApso();
		
		la.setEfikasnostCuvanja(100);
		
		la.cuvaj();
		la.laj();
		System.out.println("Moja efikasnost cuvanja je " + la.getCuvanje() + " %.");

	}

}
