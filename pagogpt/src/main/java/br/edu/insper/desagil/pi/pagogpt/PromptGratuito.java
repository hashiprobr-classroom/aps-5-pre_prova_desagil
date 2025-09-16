package br.edu.insper.desagil.pi.pagogpt;

public class PromptGratuito extends Prompt{
    private int limite;
    public PromptGratuito(String pergunta, String resposta, int limite) {
        super(pergunta, resposta); // passa os valores
        this.limite = limite;
    }

    @Override
    public double calculaPreco() {
        if(getPergunta().length()<limite){
            return 0;
        }
        return getPergunta().length();
    }
}
