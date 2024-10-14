package com.uco.RommuxProcessorReserva.domain;

import java.util.List;
import java.util.UUID;

public class Sala {
    private UUID identificador;
    private String nombreSala;
    private List<ReservaDomain> reservas;

    public Sala(UUID identificador, String nombreSala, List<ReservaDomain> reservas) {
        this.identificador = identificador;
        this.nombreSala = nombreSala;
        this.reservas = reservas;
    }
    public Sala(){

    }

    public UUID getIdentificador() {
        return identificador;
    }

    public void setIdentificador(UUID identificador) {
        this.identificador = identificador;
    }

    public String getNombreSala() {
        return nombreSala;
    }

    public void setNombreSala(String nombreSala) {
        this.nombreSala = nombreSala;
    }

    public List<ReservaDomain> getReservas() {
        return reservas;
    }

    public void setReservas(List<ReservaDomain> reservas) {
        this.reservas = reservas;
    }
}
