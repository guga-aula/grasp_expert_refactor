package grasp.expert;

public class Aluguel {

	private DVD dvd;
    private int diasAlugada;

    public Aluguel(DVD dvd, int diasAlugada) {
        this.dvd = dvd;
        this.diasAlugada = diasAlugada;
    }

    public DVD getFita() {
        return dvd;
    }

    public int getDiasAlugada() {
        return diasAlugada;
    }
}
