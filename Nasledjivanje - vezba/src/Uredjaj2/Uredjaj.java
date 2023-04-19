package Uredjaj2;

public class Uredjaj {
	
	String marka;
	boolean ukljucen;
	
	Uredjaj(String marka, boolean ukljucen){
		if(marka.isBlank())
			System.out.println("Morate navesti marku uredjaja");
		else
			this.marka = marka;
		this.ukljucen = ukljucen;
	}
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		if(marka.isBlank())
			System.out.println("Greska. Marka se mora navesti.");
		else
			this.marka = marka;
	}
	
	public boolean ukljuci() {
		return ukljucen = true;
	}
	public boolean iskljuci() {
		return ukljucen = false;
	}
	public void ispisi() {
		System.out.println("Marka uredjaja: " + marka);
		if(ukljucen)
			System.out.println("Uredjaj je ukljucen.");
		else
			System.out.println("Uredjaj je iskljucen.");
		
	}
	

}
