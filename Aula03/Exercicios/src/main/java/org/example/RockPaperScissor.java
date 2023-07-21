package org.example;

import java.util.Scanner;

public class RockPaperScissor {

//    Desafio 2
//    Faça um programa que permita jogar o jogo "Pedra-Papel-Tesoura".
//    Primeiro, o aplicativo solicita o nome de cada jogador e, em seguida,
//    qual a opção esse jogador escolhe para jogar: pedra, papel ou tesoura.
//    jogo consiste em perguntar qual opção cada um escolhe e somar pontos ao vencedor —se houver—.
//    Defina e use uma função chamada whichWin ou quemGanha
//    com dois parâmetros com as jogadas de cada um dos jogadores, que retorna 0 em caso de empate,
//    1 se o primeiro vencer, 2 se o segundo vencer.
//    O jogo termina quando o primeiro escolhe "*" como indicador de fim.

    static int whichWin(int n1, int n2){
        int result =0;
        if (n1==n2){
            result = 0;
        }if (n1-n2== -2 || n1-n2==1){
            result = 1;
        }if(n1-n2== -1 || n1-n2==2) {
            result = 2;
        }
        return result;
    }




    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter name player1");
        String player1 = in.nextLine();
        System.out.println("Enter name player2");
        String player2 = in.nextLine();

        int scorePlayer1 = 0;
        int scorePlayer2 = 0;

        while (true){

            System.out.println("player1 select: 0 for rock, 1 for paper or 2 for scissor");
            int num1= in.nextInt();
            if (num1 == 5)
                break;
            System.out.println("player2 select: 0 for rock, 1 for paper or 2 for scissor");
            int num2= in.nextInt();
            if (num2 == 5)
            break;

            int resultRound = whichWin(num1,num2);
            if(resultRound == 0) {
                System.out.println("empate!");
            }if (resultRound == 1){
                System.out.println("player1 Win!");
                scorePlayer1 +=1;
            }if(resultRound == 2){
                System.out.println("Player2 win");
                scorePlayer2 +=1;
            }
        }

        System.out.println("Game Over");
        System.out.println("Final Score:");
        System.out.println("Score player1: "+scorePlayer1);
        System.out.println("Score player2: "+scorePlayer2);

    }

}
