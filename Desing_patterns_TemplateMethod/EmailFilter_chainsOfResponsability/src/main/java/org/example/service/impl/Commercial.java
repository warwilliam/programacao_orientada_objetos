package org.example.service.impl;

import org.example.model.Mail;
import org.example.service.HandlerMail;

public class Commercial extends HandlerMail {
    @Override
    public void check(Mail email) {
        if (email.getSubject().equalsIgnoreCase("comercial") || email.getDestiny().equalsIgnoreCase("comercial@colmeia.com")){
            System.out.println("Email encaminhado para o setor comercial");
        } else if(this.nextCheckMail != null){
            this.nextCheckMail.check(email);
        }
    }
}
