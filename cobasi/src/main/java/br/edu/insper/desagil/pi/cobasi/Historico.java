package br.edu.insper.desagil.pi.cobasi;

import java.time.LocalDate;


public class Historico {
    private Tutor tutor;
    private String nome;
    private int tipo;
    private LocalDate dataNascimento;
    private double peso;
    private String extra;

    public Historico(Tutor tutor,String nome, int tipo, LocalDate dataNascimento, double peso, String extra) {
        this.tutor=tutor;
        this.nome = nome;
        this.tipo = tipo;
        this.dataNascimento = dataNascimento;
        this.peso = peso;
        this.extra = extra;
    }


    public String resumo() {
        String summary = tutor.resumoTutor();
        summary += "Animal: " + nome + "\n";
        summary += "Nascimento: " + dataNascimento.toString() + "\n";
        summary += "Peso: " + peso + "kg\n";

        if (tipo == 0) {
            summary += "Banho: " + extra + "\n";
        } else if (tipo == 1) {
            summary += "Doença: " + extra + "\n";
        } else if (tipo == 2) {
            summary += "Venenosa: " + Boolean.parseBoolean(extra) + "\n";
        } else if (tipo == 3) {
            summary += "Comida: " + Integer.parseInt(extra) + "\n";
        }
        return summary;
    }

    public Tutor getTutor() {
        return tutor;
    }
}
