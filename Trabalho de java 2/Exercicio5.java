/*Faça um programa que leia um número e desenhe
uma escada de asteriscos no console: */

public class Exercicio5 {
    public static void main(String[] args) {
        int numero = 15;

        System.out.println("O programa ira fazer uma magica, somente mudo o campo NUMERO!");

        for (int i = 0; i < numero; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        
    }
}
