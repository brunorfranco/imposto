package contasbanco;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class FiltroComAberturaMesCorrente extends Filtro{

	public FiltroComAberturaMesCorrente(Filtro outroFiltro){
		super(outroFiltro);
	}
	
	public FiltroComAberturaMesCorrente(){}
	
	@Override
	public List<Conta> filtra(List<Conta> contas) {
		List<Conta> listaComAberturaMesCorrente = new ArrayList<Conta>();
		for(Conta conta : contas){
			if(conta.getDataCriacao().get(Calendar.MONTH) == Calendar.getInstance().get(Calendar.MONTH)){
				listaComAberturaMesCorrente.add(conta);
			}
		}
		
		return listaComAberturaMesCorrente;
	}
}
