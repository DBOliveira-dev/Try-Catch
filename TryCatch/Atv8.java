package TryCatch;

import java.util.Scanner;

public class Atv8 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Digite sua idade: ");
            Integer idade = sc.nextInt();

            try {
                if (idade < 0) {
                    throw new Exception("Idade não pode ser negativa.");
                }

                if (idade >= 18) {
                    System.out.println("Você é maior de idade.");
                } else {
                    System.out.println("Você é menor de idade.");
                }

            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }

