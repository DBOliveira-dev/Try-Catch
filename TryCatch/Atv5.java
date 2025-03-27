package TryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Atv5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] num = {10, 20, 30, 40, 50};
        try{
            System.out.print("Digite um número : ");
            Integer indice = sc.nextInt();
            System.out.println("O numero do indice" + indice + "é" + num[indice]);

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Fora dos Limites");

        }finally {
            sc.close();
        }

    }
}