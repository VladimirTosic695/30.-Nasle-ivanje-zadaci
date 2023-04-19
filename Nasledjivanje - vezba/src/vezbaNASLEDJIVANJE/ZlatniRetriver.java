package vezbaNASLEDJIVANJE;

public class ZlatniRetriver extends Pas {
	
	int brzinaApotriranja;
	
	public ZlatniRetriver() {
	}
	
	public int getAport() {
		return brzinaApotriranja;
	}
	
	public void setAport(int aport) {
		brzinaApotriranja = aport;
	}
	
	public void aport() {
		System.out.println("Retriver aportira");
	}

}
