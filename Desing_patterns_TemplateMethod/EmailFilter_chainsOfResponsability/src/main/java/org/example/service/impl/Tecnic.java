package org.example.service.impl;

import org.example.model.Mail;
import org.example.service.HandlerMail;

public class Tecnic extends HandlerMail {
    @Override
    public void check(Mail email) {
        if (email.getSubject().equalsIgnoreCase("tecnico") || email.getDestiny().equalsIgnoreCase("tecnico")){
            System.out.println("Email encaminhado para o setor tecnico");
        } else if(this.nextCheckMail != null){
            this.nextCheckMail.check(email);
        }
    }
}
