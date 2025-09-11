package br.edu.insper.desagil.pi.pagogpt;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PromptGratuitoTest {
    private PromptGratuito p;

    @Test
    void precoCurto() {
        p = new PromptGratuito("pergunta", "Claro",10);
        assertEquals(0, p.calculaPreco());
    }
    @Test
    void precoLongo() {
        p = new PromptGratuito("pergunta longa", "Claro",10);
        assertEquals(14, p.calculaPreco());
    }
}
