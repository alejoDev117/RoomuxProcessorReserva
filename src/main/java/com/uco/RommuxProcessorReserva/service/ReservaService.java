package com.uco.RommuxProcessorReserva.service;

import com.uco.RommuxProcessorReserva.crossCutting.exception.RoomuxApiException;
import com.uco.RommuxProcessorReserva.domain.ReservaDomain;
import com.uco.RommuxProcessorReserva.messageService.messageReserva.ReservaMessageSender;
import com.uco.RommuxProcessorReserva.service.validator.ReservaValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ReservaService {

    @Autowired
    private ReservaMessageSender reservaMessageSender;


    public void create(ReservaDomain reservaDomain) throws Exception {

    }

    public void getAll() throws Exception {

    }

    public void consultByAutor(ReservaDomain reservaDomain) throws Exception {

    }
    public void consultBySala(ReservaDomain reservaDomain) throws Exception {
    }

    public void deleteById(UUID id) throws Exception {

    }

    public void update(ReservaDomain domain) throws Exception {

    }
}
