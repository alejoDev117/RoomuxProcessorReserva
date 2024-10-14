package com.uco.RommuxProcessorReserva.service.transformer;

import com.uco.RommuxProcessorReserva.domain.UsuarioDomain;
import com.uco.RommuxProcessorReserva.entity.UsuarioEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class UsuarioTransformer {

    private  UsuarioTransformer(){

    }

    public static UsuarioEntity domainToEntity(UsuarioDomain usuario){
        return UsuarioEntity.builder().correoElectronico(usuario.getCorreoElectronico()).
                password(usuario.getPassword()).build();
    }

    public static UsuarioDomain entityToDomain(UsuarioEntity usuario){
        return UsuarioDomain.builder().correoElectronico(usuario.getCorreoElectronico()).
                password(usuario.getPassword()).build();
    }
    public static List<UsuarioDomain> entityListToDomainList(List<UsuarioEntity> list) {
        return list.stream()
                .map(entity -> UsuarioDomain.builder()
                        .correoElectronico(entity.getCorreoElectronico())
                        .password(entity.getPassword())
                        .build())
                .collect(Collectors.toList());
    }


}
