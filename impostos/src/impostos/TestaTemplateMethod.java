package impostos;

public class TestaTemplateMethod {

	public static void main(String[] args) {
		
		Imposto ikcv = new IKCV();
		Imposto icpp = new ICPP();
		Imposto ihit = new IHIT();
		
		Orcamento orcamento1 = new Orcamento(50.0);
		
		Orcamento orcamento2 = new Orcamento(550.0);
		orcamento2.adicionaItem(new Item("Lapis", 110));
		
		Orcamento orcamento3 = new Orcamento(550.0);
		orcamento3.adicionaItem(new Item("Lapis", 110));
		orcamento3.adicionaItem(new Item("Lapis", 110));
		
		CalculadorDeImpostos calculador = new CalculadorDeImpostos();
		calculador.realizaCalculo(orcamento1, ikcv);
		calculador.realizaCalculo(orcamento2, icpp);
		calculador.realizaCalculo(orcamento3, ihit);
		
	}
}
