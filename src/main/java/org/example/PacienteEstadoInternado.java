package org.example;

public class PacienteEstadoInternado implements PacienteEstado {

    private PacienteEstadoInternado() {};
    private static PacienteEstadoInternado instance = new PacienteEstadoInternado();
    public static PacienteEstadoInternado getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Internado";
    }

}