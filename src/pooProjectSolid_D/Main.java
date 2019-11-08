package pooProjectSolid_D;

public class Main {

	public static void main(String[] args) {

		EnviadorDeEmail email = new EnviadorDeEmail();
		EnviadorNfApi api = new EnviadorNfApi();
		Fatura fatura = new Fatura(1000.00, "Joaquim");

		NotaFiscal nf = new GeradorDeNotaFiscal(email,api).gerar(fatura);
		System.out.println(nf.toString());

	}

}
