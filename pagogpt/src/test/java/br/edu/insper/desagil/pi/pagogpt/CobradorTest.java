package br.edu.insper.desagil.pi.pagogpt;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class CobradorTest {

    @Test
    void nenhumaValida() {
        Usuario u = new Usuario("a@a", "Ana");
        List<Conversa> conversas = new ArrayList<>();
        Cobrador cobrador = new Cobrador(conversas);

        assertEquals(0.0, cobrador.calculaTotal(u), 0.01);
    }

    @Test
    void umaValida() {
        Usuario u1 = new Usuario("a@a", "Ana");
        Usuario u2 = new Usuario("b@b", "Bia diva");
        Usuario u3 = new Usuario("c@c", "Cirilo");

        Conversa c1 = mock(Conversa.class);
        when(c1.getUsuario()).thenReturn(u1);
        when(c1.calculaSubTotal()).thenReturn(1.5);

        Conversa c2 = mock(Conversa.class);
        when(c2.getUsuario()).thenReturn(u2);
        when(c2.calculaSubTotal()).thenReturn(2.5);

        Conversa c3 = mock(Conversa.class);
        when(c3.getUsuario()).thenReturn(u3);
        when(c3.calculaSubTotal()).thenReturn(3.5);

        List<Conversa> conversas = new ArrayList<>();
        conversas.add(c1);
        conversas.add(c2);
        conversas.add(c3);

        Cobrador cobrador = new Cobrador(conversas);
        assertEquals(1.5, cobrador.calculaTotal(u1), 0.01);
    }

    @Test
    void duasValidas() {
        Usuario u1 = new Usuario("a@a.com", "Ana");

        Conversa c1 = mock(Conversa.class);
        when(c1.getUsuario()).thenReturn(u1);
        when(c1.calculaSubTotal()).thenReturn(1.2);

        Conversa c2 = mock(Conversa.class);
        when(c2.getUsuario()).thenReturn(u1);
        when(c2.calculaSubTotal()).thenReturn(2.3);

        Usuario outro = new Usuario("b@b.", "Bia diva");
        Conversa c3 = mock(Conversa.class);
        when(c3.getUsuario()).thenReturn(outro);
        when(c3.calculaSubTotal()).thenReturn(3.4);

        List<Conversa> conversas = new ArrayList<>();
        conversas.add(c1);
        conversas.add(c2);
        conversas.add(c3);

        Cobrador cobrador = new Cobrador(conversas);
        assertEquals(3.5, cobrador.calculaTotal(u1), 0.01);
    }

    @Test
    void tresValidas() {
        Usuario u1 = new Usuario("a@a", "Ana");

        Conversa c1 = mock(Conversa.class);
        when(c1.getUsuario()).thenReturn(u1);
        when(c1.calculaSubTotal()).thenReturn(1.0);

        Conversa c2 = mock(Conversa.class);
        when(c2.getUsuario()).thenReturn(u1);
        when(c2.calculaSubTotal()).thenReturn(2.0);

        Conversa c3 = mock(Conversa.class);
        when(c3.getUsuario()).thenReturn(u1);
        when(c3.calculaSubTotal()).thenReturn(3.0);

        List<Conversa> conversas = new ArrayList<>();
        conversas.add(c1);
        conversas.add(c2);
        conversas.add(c3);

        Cobrador cobrador = new Cobrador(conversas);
        assertEquals(6.0, cobrador.calculaTotal(u1), 0.01);
    }
}
//oioiioioioio