package grasp.expert;

import java.util.ArrayList;
import java.util.Collection;

public class Cliente {

	private String nome;
	private int pontosDeAlugadorFrequente = 0;
    private Collection<Alugaveis> dvdAlugados = new ArrayList<>();

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void adicionaAluguel(Alugaveis aluguel) {
    	dvdAlugados.add(aluguel);
    }

    public void extrato() {
        
        double valorTotal = 0.0;
        System.out.println(toString());
        
        for (Alugaveis f : dvdAlugados) 
        {
            Alugaveis cada = f;
            pontosDeAlugadorFrequente += cada.calcularFidelidade();
            cada.calcularAluguel();
            System.out.println(cada);
            valorTotal += cada.getValorCorrente();
        }
        System.out.println("Valor total devido: " + valorTotal);
        System.out.println("Você acumulou "+pontosDeAlugadorFrequente+
        		" de fidelidade");
    }
    
    @Override
    public String toString() {
    	String resultado = "Registro de Alugueis de " + getNome() + "\n";
		resultado += "Saldo anterior fidelidade " + pontosDeAlugadorFrequente
		+ " pontos de alugador frequente";
    	return resultado;
    }
}
