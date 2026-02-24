/*Crie um vetor de inteiros já preenchido. Peça para o
usuário digitar um número e verifique se esse
número existe no vetor, imprimindo "Encontrado" ou
"Não encontrado". */

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        int[] vetor = {1, 2, 5, 3, 9};

        System.out.println("Vamos jogar, digite um numero entre 0 e 10 e eu irei ta faler se acertou ou nao!");

        Scanner numero_digitado = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = numero_digitado.nextInt();

        boolean encontrado = false;

        for (int i = 0; i <= 4; i++) {
            if (vetor[i] == numero) {
                encontrado = true;
                break;
            }  
        }
        
        if (encontrado) {
            System.out.println("Numero encontrado!");
        } else {
            System.out.println("Nenhum numero encontrado");
        }
        
    }
}
