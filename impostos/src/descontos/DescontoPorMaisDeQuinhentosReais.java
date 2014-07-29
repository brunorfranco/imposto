package descontos;

import impostos.Orcamento;

public class DescontoPorMaisDeQuinhentosReais implements Desconto{

	private Desconto proximoDesconto;
	
	public double desconto(Orcamento orcamento){
		if(orcamento.getValor() > 500.0){
			return orcamento.getValor() * 0.07;
		} else {
			return proximoDesconto.desconto(orcamento);
		}
	}

	@Override
	public void setProximo(Desconto desconto) {
		this.proximoDesconto = desconto;
	}
	
}
