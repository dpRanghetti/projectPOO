package pooProjectSolid_O;

public class Frete {

	public double para(String cidade) {

		if ("UMUARAMA".equals(cidade.toUpperCase()))
			return 10;

		return 30;
	}
}