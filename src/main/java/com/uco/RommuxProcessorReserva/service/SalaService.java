package com.uco.RommuxProcessorReserva.service;


import com.uco.RommuxProcessorReserva.crossCutting.exception.RoomuxApiException;
import com.uco.RommuxProcessorReserva.crossCutting.utils.UtilText;
import com.uco.RommuxProcessorReserva.crossCutting.utils.UtilUUID;
import com.uco.RommuxProcessorReserva.domain.SalaDomain;
import com.uco.RommuxProcessorReserva.messageService.messageSala.SalaMessageSender;
import com.uco.RommuxProcessorReserva.service.validator.SalaValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class SalaService {

    @Autowired
    private SalaMessageSender salaMessageSender;

    public void create(SalaDomain domain) {
        System.out.println(domain.toString());
    }


    public void consult(SalaDomain salaDomain){
        consultByName(salaDomain);
        consultAll(salaDomain);
    }

    private void consultByName(SalaDomain domain){
        System.out.println(domain.toString());
    }

    private  void consultAll(SalaDomain domain){
        System.out.println(domain.toString());
    }


    public void delete(SalaDomain salaDomain){
        deleteByName(salaDomain.getNombreSala());
        deleteByUUID(salaDomain.getIdentificador());
    }

    private void deleteByName(String name){

    }
    private void deleteByUUID(UUID uuid){

    }
}
