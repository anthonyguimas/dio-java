package thirdWeek;

import java.util.Locale;
import java.util.Scanner;

public class CompundConditional {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite a sua nota!");
        int finalMedia = scanner.nextInt();

        if (finalMedia >= 7)
            System.out.println("Você foi aprovado");
            else if (finalMedia >= 5 && finalMedia < 7)
            System.out.println("Você está de recuperação");
            else {
            System.out.println("Você foi reprovado");
        }

    }
}

