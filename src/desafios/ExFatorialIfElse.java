package desafios;

import java.util.Locale;
import java.util.Scanner;

public class ExFatorialIfElse {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o Fatorial a ser calculado:");
        int n = sc.nextInt();

        int anotaFat = n; //Funciona como um "Caderno de Anotações" salvando o Fat anterior

        if (n == 0) { //Resolve o EdgeCase ("Caso Extremo" / Exceção) do caso de Fatorial de 0 = 1
            anotaFat = 1;
        } else { //Mantém o funcionamento normal do For
            for (int i = 1; i < n; i++) {
                anotaFat *= i; //Multiplica pelo próximo e já salva no "Caderno"
            }
        }
        System.out.printf("Fatorial -> %d! = %d", n, anotaFat);


        sc.close();
    }
}
