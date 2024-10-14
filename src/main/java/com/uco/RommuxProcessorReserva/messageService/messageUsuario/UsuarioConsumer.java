package com.uco.RommuxProcessorReserva.messageService.messageUsuario;

import com.uco.RommuxProcessorReserva.domain.UsuarioDomain;
import com.uco.RommuxProcessorReserva.service.UsuarioService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UsuarioConsumer {
    @Autowired
    private UsuarioService usuarioService;

    @RabbitListener(queues = "${rabbit.queue.name.usuario.crear}")
    public void listenerUsuarioCrear(UsuarioDomain usuarioDomain){
        usuarioService.create(usuarioDomain);
    }
    @RabbitListener(queues = "${rabbit.queue.name.usuario.eliminar}")
    public void listenerUsuarioEliminar(UsuarioDomain usuarioDomain){
        usuarioService.delete(usuarioDomain);
    }
}
