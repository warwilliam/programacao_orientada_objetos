package com.company;

public class PacientException extends Exception {

    public PacientException() {
        super();
    }

    String message ;

    public PacientException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "Ocorreu uma exceção: " + this.getClass().getName() +"\n"+"COm a seguinte mensagem: " + this.getMessage();

    }
}
