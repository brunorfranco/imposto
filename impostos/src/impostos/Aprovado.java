package impostos;

public class Aprovado implements EstadoDeUmOrcamento{

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		orcamento.valor = orcamento.valor * 0.02;
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Nao permitido");
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Nao permitido");
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.estadoAtual = new Finalizado();
	}

}
