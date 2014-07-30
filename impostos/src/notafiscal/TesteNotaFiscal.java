package notafiscal;

import java.util.ArrayList;
import java.util.List;


public class TesteNotaFiscal {
	
	public static void main(String[] args) {
		
		ItemNotaBuilder criadorDeItens = new ItemNotaBuilder()
		.comNome("item 1")
		.comValor(25);
		
		ItemDaNota item1 = criadorDeItens.constroi();
		
		List<AcaoAposGerarNota> listaAcoes = new ArrayList<AcaoAposGerarNota>();
		listaAcoes.add(new EnviadorDeEmail());
		listaAcoes.add(new NotaFiscalDao());
		listaAcoes.add(new EnviadorDeSMS());
		listaAcoes.add(new Impressora());
		listaAcoes.add(new Multiplicador(3));
		
		NotaFiscalBuilder criador = new NotaFiscalBuilder(listaAcoes)
		.paraEmpresa("Empresa teste")
		.comCnpj("123")
		.comItem(item1)
		.comObservacoes("obs");
		
		NotaFiscal nf = criador.constroi();
		
		System.out.println(nf.getDataDeEmissao());
		
	}

}
