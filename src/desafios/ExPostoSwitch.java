package desafios;

import java.util.Locale;
import java.util.Scanner;

public class ExPostoSwitch {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Usando Switch-Case:
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

        while (produto != 4) {
            System.out.println("Digite o código do seu produto preferido ou FINALIZE: ");
            produto = sc.nextInt();

            switch (produto) {
                case 1:
                    alcool++;
                    break;
                case 2:
                    gasolina++;
                    break;
                case 3:
                    diesel++;
                    break;
                case 4:
                    System.out.println("FINALIZADO:");
                    System.out.printf("ÁLCOOL: %d Pontos;%n", alcool);
                    System.out.printf("GASOLINA: %d Pontos;%n", gasolina);
                    System.out.printf("Diesel: %d Pontos;%n", diesel);
                    break;
                default:
                    System.out.println("[ERRO] DIGITE UM NÚMERO CORRETO!");
                    break;
        }


        }
        sc.close();
    }
}
