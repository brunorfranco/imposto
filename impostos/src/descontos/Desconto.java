package descontos;

import impostos.Orcamento;

public interface Desconto {

	public double desconto(Orcamento orcamento);
	void setProximo(Desconto desconto);
}
