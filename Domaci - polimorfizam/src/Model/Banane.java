package Model;

public class Banane extends Voce {
	@Override
	public double kupovinaVoca(double brKg) {
		double iznos = getKupovnaCena() * brKg * 1.2;
		setKupovnaCena(iznos);
		return iznos;
	}
}
