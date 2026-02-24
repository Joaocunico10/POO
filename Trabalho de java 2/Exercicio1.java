/*1. Crie um programa que leia 5 números inteiros,
armazene-os em um vetor e, ao final, mostre a soma
total e qual foi o maior número digitado.*/

public class Exercicio1 {
    public static void main(String[] args) {
            int[] vetor = { 10, 12, 15, 16, 22}; // ou new int[nuemro de vetores], se fosse com string seria somente {"Aula", "Banco", ...}

            int soma = 0;

            for (int i : vetor) {
                soma += i;
            }

            System.out.println("A soma dos numeros e: " + soma );
        }
}
