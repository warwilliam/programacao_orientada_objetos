package org.example.service;


import org.example.model.Mail;
import org.example.service.impl.Commercial;
import org.example.service.impl.Manager;
import org.example.service.impl.Spam;
import org.example.service.impl.Tecnic;


public class CheckMail {

    HandlerMail beginning;

    public CheckMail(){

        this.beginning =  new Commercial();
        HandlerMail tecnico = new Tecnic();
        HandlerMail gerencia = new Manager();
        HandlerMail spam = new Spam();

        beginning.setNextCheckMail(tecnico);
        tecnico.setNextCheckMail(gerencia);
        gerencia.setNextCheckMail(spam);

    }

    public void check(Mail mail){
        beginning.check(mail);
    }


}
