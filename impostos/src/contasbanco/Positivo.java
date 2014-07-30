package contasbanco;

public class Positivo implements EstadoDaConta{

	@Override
	public void saca(Conta conta, double valor) {
		conta.setValorAtual(conta.getValorAtual() - valor);
		
		if(conta.getValorAtual() < 0 ) conta.setEstado(new Negativo());
	}

	@Override
	public void deposita(Conta conta, double valor) {
		conta.setValorAtual(conta.getValorAtual() + valor*0.98);
		
	}

}
