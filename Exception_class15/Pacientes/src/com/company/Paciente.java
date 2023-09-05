package com.company;

import javax.swing.*;
import java.util.Date;

public class Paciente {
    String nome;
    String sobrenome;
    String historiaClinica;
    Date dataInternacao;
    Date dataAlta;


    Paciente(String nome, String sobrenome, String historiaClinica, Date dataInternacao) throws PacientException {
        Date hoje = new Date();
        this.nome = nome;
        this.sobrenome = sobrenome;
        dataAlta = null;
        if (dataInternacao.before(hoje))
            throw new PacientException("Data nao pode ser anterior ou posterior a hoje: " + hoje);
        this.dataInternacao = dataInternacao;
    }

    public Date getDataInternacao() {
        return dataInternacao;
    }

    public Date getDataAlta() {
        return dataAlta;
    }

    public void darAlta(Date dataAlta) throws PacientException {
        if (dataAlta.before(dataInternacao))
            System.out.println( "Ok, paciente liberado!");
        else
            throw new PacientException("Data de alta não pode ser inferior a data de internação");

    }

}


