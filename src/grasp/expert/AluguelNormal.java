package grasp.expert;

public class AluguelNormal implements Alugaveis{

	private DVD dvd;
    private int diasAlugada;
    private float valorCorrente;

    public AluguelNormal(DVD dvd, int diasAlugada) {
        this.dvd = dvd;
        this.diasAlugada = diasAlugada;
        valorCorrente = 1.5f;
    }
    
	@Override
	public float calcularAluguel() 
	{
        if (getDiasAlugada() > 2) {
            valorCorrente += (getDiasAlugada() - 2) * 1.5;
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
