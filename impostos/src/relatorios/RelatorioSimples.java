package relatorios;

public class RelatorioSimples extends TemplateImprime{

	@Override
	public String geraCabecalho(Relatorio relatorio) {
		return "Nome banco" + "telefone";
	}

	@Override
	public String geraRodape(Relatorio relatorio) {
		return "Nome banco" + "telefone";
	}

	@Override
	public String imprime() {
		return "Teste relatorio simples";
	}

}
