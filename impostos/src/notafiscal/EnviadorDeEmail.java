package notafiscal;


public class EnviadorDeEmail implements AcaoAposGerarNota{

	@Override
	public void executa(NotaFiscal nf) {
		System.out.println("Enviei por email");
	}

}
