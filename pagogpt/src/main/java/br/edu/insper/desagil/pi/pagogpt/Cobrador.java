package br.edu.insper.desagil.pi.pagogpt;

import java.util.List;

public class Cobrador {
    private List<Conversa>conversas;
    private Cobrador(List<Conversa>conversas){
        this.conversas=conversas;
    }
    public double calculaTotal(Usuario usuario){
        double total=0.0;
        for(Conversa c:conversas){
            if (c.getUsuario().getEmail().equals(usuario.getEmail())){
            total+=c.calculaSubTotal();
            }
        }
        return total;
    }
}
