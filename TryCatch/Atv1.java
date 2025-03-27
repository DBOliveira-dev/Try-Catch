package TryCatch;

import java.util.Scanner;

public class Atv1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro numero : ");
        Integer num1 = sc.nextInt();

        System.out.print("Digite o sgundo numero : ");
        Integer num2 = sc.nextInt();

        try {
            Integer num3 = num1 / num2;
            System.out.println("O resultado é : " + num3);
        } catch (ArithmeticException | MatchException e) {
            System.out.println("ERRO!");
        }


        }
    }

