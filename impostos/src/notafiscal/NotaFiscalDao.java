package notafiscal;


public class NotaFiscalDao implements AcaoAposGerarNota{

	@Override
	public void executa(NotaFiscal nf) {
		System.out.println("Salvei no banco");
	}
	
}
