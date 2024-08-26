package org.example;

import java.util.ArrayList;
import java.util.List;

public class Paciente {

    private PacienteEstado estado;
    private List<PacienteEstado> memento = new ArrayList<PacienteEstado>();

    public PacienteEstado getEstado() {
        return this.estado;
    }

    public void setEstado(PacienteEstado estado) {
        this.estado = estado;
        this.memento.add(this.estado);
    }

    public void restauraEstado(int indice) {
        if (indice < 0 || indice > this.memento.size() - 1) {
            throw new IllegalArgumentException("Índice inválido");
        }
        this.estado = this.memento.get(indice);
    }

    public List<PacienteEstado> getEstados() {
        return this.memento;
    }
}