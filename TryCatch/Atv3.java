package TryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Atv3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Digite um número");
            Double num1 = sc.nextDouble();
            if (num1 < 0) {
                System.out.println("Não é possivel fazer a raiz quadrada de números negativos");
            } else {
                Double raiz = Math.sqrt(num1);
                System.out.println("A raiz quadrada de " + num1 + " é " + raiz);
            }
            } catch(IllegalArgumentException | InputMismatchException | ArithmeticException e){
                System.out.println("O número é negativo ou invalido");
            } finally{
                sc.close();
            }
        }
    }
