package grasp.expert;

public class AluguelLancamento implements Alugaveis{

	private DVD dvd;
    private int diasAlugada;
    private float valorCorrente;

    public AluguelLancamento(DVD dvd, int diasAlugada) {
        this.dvd = dvd;
        this.diasAlugada = diasAlugada;
        valorCorrente = 2;
    }
 
	@Override
	public float calcularAluguel() {
		valorCorrente = getDiasAlugada() * 3;
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
		// adiciona bonus para aluguel de um lançamento por pelo menos 2 dias
		if(getDiasAlugada() > 1) 
			return 1;
		else
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
