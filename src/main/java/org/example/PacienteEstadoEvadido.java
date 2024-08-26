package org.example;

public class PacienteEstadoEvadido implements PacienteEstado {

    private PacienteEstadoEvadido() {};
    private static PacienteEstadoEvadido instance = new PacienteEstadoEvadido();
    public static PacienteEstadoEvadido getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Evadido";
    }

}