package notafiscal;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class TesteAcoes {

	public static void main(String[] args) {
		List<AcaoAposGerarNota> listaAcoes = new ArrayList<AcaoAposGerarNota>();
		listaAcoes.add(new EnviadorDeEmail());
		listaAcoes.add(new NotaFiscalDao());
		listaAcoes.add(new EnviadorDeSMS());
		listaAcoes.add(new Impressora());
		listaAcoes.add(new Multiplicador(3));
		
		NotaFiscalBuilder builder = new NotaFiscalBuilder(listaAcoes);

		NotaFiscal nf = builder.paraEmpresa("razao").comCnpj("12")
				.comItem(new ItemDaNota("item1", 200)).comObservacoes("obs")
				.naData(Calendar.getInstance()).constroi();
		
		System.out.println(nf.getValorBruto());
	}
}
