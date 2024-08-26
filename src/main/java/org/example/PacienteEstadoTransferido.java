package org.example;

public class PacienteEstadoTransferido implements PacienteEstado {

    private PacienteEstadoTransferido() {};
    private static PacienteEstadoTransferido instance = new PacienteEstadoTransferido();
    public static PacienteEstadoTransferido getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Transferido";
    }

}