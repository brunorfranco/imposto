package contasbanco;

public class Negativo implements EstadoDaConta{

	@Override
	public void saca(Conta conta, double valor) {
		 throw new RuntimeException("Sua conta está no vermelho. Não é possível sacar!");
	}

	@Override
	public void deposita(Conta conta, double valor) {
		conta.setValorAtual(conta.getValorAtual() + valor*0.98);
		if(conta.getValorAtual() > 0) conta.setEstado(new Positivo());
	}

}
