package main;

import Model.Banane;
import Model.Jabuke;

public class Main {
	public static void main(String[] args) {

		Jabuke jabuke = new Jabuke();
		jabuke.setKupovnaCena(70);
		jabuke.setProdajnaCena(85);
		System.out.println("-----------JABUKE----------");

		System.out.println("Za 100 jabuka sa popustom od 10% platiti dobavljacu: "+jabuke.kupovinaVoca(100));
		System.out.println("Prodaja 100kg jabuka u vrednosti od: " + jabuke.prodajaVoca(100)+"\n");

		Banane banane = new Banane();
		banane.setKupovnaCena(130);
		banane.setProdajnaCena(170);
		System.out.println("-----------BANANE----------");
		System.out.println("Placeno 100kg banana sa pdvom: "+banane.kupovinaVoca(100));
		System.out.println("Naplaceno 100kg banana: "+banane.prodajaVoca(100));
	}
}
