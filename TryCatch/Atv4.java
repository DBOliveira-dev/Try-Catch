package TryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Atv4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Digite um número");
            Integer num1 = sc.nextInt();
            System.out.println("Digite o segundo número ");
            Integer num2 = sc.nextInt();
            Integer num3 = num1 + num2;
            System.out.println("O resultado do número é " +num3);


        } catch (InputMismatchException | ArithmeticException e ) {
            System.out.println("ERROR! O SISTEMA NÃO SUPORTA");
        }
    }
}
