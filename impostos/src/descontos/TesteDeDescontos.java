package descontos;

import impostos.Item;
import impostos.Orcamento;

public class TesteDeDescontos {
	
	public static void main(String[] args) {
	
		CalculadorDeDesconto descontos = new CalculadorDeDesconto();
		
		Orcamento orcamento = new Orcamento(450);
		orcamento.adicionaItem(new Item("CANETA", 25.0));
		orcamento.adicionaItem(new Item("LAPIS", 25.0));
		
		double descontoFinal = descontos.calcula(orcamento);
		System.out.println(descontoFinal);
		
	}
}
