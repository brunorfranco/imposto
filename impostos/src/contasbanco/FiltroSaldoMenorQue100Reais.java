package contasbanco;

import java.util.ArrayList;
import java.util.List;

public class FiltroSaldoMenorQue100Reais extends Filtro{

	public FiltroSaldoMenorQue100Reais(Filtro outroFiltro){
		super(outroFiltro);
	}
	
	public FiltroSaldoMenorQue100Reais(){}
	
	@Override
	public List<Conta> filtra(List<Conta> contas) {
		List<Conta> listaComSaldoMenorQue100Reais = new ArrayList<Conta>();
		for(Conta conta : contas){
			if(conta.getValorAtual() < 100){
				listaComSaldoMenorQue100Reais.add(conta);
			}
		}
		return listaComSaldoMenorQue100Reais;
	}

}
