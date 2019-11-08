package pooProjectSolid_DResolvido;

import java.util.List;

public class GeradorDeNotaFiscal {

	private List<AcaoAposGerarNota> acoes;

    public GeradorDeNotaFiscal(List<AcaoAposGerarNota> acoes) {
		this.acoes = acoes;
        
    }

    public NotaFiscal gerar(Fatura fatura) {

        double valor = fatura.getValorMensal();

        NotaFiscal nf = new NotaFiscal(1, valor, impostoSimplesSobreO(valor));

        for (AcaoAposGerarNota acaoAposGerarNota : acoes) {
			acaoAposGerarNota.executa(nf);
		}

        return nf;
    }

    private double impostoSimplesSobreO(double valor) {
        return valor * 0.06;
    }
}