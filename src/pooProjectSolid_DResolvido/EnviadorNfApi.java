package pooProjectSolid_DResolvido;

public class EnviadorNfApi implements AcaoAposGerarNota{
	
	@Override
    public void executa(NotaFiscal nf) {
        System.out.println("Enviar xml da nf para API");
    }
}