package notafiscal;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class NotaFiscalBuilder {

	private String razaoSocial;
	private String cnpj;
	private List<ItemDaNota> todosItens = new ArrayList<ItemDaNota>();
	private double valorBruto;
	private double impostos;
	private Calendar dataAtual;
	private String observacao;
	private List<AcaoAposGerarNota> listaTodasAcoes;

	public NotaFiscalBuilder(List<AcaoAposGerarNota> listaAcoes){
		listaTodasAcoes = listaAcoes;
	}
	
	public NotaFiscalBuilder paraEmpresa(String razaoSocial){
		this.razaoSocial = razaoSocial;
		return this;
	}
	
	public NotaFiscalBuilder comCnpj(String cnpj){
		this.cnpj = cnpj;
		return this;
	}

	public NotaFiscalBuilder comItem(ItemDaNota item){
		todosItens.add(item);
		valorBruto += item.getValor();
		impostos += item.getValor() * 0.05;
		return this;
	}
	
	public NotaFiscalBuilder comObservacoes(String observacao){
		this.observacao = observacao;
		return this;
	}
	
	public NotaFiscalBuilder naData(Calendar data){
		dataAtual = data;
		return this;
	}
	
	public NotaFiscal constroi(){
		
		if(dataAtual != null){
			NotaFiscal nf = new NotaFiscal(razaoSocial, cnpj, dataAtual, valorBruto, impostos, todosItens, observacao);
			for (AcaoAposGerarNota acao : listaTodasAcoes) {
				acao.executa(nf);
			}
			return nf;
		} else {
			NotaFiscal nf = new NotaFiscal(razaoSocial, cnpj, Calendar.getInstance(), valorBruto, impostos, todosItens, observacao);
			for (AcaoAposGerarNota acao : listaTodasAcoes) {
				acao.executa(nf);
			}
			return nf;
		}
	}
}
