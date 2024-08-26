package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class PacienteTest {

    @Test
    void deveArmazenarEstados() {
        Paciente paciente = new Paciente();
        paciente.setEstado(PacienteEstadoEntrada.getInstance());
        paciente.setEstado(PacienteEstadoObito.getInstance());
        assertEquals(2, paciente.getEstados().size());
    }

    @Test
    void deveRetornarEstadoInicial() {
        Paciente paciente = new Paciente();
        paciente.setEstado(PacienteEstadoEntrada.getInstance());
        paciente.setEstado(PacienteEstadoObito.getInstance());
        paciente.restauraEstado(0);
        assertEquals(PacienteEstadoEntrada.getInstance(), paciente.getEstado());
    }

    @Test
    void deveRetornarEstadoAnterior() {
        Paciente paciente = new Paciente();
        paciente.setEstado(PacienteEstadoEntrada.getInstance());
        paciente.setEstado(PacienteEstadoInternado.getInstance());
        paciente.setEstado(PacienteEstadoEntrada.getInstance());
        paciente.setEstado(PacienteEstadoObito.getInstance());
        paciente.restauraEstado(2);
        assertEquals(PacienteEstadoEntrada.getInstance(), paciente.getEstado());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Paciente paciente = new Paciente();
            paciente.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }

}