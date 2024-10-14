package com.uco.RommuxProcessorReserva.domain;


import com.uco.RommuxProcessorReserva.crossCutting.utils.UtilEmail;
import com.uco.RommuxProcessorReserva.crossCutting.utils.UtilText;
import com.uco.RommuxProcessorReserva.crossCutting.utils.UtilUUID;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Builder
@Getter
@Setter
public class UsuarioDomain {
    private UUID identificador;
    private String correoElectronico;
    private String password;


    public static UsuarioDomain createWithDefaults() {
        return UsuarioDomain.builder().identificador(UtilUUID.getUuidDefaultValue())
                .correoElectronico(UtilEmail.getDefaultValueMail())
                .password(UtilText.getDefaultTextValue())
                .build();
    }

}
