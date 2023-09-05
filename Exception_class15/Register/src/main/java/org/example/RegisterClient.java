package org.example;

import javax.swing.*;

public class RegisterClient {

    public static void main(String[] args) throws ValidatedIdException {

        String name = "William Rodrigues";
            if (name == null)
                System.out.println("O nome é nulo");
            else {
                if (name.length() < 5)
                    System.out.println("Nome deve conter mais de 5 caracteres");
                return;

            }

            try {
                String mininame = name.substring(0,5);
                System.out.println(mininame);
            }catch (Exception e){
                e.printStackTrace();
            }

             try {
                 ValidateId.validar("123456789");
             }catch (ValidatedIdException e){
                 e.printStackTrace();
             }
    }
}
