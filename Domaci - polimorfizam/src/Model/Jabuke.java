package Model;

public class Jabuke extends Voce {
	@Override
	public double kupovinaVoca(double brKg) {
		if (brKg >= 100) {
			double iznos = brKg * getKupovnaCena() * 0.9;
			setKupovnaCena(iznos);
			return iznos;
		} else {
			double iznosBezPopusta= brKg*getKupovnaCena();
			setKupovnaCena(iznosBezPopusta);
			return iznosBezPopusta;
		}
	}
}
