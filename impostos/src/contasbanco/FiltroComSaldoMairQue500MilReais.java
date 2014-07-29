package contasbanco;

import java.util.ArrayList;
import java.util.List;

public class FiltroComSaldoMairQue500MilReais extends Filtro{

	public FiltroComSaldoMairQue500MilReais(Filtro outroFiltro){
		super(outroFiltro);
	}
	
	public FiltroComSaldoMairQue500MilReais(){}
	
	@Override
	public List<Conta> filtra(List<Conta> contas) {
		List<Conta> listaComSaldoMaiorQue500MilReais = new ArrayList<Conta>();
		for(Conta conta : contas){
			if(conta.getValorAtual() > 500000){
				listaComSaldoMaiorQue500MilReais.add(conta);
			}
		}
		return listaComSaldoMaiorQue500MilReais;
	}
}
