package contasbanco;

import java.util.List;

public abstract class Filtro {
	
	protected Filtro outroFiltro;
	
	public Filtro(Filtro outroFiltro){
		this.outroFiltro = outroFiltro;
	}
	
	public Filtro(){
	}

	 public abstract List<Conta> filtra(List<Conta> contas);
	
}
