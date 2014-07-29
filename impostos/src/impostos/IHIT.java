package impostos;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IHIT extends TemplateDeImpostoCondicional{

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return temDoisItensComMesmoNome(orcamento);
	}

	private boolean temDoisItensComMesmoNome(Orcamento orcamento) {
		String[] listaComNomesDosItens = new String[orcamento.getItens().size()];
		int i = 0;
		for(Item item : orcamento.getItens()){
			listaComNomesDosItens[i] = item.getNome();
			i++;
		}
		return checkDuplicateUsingSet(listaComNomesDosItens);
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.13;
	}

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getItens().size() * 0.01;
	}

	public boolean checkDuplicateUsingSet(String[] input){
        List inputList = Arrays.asList(input);
        Set inputSet = new HashSet(inputList);
        if(inputSet.size()< inputList.size()) { 
            return true;
        }
        return false;
    }


}
