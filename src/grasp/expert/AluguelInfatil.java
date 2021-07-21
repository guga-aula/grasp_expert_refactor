package grasp.expert;

public class AluguelInfatil implements Alugaveis{

	private DVD dvd;
    private int diasAlugada;
    private float valorCorrente;

    public AluguelInfatil(DVD dvd, int diasAlugada) {
        this.dvd = dvd;
        this.diasAlugada = diasAlugada;
        valorCorrente = 2;
    }
    
    
	@Override
	public float calcularAluguel() {
		if (getDiasAlugada() > 3) {
            valorCorrente += (getDiasAlugada() - 3) * 1.5;
		}
		return valorCorrente;
	}

	@Override
	public DVD getDVD() {
		return dvd;
	}

	@Override
	public int getDiasAlugada() {
		return diasAlugada;
	}
	
	public float getValorCorrente() {
		return valorCorrente;
	}


	@Override
	public int calcularFidelidade() {
		return 0;
	}
	
	@Override
	public String toString() {
		final String fimDeLinha = System.getProperty("line.separator");
		String resultado = "\t" + getDVD().getTítulo() + "\t"
                + getValorCorrente() + fimDeLinha;
		return resultado;
	}

}
