package relatorios;

import java.util.Date;

public class RelatorioComplexo extends TemplateImprime{

	@Override
	public String geraCabecalho(Relatorio relatorio) {
		return "Nome" + "Endereco" + "Telefone";
	}

	@Override
	public String geraRodape(Relatorio relatorio) {
		return "Email" + new Date();
	}

	@Override
	public String imprime() {
		return "Teste relatorio complexo";
	}

}
