import java.util.Scanner;

public class atividade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, num;

        // nesta parte pede os os numeros e valores que serao usados.
        System.out.print("QUANTOS NÚMEROS VOCE DESEJA TESTAR? ");
        n = input.nextInt();

        // verifica cada um dos N números digitados
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");

            // nesta parte verifica se o valor digitado é inteiro.
            while (!input.hasNextInt()) {
                System.out.print("Valor inválido! Digite novamente: ");
                input.next();
            }

            num = input.nextInt();

            // verifica se o número é positivo, negativo ou zero e exibe a mensagem de saída.
            if (num > 0) {
                System.out.println(num + " é positivo.");
            } else if (num < 0) {
                System.out.println(num + " é negativo.");
            } else {
                System.out.println(num + " é zero.");
            }
        }

        input.close();
        
    }
}

