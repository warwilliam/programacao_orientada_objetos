package org.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.SimpleFormatter;

public class Main {
    public static void main(String[] args) throws ParseException {

//     Faça um programa Java que solicite do usuário seu nome e sobrenome separadamente,
//     e a sua data de nascimento.  Para a data solicite que o usuário digite 3 valores
//     que representam o dia, mês e ano. Além disso, a partir das variáveis do nome e sobrenome
//     obtenha em uma terceira com as iniciais do usuário.
//     Em seguida, exiba uma mensagem, com seu nome, as iniciais do seu nome e sobrenome
//     e sua data de nascimento no formato "dd / mm / aaaa"

        String name;
        String lastName;
        String chars;
        Scanner inNames;
        String bornDate;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name");
        name = in.nextLine();
        System.out.println("Enter your last name");
        lastName = in.nextLine();
        System.out.println("Enter born data dd/mm/yyyy ");
        bornDate = in.nextLine();
        chars = name.charAt(0)+" "+lastName.charAt(0);

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = formatter.parse(bornDate);
        System.out.println("Your full name is: "+name+" "+lastName+" and the initials is "+chars+
                " and born date is: "+date);
    }
}