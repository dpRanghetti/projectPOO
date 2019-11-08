package pooProjectSolid_O;

public class Main {

	public static void main(String[] args) {

		Compra produto = new Compra(1500.00, "UMUARAMA");
		System.out.println(new CalculadoraDePrecos().calcular(produto, Regra.A));
		System.out.println(new CalculadoraDePrecos().calcular(produto, Regra.B));
	}
}
