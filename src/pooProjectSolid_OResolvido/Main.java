package pooProjectSolid_OResolvido;

public class Main {

	public static void main(String[] args) {

		TabelaDePreco tabela = new TabelaDePrecoDiferenciada();
		ServicoDeEntrega entrega = new Frete();

		Compra produto = new Compra(1500.00, "UMUARAMA");

		System.out.println(new CalculadoraDePrecos(tabela, entrega).calcular(produto));
	}
}
