package pooProjectSolid_OResolvido;

public class TabelaDePrecoDiferenciada implements TabelaDePreco {

	@Override
	public double descontoPara(double valor) {
		
		if(valor > 1000)
			return 0.08;
		
		return 0;
	}

}
