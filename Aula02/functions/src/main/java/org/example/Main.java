package org.example;

public class Main {

    static boolean div(int numA, int numB){
        if (numA%numB == 0){
            return true;}
        return false;}



    public static void main(String[] args) {

        //        Exercício 1
//        Faça uma função que receba dois valores como parâmetro e que o retorno seja do tipo booleano.
//        A função deve verificar se o primeiro número é divisível pelo segundo.
//        NOTA: O fato de ser divisível pelo outro significa que ao dividir precisa dar um resultado exato,
//        ou seja, sem decimais.


        System.out.println(div(3,2));

    }
}