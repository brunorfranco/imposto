package impostos;

public class Finalizado implements EstadoDeUmOrcamento{

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Esse estado não recebe desconto");
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
		throw new RuntimeException("Nao permitido");
	}
	

}
