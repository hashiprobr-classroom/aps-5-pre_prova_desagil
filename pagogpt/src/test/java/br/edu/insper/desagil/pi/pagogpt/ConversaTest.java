package br.edu.insper.desagil.pi.pagogpt;

import org.junit.jupiter.api.BeforeEach;

public class ConversaTest {
    private Conversa c;
    private Usuario u;
    private Prompt p1,p2,p3;

    @BeforeEach
    void setUp() {
        u=new Usuario("oi@","tata");
        p1=new Prompt("oi","oi");
        p2=new Prompt("oi","oi");
        p3=new Prompt("oi","oi");

        c= new Conversa(prompts);
    }
}
