package com.company;

import sun.util.calendar.LocalGregorianCalendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws PacientException, ParseException {
        Date date = new Date();
        String dataInformada = "2023-08-10"; // Data no formato "yyyy-MM-dd"
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date data = sdf.parse(dataInformada);
	    Paciente paciente=new Paciente("Juan","Perez","12345",new Date(2023,8,30));
        paciente.darAlta(data);




    }
}
