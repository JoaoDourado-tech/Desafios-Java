package desafios;

import java.util.Locale;
import java.util.Scanner;

public class ExPostoIfElse {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Usando While:
        System.out.println("Digite o NÚMERO de seus produtos de preferência:  ");
        System.out.println("(Pode haver mais de um, ao informá-los clicar em FIM)");

        System.out.println("1.Álcool;");
        System.out.println("2.Gasolina;");
        System.out.println("3.Diesel;");
        System.out.println("4.FIM.");

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        int produto = 0;

        while(produto != 4){

            System.out.println("Digite um Número: ");
            produto = sc.nextInt();

            if (produto == 1) {
                alcool++;
            } else if (produto == 2) {
                gasolina++;

            } else if (produto == 3) {
                diesel++;

            } else if (produto == 4) {
                System.out.println("FINALIZADO.");
                System.out.printf("ÁLCOOL: %d Pontos;%n", alcool);
                System.out.printf("GASOLINA: %d Pontos;%n", gasolina);
                System.out.printf("DIESEL: %d Pontos.%n", diesel);

            } else {
                System.out.println("[ERRO] DIGITE UM NÚMERO VÁLIDO!");
            }

        }
        sc.close();
    }
}
