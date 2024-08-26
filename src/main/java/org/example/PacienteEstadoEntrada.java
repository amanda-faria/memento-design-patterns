package org.example;

public class PacienteEstadoEntrada implements PacienteEstado {

    private PacienteEstadoEntrada() {};
    private static PacienteEstadoEntrada instance = new PacienteEstadoEntrada();
    public static PacienteEstadoEntrada getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Matriculado";
    }

}