package vezbaNASLEDJIVANJE;

public class LhasaApso extends Pas {
	
	private int efikasnostCuvanja;
	
	public LhasaApso() {
	}
	public int getCuvanje() {
		return efikasnostCuvanja;
	}
	public void setEfikasnostCuvanja(int cuvati) {
		efikasnostCuvanja = cuvati;
	}
	
	public void cuvaj() {
		System.out.println("Nesto mi ovde smrdi. \nHej, ovde ja cuvam! ");
	}

}
