package grasp.expert;

public class Principal {

	public static void main(String[] args) {
		
		DVD dvd1 = new DVD("Filme 1", DVD.Tipo.lancamento);
		
		DVD dvd2 = new DVD("Filme 2", DVD.Tipo.normal);
		
		Alugaveis al1 = new AluguelLancamento(dvd1, 4);
		Alugaveis al2 = new AluguelNormal(dvd2, 5);
		
		Cliente c1 = new Cliente("Gustavo");
		
		c1.adicionaAluguel(al1);
		c1.adicionaAluguel(al2);
		
		c1.extrato();
	}
}
