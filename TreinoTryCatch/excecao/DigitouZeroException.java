package TreinoTryCatch.excecao;

public class DigitouZeroException extends RuntimeException {
    private String mensagem;
    public DigitouZeroException(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return mensagem;
    }
}
