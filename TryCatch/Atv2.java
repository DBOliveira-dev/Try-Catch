package TryCatch;

import java.util.Scanner;

public class Atv2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try  {
            System.out.print("Digite um número : ");
            String text = sc.next();
            Integer num = Integer.parseInt(text);

            System.out.println("O número é "+ num);
            } catch(NumberFormatException e ) {
            System.out.println("ERROR! O SISTEMA NÃO SUPORTA");
        } finally {
            sc.close();
            }
        }
    }










