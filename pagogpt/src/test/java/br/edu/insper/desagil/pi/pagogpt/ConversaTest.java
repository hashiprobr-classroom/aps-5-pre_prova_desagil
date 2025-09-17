package br.edu.insper.desagil.pi.pagogpt;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ConversaTest {

    private Conversa c;

    @BeforeEach
    void setUp() {
        Usuario u = new Usuario("oi@", "tata");
        c = new Conversa(u);
    }

    @Test
    void subTotalVazio() {
        assertEquals(0.0, c.calculaSubTotal(), 0.01);
    }

    @Test
    void subTotal() {

        Prompt p1 = new PromptPago("pergunta", "resposta", 0.1);   // 8*0.1 = 0.8
        Prompt p2 = new PromptPago("perg", "respostar", 0.25);           // 4*0.25 = 1.0
        Prompt p3 = new PromptPago("pq", "respost", 0.3);              // 2*0.3 = 0.6

        c.adiciona(p1);
        c.adiciona(p2);
        c.adiciona(p3);

        double expected = 0.8 + 1.0 + 0.6;
        assertEquals(expected, c.calculaSubTotal(), 0.01);
    }

    @Test
    void porPostVazio() {
        IllegalStateException e = assertThrows(IllegalStateException.class, () -> {
            c.calculaSubMedia();
        });

        assertEquals("Nenhum prompt!", e.getMessage());
    }

    @Test
    void porPost() {
        Prompt p1 = new PromptPago("pergunta", "resposta", 0.1);   // 0.8
        Prompt p2 = new PromptPago("perg", "res", 0.25);           // 1.0
        Prompt p3 = new PromptPago("pq", "r", 0.335);              // 0.67

        c.adiciona(p1);
        c.adiciona(p2);
        c.adiciona(p3);

        double expectedMedia = (0.8 + 1.0 + 0.67) / 3;
        assertEquals(expectedMedia, c.calculaSubMedia(), 0.01);
    }
}
