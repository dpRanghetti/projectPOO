package pooProjectSolid_OResolvido;

public class Frete implements ServicoDeEntrega {

	public double para(String cidade) {

		if ("UMUARAMA".equals(cidade.toUpperCase()))
			return 10;

		return 30;
	}
}