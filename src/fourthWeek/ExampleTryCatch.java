package fourthWeek;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ExampleTryCatch {

    public static void main(String[] args) {
            try {
                    //criando o objeto scanner
                    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

                    System.out.println("Digite seu nome");
                    String name = scanner.next();

                    System.out.println("Digite seu sobrenome");
                    String lastName = scanner.next();

                    System.out.println("Digite sua idade");
                    int age = scanner.nextInt();

                    System.out.println("Digite sua altura");
                    double height = scanner.nextDouble();


                    //imprimindo os dados obtidos pelo usuario
                    System.out.println("Ola, me chamo " + name + " " + lastName);
                    System.out.println("Tenho " + age + " anos ");
                    System.out.println("Minha altura é " + height + "cm ");
            }
            catch (InputMismatchException e){
                    System.out.println("O campo idade foi digitado incorretamente, por favor tente novamente");
            }


    }
}
