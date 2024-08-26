package org.example;

public class PacienteEstadoObito implements PacienteEstado {

    private PacienteEstadoObito() {};
    private static PacienteEstadoObito instance = new PacienteEstadoObito();
    public static PacienteEstadoObito getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Falecido";
    }

}