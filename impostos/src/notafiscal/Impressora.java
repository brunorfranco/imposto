package notafiscal;


public class Impressora implements AcaoAposGerarNota{

	@Override
	public void executa(NotaFiscal nf) {
		System.out.println("Imprimi nota");
	}

}
