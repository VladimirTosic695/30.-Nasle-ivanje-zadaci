package Polimorfizam3;

public class Test {

	public static void main(String[] args) {
		
		Krug k  = new Krug(2);
		Pravougaonik p = new Pravougaonik(4, 5);
		
		System.out.println("Povrsina kruga: " + k.uzmiPovrsinu());
		System.out.println("Povrsina pravougaonika: " + p.uzmiPovrsinu());

	}

}
