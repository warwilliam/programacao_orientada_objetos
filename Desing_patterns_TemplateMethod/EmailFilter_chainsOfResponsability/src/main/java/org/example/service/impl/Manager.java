package org.example.service.impl;

import org.example.model.Mail;
import org.example.service.HandlerMail;

public class Manager extends HandlerMail {
    @Override
    public void check(Mail email) {
        if (email.getSubject().equalsIgnoreCase("gerencia") || email.getDestiny().equalsIgnoreCase("gerencial")){
            System.out.println("Email encaminhado para o setor gerencial");
        } else if(this.nextCheckMail != null){
            this.nextCheckMail.check(email);
        }
    }
}
