package pooProjectSolid_D;

public class GeradorDeNotaFiscal {

	private final EnviadorDeEmail email;
    private final EnviadorNfApi api;

    public GeradorDeNotaFiscal(EnviadorDeEmail email, EnviadorNfApi api) {
        this.email = email;
        this.api = api;
    }

    public NotaFiscal gerar(Fatura fatura) {

        double valor = fatura.getValorMensal();

        NotaFiscal nf = new NotaFiscal(valor, impostoSimplesSobreO(valor));

        email.enviaEmail(nf);
        api.persiste(nf);

        return nf;
    }

    private double impostoSimplesSobreO(double valor) {
        return valor * 0.06;
    }
}