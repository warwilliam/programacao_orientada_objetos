package org.example.service;

import org.example.model.Mail;

public abstract class HandlerMail {

    protected HandlerMail nextCheckMail;

    public HandlerMail getNextCheckMail(){
        return this.nextCheckMail;
    }

    public void setNextCheckMail(HandlerMail checkMail){
        this.nextCheckMail = checkMail;
    }

    public abstract void check(Mail email);

}
