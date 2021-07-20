package grasp.expert;

public class Principal {

	public static void main(String[] args) {
		
		DVD dvd1 = new DVD("Filme 1", DVD.Tipo.lancamento);
		
		DVD dvd2 = new DVD("Filme 2", DVD.Tipo.normal);
		
		Aluguel al1 = new Aluguel(dvd1, 3);
		Aluguel al2 = new Aluguel(dvd2, 3);
		
		Cliente c1 = new Cliente("Gustavo");
		
		c1.adicionaAluguel(al1);
		c1.adicionaAluguel(al2);
		
		System.out.println(c1.extrato());
	}
}
