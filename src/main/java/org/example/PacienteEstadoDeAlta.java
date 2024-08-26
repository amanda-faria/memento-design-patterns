package org.example;

public class PacienteEstadoDeAlta implements PacienteEstado {

    private PacienteEstadoDeAlta() {};
    private static PacienteEstadoDeAlta instance = new PacienteEstadoDeAlta();
    public static PacienteEstadoDeAlta getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Liberado";
    }

}