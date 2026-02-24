/*Crie um vetor com 10 números inteiros. Percorra o
vetor e exiba a quantidade de números pares e a
quantidade de números ímpares (Use if com o
operador %). */

public class Exercicio3 {
    public static void main(String[] args) {
        int[] vetor = { 2, 3, 5, 8, 10, 11, 12, 15, 16, 18 };

        int par = 0;
        int impar = 0;

        for (int numeros : vetor) {
            if (numeros % 2 == 0) {
                System.out.println("O numero " + numeros + " e par");
                par++;
            }
            if (numeros % 2 != 0) {
                System.out.println("O numero " + numeros + " e impar");
                impar++;
            }
        }

        System.out.println();

        System.out.println("Quantidade de numeros pares: " + par);
        System.out.println("Quantidade de numeros impar: " + impar);

    }

}
