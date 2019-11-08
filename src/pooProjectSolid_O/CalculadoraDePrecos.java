package pooProjectSolid_O;

public class CalculadoraDePrecos {

	public double calcular(Compra produto, Regra regra) {

		if (regra.equals(Regra.A)) {
			
			TabelaDePrecoPadrao tabela = new TabelaDePrecoPadrao();
			Frete correios = new Frete();

			double desconto = tabela.descontoPara(produto.getValor());
			double frete = correios.para(produto.getCidade());

			return produto.getValor() * (1 - desconto) + frete;

		} else if (regra.equals(Regra.B)) {
			
			TabelaDePrecoDiferenciada tabela = new TabelaDePrecoDiferenciada();
			Frete correios = new Frete();

			double desconto = tabela.descontoPara(produto.getValor());
			double frete = correios.para(produto.getCidade());

			return produto.getValor() * (1 - desconto) + frete;
		}

		return 0;

	}
}
