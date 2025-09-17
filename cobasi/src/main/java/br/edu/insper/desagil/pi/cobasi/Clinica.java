package br.edu.insper.desagil.pi.cobasi;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Clinica {
    private List<Historico> historicos;

    public Clinica() {
        this.historicos = new ArrayList<>();
    }

    public List<Historico> getHistoricos() {
        return historicos;
    }

    public void addHistoricoCachorro(String nomeTutor, String nome, LocalDate dataNascimento, double peso, String tipoBanho) {
        Tutor tutor = new Tutor(nomeTutor);
        historicos.add(new Historico(tutor, nome, 0, dataNascimento, peso, tipoBanho));
    }

    public void addHistoricoGato(String nomeTutor, String nome, LocalDate dataNascimento, double peso, String doenca) {
        Tutor tutor = new Tutor(nomeTutor);
        historicos.add(new Historico(tutor, nome, 1, dataNascimento, peso, doenca));
    }

    public void addHistoricoCobra(String nomeTutor, String nome, LocalDate dataNascimento, double peso, boolean venenosa) {
        Tutor tutor = new Tutor(nomeTutor);
        historicos.add(new Historico(tutor, nome, 2, dataNascimento, peso, Boolean.toString(venenosa)));
    }

    public void addHistoricoElefante(String nomeTutor, String nome, LocalDate dataNascimento, double peso, int pesoComida) {
        Tutor tutor = new Tutor(nomeTutor);
        historicos.add(new Historico(tutor, nome, 3, dataNascimento, peso, Integer.toString(pesoComida)));
    }

}
