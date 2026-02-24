/*2. Crie um programa que armazene as notas de 3
alunos em um vetor e exiba a média da turma. */

public class Exercicio2 {
    public static void main(String[] args) {
        int[] vetor = { 44, 67, 90 };

        int soma = 0;

        for (int media : vetor) {
            soma += media;
        }

        soma = soma / 3;

        System.out.println("A media dos alunos e: " + soma);

    }
}
