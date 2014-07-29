package impostos;

public class IKCV extends TemplateDeImpostoCondicional{

	public IKCV(Imposto outroImposto){
		super(outroImposto);
	}
	
	public IKCV(){}
	
	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		
		return orcamento.getValor() > 500 && temItemMaiorQue100Reais(orcamento);
	}

	private boolean temItemMaiorQue100Reais(Orcamento orcamento) {
		for(Item item : orcamento.getItens()){
			if(item.getValor() > 100) return true;
		}
		return false;
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.1;
	}

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}

}
