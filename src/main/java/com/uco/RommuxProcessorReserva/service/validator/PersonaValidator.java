package com.uco.RommuxProcessorReserva.service.validator;


import com.uco.RommuxProcessorReserva.crossCutting.utils.UtilEmail;
import com.uco.RommuxProcessorReserva.crossCutting.utils.UtilText;
import org.springframework.stereotype.Component;

@Component
public class PersonaValidator {

    private PersonaValidator(){

    }

    public static boolean nameIsValid(String name){
        return !UtilText.containsNumbers(name) && !UtilText.containsSpecialCharacters(name);
    }
    public static boolean idIsValid(String id){
        return id.length() > 0 && id.length() <= 11 && !id.startsWith("-");
    }
    public static boolean emailIsValid(String email){
        return UtilEmail.emailIsValid(email);
    }
}
