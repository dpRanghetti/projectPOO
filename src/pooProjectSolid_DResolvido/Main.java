package pooProjectSolid_DResolvido;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		EnviadorDeEmail email = new EnviadorDeEmail();
		EnviadorNfApi api = new EnviadorNfApi();
		Fatura fatura = new Fatura(1000.00, "Joaquim");
		
		List<AcaoAposGerarNota> acoes = new ArrayList<>();
		acoes.add(email);
		acoes.add(api);

		NotaFiscal nf = new GeradorDeNotaFiscal(acoes).gerar(fatura);
		System.out.println(nf.toString());

	}

}
