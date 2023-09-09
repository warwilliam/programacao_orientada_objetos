package org.example;

import org.example.model.Mail;
import org.example.service.CheckMail;

public class Program {
    public static void main(String[] args) {

        CheckMail checkMail = new CheckMail();

        Mail mail = new Mail("corrente de fake news","colmeia","mude a sua vida da noite pro dia");
        Mail mail1 = new Mail("orçamentos","colmeia","tecnico");
        Mail mail2 = new Mail("parceiria","comercial","comercial");
        Mail mail3 = new Mail("Condominio","gerencia","gerencia");

        checkMail.check(mail);
        checkMail.check(mail1);
        checkMail.check(mail2);
        checkMail.check(mail3);

    }
}