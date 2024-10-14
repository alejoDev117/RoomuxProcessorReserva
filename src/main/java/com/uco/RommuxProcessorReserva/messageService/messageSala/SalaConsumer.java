package com.uco.RommuxProcessorReserva.messageService.messageSala;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.uco.RommuxProcessorReserva.domain.SalaDomain;
import com.uco.RommuxProcessorReserva.service.SalaService;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class SalaConsumer {
    @Autowired
    private SalaService salaService;

    @RabbitListener(queues = "${rabbit.queue.name.sala.crear}")
    public void listenerCrearSala(SalaDomain sala){
        salaService.create(sala);
    }

    @RabbitListener(queues = "${rabbit.queue.name.sala.consultar}")
    public void listenerConsultarSala(SalaDomain sala){
        salaService.create(sala);
    }

    @RabbitListener(queues = "${rabbit.queue.name.sala.eliminar}")
    public void listenerEliminarSala(SalaDomain sala){
        salaService.create(sala);
    }

}
