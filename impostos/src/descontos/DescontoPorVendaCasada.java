package descontos;

import impostos.Item;
import impostos.Orcamento;

public class DescontoPorVendaCasada implements Desconto{

	private Desconto proximoDesconto;
	
	@Override
	public double desconto(Orcamento orcamento) {
		if(existe("LAPIS", orcamento) && existe("CANETA", orcamento)){
			return orcamento.getValor() * 0.05;
		} else {
			return proximoDesconto.desconto(orcamento);
		}
	}

	@Override
	public void setProximo(Desconto desconto) {
		this.proximoDesconto = desconto;
	}

	private boolean existe(String nomeDoItem, Orcamento orcamento) {
        for (Item item : orcamento.getItens()) {
            if(item.getNome().equals(nomeDoItem)) return true;
        }
        return false;
    }
	
}
