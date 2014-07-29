package impostos;

public class Reprovado implements EstadoDeUmOrcamento{

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Orçamento reprovado não recebe desconto");
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
