package relatorios;

public abstract class TemplateImprime implements Relatorio{

	public abstract String geraCabecalho(Relatorio relatorio);
	public abstract String geraRodape(Relatorio relatorio);

}
