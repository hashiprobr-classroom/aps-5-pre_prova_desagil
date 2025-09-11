package br.edu.insper.desagil.pi.pagogpt;

public abstract class Prompt {
    private String pergunta;
    private String resposta;
    Prompt(String pergunta, String resposta){
        this.pergunta=pergunta;
        this.resposta=resposta;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    public String getPergunta() {
        return pergunta;
    }

    public abstract double calculaPreco();
}
