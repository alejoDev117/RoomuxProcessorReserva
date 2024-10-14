package com.uco.RommuxProcessorReserva.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.uco.RommuxProcessorReserva.crossCutting.utils.UtilDateTime;
import com.uco.RommuxProcessorReserva.crossCutting.utils.UtilEnum;
import com.uco.RommuxProcessorReserva.crossCutting.utils.UtilUUID;
import com.uco.RommuxProcessorReserva.domain.types.DiaSemana;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;
import java.util.UUID;

@Builder
@Getter
@Setter
public class DetalleReservaDomain {

    private UUID identificador;
    private String diaSemanal;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "HH:mm:ss")
    private LocalTime horaInicio;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "HH:mm:ss")
    private LocalTime horaFin;



    public static DetalleReservaDomain createWithDefaults() {
        return DetalleReservaDomain.builder().
                identificador(UtilUUID.getUuidDefaultValue()).
                diaSemanal(UtilEnum.enumToString(DiaSemana.NO_ASINADO)).
                horaInicio(UtilDateTime.getDefaultValueTime()).
                horaFin(UtilDateTime.getDefaultValueTime()).build();
    }

}
