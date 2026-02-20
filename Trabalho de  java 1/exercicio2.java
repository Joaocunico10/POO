public class exercicio2 {
    public static void main(String[] args) {
        char operacao = '*';
        int numero = 20;
        int numero2 = 10;

        System.out.println("O sistema a seguir vai ser uma calculadora simples + - / * ");   

        switch (operacao) {
            case '+':
                System.out.println("Resultado: " + (numero + numero2));
                break;
            case '-':
                System.out.println("Resultado: " + (numero - numero2));
                break;
            case '*':
                System.out.println("Resultado: " + (numero * numero2));
                break;   
            case '/':
                System.out.println("Resultado: " + (numero / numero2));
                break;        
        }
    }
}
