package Uredjaj2;

public class KlimaUredjaj extends Uredjaj {
	
	int temp = 18;
	
	public KlimaUredjaj(String marka, boolean ukljucen, int t) {
		super(marka,ukljucen);
		if (t < 18 || t > 30)
			System.out.println("Temperatura mora biti 18-30");
		else {		
			temp = t;
		}
	}
	public int povecajTemperaturu() {
		if(temp == 30)
			return temp = 18;
		else
			return temp++;
	}
	public int smanjiTemperaturu() {
		if(temp == 18)
			return temp = 30;
		else
		return temp--;
	}
	public void ispisi() {
		super.ispisi();
		System.out.println("Trenutna temperatura: " + temp);
	}
	

}
