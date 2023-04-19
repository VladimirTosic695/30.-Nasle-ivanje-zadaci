package Taksista;

public class Taksista {
	
	private static String imeKompanije = "Zuti taxi";
	private String ime;
	
	Taksista(){
		
	}
	Taksista(String ime){
		this.ime = ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getIme() {
		return ime;
	}
	
	public void setPravac() {
		System.out.println("Zadaj pravac.");
	}
	
	private void skreniDesno() {
		System.out.println("Skreni desno.");
	}
	private void skreniLevo() {
		System.out.println("Skreni levo.");
	}
	public static String uzmiImeKompanije() {
		return imeKompanije;
	}

}
