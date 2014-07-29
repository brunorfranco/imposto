package contasbanco;

import java.util.Calendar;

public class Conta {

	private String nomeTitular;
	private double valorAtual;
	private Calendar dataCriacao;
	
	public Conta(String nomeTitular, double valorAtual, Calendar dataCriacao){
		this.nomeTitular = nomeTitular;
		this.valorAtual = valorAtual;
		this.dataCriacao = dataCriacao;
		
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public double getValorAtual() {
		return valorAtual;
	}

	public Calendar getDataCriacao() {
		return dataCriacao;
	}
	
}
