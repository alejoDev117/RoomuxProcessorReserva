package com.uco.RommuxProcessorReserva.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import com.uco.RommuxProcessorReserva.crossCutting.utils.UtilDateTime;
import com.uco.RommuxProcessorReserva.crossCutting.utils.UtilEnum;
import com.uco.RommuxProcessorReserva.crossCutting.utils.UtilUUID;
import com.uco.RommuxProcessorReserva.domain.types.Frecuencia;
import com.uco.RommuxProcessorReserva.domain.types.TipoReserva;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;


@Builder
@Getter
@Setter
public class ReservaDomain  {
        private UUID identificador;
        private UsuarioDomain autor;
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "UTC")
        private Date fechaInicio;
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "UTC")
        private Date fechaFin;
        private String tipoReserva;
        private String frecuencia;
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
        private LocalDateTime horaCreacion;
        private SalaDomain sala;
        private List<DetalleReservaDomain> detalleReserva;

    public static ReservaDomain createWithDefaults() {
        return ReservaDomain.builder().identificador(UtilUUID.getUuidDefaultValue()).autor(UsuarioDomain.createWithDefaults())
                .fechaInicio(UtilDateTime.getDefaultValueDate()).
                 fechaFin(UtilDateTime.getDefaultValueDate()).
                tipoReserva(UtilEnum.enumToString(TipoReserva.NO_ASIGNADO)).
                frecuencia(UtilEnum.enumToString(Frecuencia.NO_ASIGNADO)).
                horaCreacion(UtilDateTime.getDefaultValueDateTime()).
                sala(SalaDomain.createWithDefaults()).detalleReserva(new ArrayList<>()).build();
    }


}
