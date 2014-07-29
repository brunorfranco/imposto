package contasbanco;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class TesteFiltros {

public static void main(String[] args) {
		
		Filtro listaContas = new FiltroSaldoMenorQue100Reais(new FiltroComSaldoMairQue500MilReais(new FiltroComAberturaMesCorrente()));
		
		List<Conta> contas = new ArrayList<Conta>();
		
		Conta conta = new Conta("Brun", 600000, Calendar.getInstance());

		contas.add(conta);
		
		List<Conta> listaFiltrada = listaContas.filtra(contas);
		
		if(listaFiltrada != null){
			for(Conta contaAux : listaFiltrada){
				System.out.println(contaAux.getNomeTitular());
			}
		}
	}
	
}
