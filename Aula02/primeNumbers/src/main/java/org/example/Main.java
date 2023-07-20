package org.example;

import java.util.Scanner;

public class Main {

//    Exercício 1
//    Faça uma função que, dado um número, indica se é um número primo ou não.
//    Um número primo é aquele que só pode ser dividido por 1 e ele mesmo. Por exemplo: 25 não é primo,
//    pois 25 é divisível por 1, 5 e 25. 17 é primo porque só pode ser dividido por 1 e por 17.
//    Para usar esta função que iremos criar, podemos permitir a entrada de apenas
//    um número do usuário para verificar se o número é primo ou não.
//    Para resolvê-lo, use a função obtida no exercício desenvolvido na aula assíncrona,
//    Boolean eDivisível (int n, int divisor).

    static boolean div(int num1, int num2){
        if (num1%num2 != 0 || num1 ==2){
            return true;}
        return false;}

    static int mostBig(int a, int b, int c){
        int biggest =0;
        if (a>b && a>c){ biggest = a; }
        if (b>a && b>c){ biggest = b; }
        if (c>b && a<c){ biggest = c; }
        return biggest;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int numA = 0;
        int numB = 0;
        int numC = 0;

        int num1 = 0;
        int num2 = 2;

        System.out.println("Enter a number");
        num1 = in.nextInt();

        System.out.println(div(num1, num2));


        System.out.println("Enter a number");
        numA = in.nextInt();
        System.out.println("Enter a number");
        numB = in.nextInt();
        System.out.println("Enter a number");
        numC = in.nextInt();

        System.out.println(mostBig(numA,numB,numC));

    }
}