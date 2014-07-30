package notafiscal;


public class EnviadorDeSMS implements AcaoAposGerarNota{

	@Override
	public void executa(NotaFiscal nf) {
		System.out.println("Enviei por sms");
	}

}
