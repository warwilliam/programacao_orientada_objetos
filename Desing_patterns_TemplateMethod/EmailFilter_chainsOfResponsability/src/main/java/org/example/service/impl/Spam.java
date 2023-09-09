package org.example.service.impl;

import org.example.model.Mail;
import org.example.service.HandlerMail;

public class Spam extends HandlerMail{
    @Override
    public void check(Mail email) {
        System.out.println("email classificado e encaminhado para a caixa de spam!");
    }
}
