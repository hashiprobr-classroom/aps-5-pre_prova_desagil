package br.edu.insper.desagil.pi.pagogpt;

import java.util.ArrayList;
import java.util.List;

public class Conversa {
    private Usuario usuario;
    private List<Prompt>prompts;
    public Conversa(Usuario usuario){
        this.usuario=usuario;
        this.prompts=new ArrayList<>();
    }

    public Usuario getUsuario() {
        return usuario;
    }
    public void adiciona(Prompt prompt){
        prompts.add(prompt);
    }
    public double calculaSubTotal(){
        double total=0.0;
        for(Prompt p:prompts){
            total+=p.calculaPreco();
        }
        return total;
    }
    public double calculaSubMedia() {
        if (prompts.isEmpty()) {
            throw new IllegalStateException("Nenhum prompt!");
        } else {
            double total = 0.0;
            for (Prompt p : prompts) {
                total += p.calculaPreco();
            }
            return total / prompts.size();
        }
    }
}
