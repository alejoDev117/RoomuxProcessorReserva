package com.uco.RommuxProcessorReserva.service;


import com.uco.RommuxProcessorReserva.domain.UsuarioDomain;
import com.uco.RommuxProcessorReserva.repository.UsuarioRepository;
import com.uco.RommuxProcessorReserva.service.transformer.UsuarioTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


@Service
@Repository
public class UsuarioService {

    @Autowired
    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public void create(UsuarioDomain usuarioDomain){
        try{
            usuarioRepository.save(UsuarioTransformer.domainToEntity(usuarioDomain));
        }catch (DataAccessException e){
            e.printStackTrace();
        }
    }

    public void delete(UsuarioDomain usuarioDomain){
        try{
            usuarioRepository.deleteByEmail(usuarioDomain.getCorreoElectronico());
        }catch (DataAccessException e){
            e.printStackTrace();
        }
    }

}
