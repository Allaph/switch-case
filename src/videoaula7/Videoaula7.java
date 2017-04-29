/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videoaula7;

import java.util.Scanner;

/**
 *
 * @author absyd
 */
public class Videoaula7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // programa que receb um número, avalia, classifica e informa o nome desse numero

        int numero;

        Scanner s = new Scanner(System.in);

        System.out.println("informe um numero inteiro: ");
        numero = s.nextInt();

        switch (numero) { //recebe o parametro para ser analisado nos cases
            case 1: //será executado quando o valor for 1
                System.out.println("O número informado é um");
                break; // efetua a parada do sistema
            case 2:
                System.out.println("O número informado é dois");
                break;
            case 3:
                System.out.println("O número informado é Três");
                break;
            case 4:
                System.out.println("O número informado é Quatro");
                break;
            case 5:
                System.out.println("O número informado é Cinco");
                break;
            case 6:
                System.out.println("O número informado é Seis");
                break;
            case 7:
                System.out.println("O número informado é Sete");
                break;
            case 8:
                System.out.println("O número informado é Oito");
                break;
            case 9:
                System.out.println("O número informado é Nove");
                break;
            case 10:
                System.out.println("O número informado é Dez");
                break;
        }

    }

}
