package br.edu.insper.desagil.pi.pagogpt;

public class PromptPago extends Prompt{
    private double fator;
    public PromptPago(String pergunta, String resposta, double fator) {
        super(pergunta, resposta); // passa os valores
        this.fator = fator;
    }
    @Override
    public double calculaPreco() {
        return getPergunta().length()*fator;
    }
}
