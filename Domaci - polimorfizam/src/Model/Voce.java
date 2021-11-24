package Model;

public abstract class Voce {
	private double kupovnaCena;
	private double prodajnaCena;

	public void setKupovnaCena(double kupovnaCena) {
		this.kupovnaCena = kupovnaCena;
	}

	public void setProdajnaCena(double prodajnaCena) {
		this.prodajnaCena = prodajnaCena;
	}

	public double prodajaVoca(double brKg) {
		return brKg * prodajnaCena;
	}
	public double getKupovnaCena() {
		return kupovnaCena;
	}
	public abstract double kupovinaVoca(double brKg);

}
