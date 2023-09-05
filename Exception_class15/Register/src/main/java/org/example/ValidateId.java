package org.example;

public class ValidateId {

    public static boolean validar(String cpf) throws ValidatedIdException{
        if (cpf.length()<11)
            throw new ValidatedIdException("cpf precisa ter 11 digitos");

        return true;
    }

}
