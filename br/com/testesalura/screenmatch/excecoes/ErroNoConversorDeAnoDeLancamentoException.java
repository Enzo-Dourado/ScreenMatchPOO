package br.com.testesalura.screenmatch.excecoes;

public class ErroNoConversorDeAnoDeLancamentoException extends RuntimeException {
    private String mensagem;
    public ErroNoConversorDeAnoDeLancamentoException(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
