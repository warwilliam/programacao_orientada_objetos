package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

//    Desafio 1
//    Implemente um programa que nos permita exibir os primeiros n; números primos
//    pelo console, onde n é um valor numérico inserido pelo usuário. Por exemplo:
//    Com n = 7, o que o programa deve retornar é &quot;Os primeiros 7 números primos são:
//            2, 3, 5, 7, 11, 13, 17


    static boolean isPrime(int num1){
        if (num1 <=1){
            return false;
        }

        for (int i=2; i<=Math.sqrt(num1); i++){
            if(num1 % i == 0){
                return false;
            }
        }

        return true;
    }




    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter how many prime numbers you want: ");
        int quantity=  in.nextInt();

        ArrayList<Integer> primes = new ArrayList<>();

        int j = 0;
        for (int i=0; j<quantity;i++){
            if (isPrime(i)){
                j++;
                primes.add(i);
            }
        }
        System.out.println("The prime numbers found is: "+primes);
    }
}