package TryCatch;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Atv9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        try {
            Double celsius = scanner.nextDouble();

            if (celsius < -273.15) {
                throw new Exception("Temperatura abaixo do zero absoluto!");
            }

            Double fahrenheit = (celsius * 9/5) + 32;
            System.out.println("Temperatura em Fahrenheit: " + fahrenheit);
        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Por favor, insira um número válido.");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}