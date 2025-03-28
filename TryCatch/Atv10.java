package TryCatch;
import java.util.Scanner;

public class Atv10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para calcular o fatorial: ");
        try {
            Integer numero = sc.nextInt();

            if (numero < 0) {
                throw new Exception("Não é possível calcular o fatorial de um número negativo.");
            }

            if (numero > 20) {
                throw new Exception("Número maior que 20. Limite para cálculo do fatorial.");
            }

            System.out.println("Fatorial de " + numero + " é: " + fatorial(numero));

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public static int fatorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * fatorial(n - 1);

    }
}