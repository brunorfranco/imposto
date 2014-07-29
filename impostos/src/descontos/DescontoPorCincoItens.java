package descontos;

import impostos.Orcamento;

public class DescontoPorCincoItens implements Desconto {

	private Desconto proximoDesconto;

	public double desconto(Orcamento orcamento){
		if(orcamento.getItens().size() > 5){
			return orcamento.getValor() * 0.1;
		} else {
			return proximoDesconto.desconto(orcamento);
		}
	}
	
	@Override
	public void setProximo(Desconto desconto) {
		this.proximoDesconto = desconto;
	}
}
