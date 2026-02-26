package desafios;

import java.util.Locale;
import java.util.Scanner;

public class ExFatorialBottomUp {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Abordagem Bottom-Up:
        System.out.println("Digite um número para ser calculado seu Fatorial:");
        int n = sc.nextInt();

        //Funciona como um Caderno, anota o anterior para se multiplicar pelo próximo
        int anotaFat = 1; //Começando em 1 não há o problema de ocorrer o Bug do Zero

        /*A contagem começa de 1 e vai até N, executando o anotaFat de baixo para cima e
        não como matematicamente aprendemos na escola */

        for (int i = 1; i <= n; i++) {
            anotaFat *= i ; // anotaFat = anotaFat anterior * i (próximo número)

            //Caso n seja 0, o For sequer é executado por já ser False i<=0
        }
        System.out.printf("Fatorial de %d = %d", n, anotaFat);






        sc.close();
    }
}
