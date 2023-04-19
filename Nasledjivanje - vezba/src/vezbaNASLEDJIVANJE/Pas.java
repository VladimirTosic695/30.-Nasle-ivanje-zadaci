package vezbaNASLEDJIVANJE;

public class Pas {
	
	private int frekvencijaLaveza;
	private int brzinaDahtanja;
	
	Pas(){}
	
	public int getFrekvencijaLaveza () {
		return frekvencijaLaveza;
	}
	public int getBrzinaDahtanja() {
		return brzinaDahtanja;
	}
	public void setFrekvencijaLaveza (int lavez) {
		frekvencijaLaveza = lavez;
	}
	public void setBrzinaDahtanja (int brzinaDahtanja) {
		this.brzinaDahtanja = brzinaDahtanja;
	}
	
	public void laj() {
		System.out.println("Pas laje.");
	}
	public void dahci() {
		System.out.println("Pas dahce.");
	}

}
