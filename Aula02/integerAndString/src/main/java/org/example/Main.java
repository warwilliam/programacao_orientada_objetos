package org.example;

public class Main {
    public static void main(String[] args) {
//        Exercício 1
//        Defina duas sequências de texto. Verifique se são iguais
//        ou diferentes e indique por meio de mensagem.

        String person = "WILLIAM";
        String person2 = "william";
        int compare = 0;

       if( person.equalsIgnoreCase(person2)){
           System.out.println("This 2 persons hava a same name");
        } else {
           System.out.println("Have different names");
       }


//        Exercício 2
//        Defina duas variáveis Integer e determine pelo valor delas qual é maior,
//        qual é menor ou se são iguais. Mostre o resultado obtido.

        Integer numA = 15;
        Integer numB = 0;

        if (numA.equals(numB)) {
            System.out.println("equals numbers");
        }else {
            compare = numA.compareTo(numB);
            if (compare > 0) {
                System.out.println("NumA is biggest");
            } else {
                System.out.println("numB is biggest");
            }
        }
    }
}