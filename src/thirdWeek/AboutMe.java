package thirdWeek;

public class AboutMe {

    public static void main(String[] args) {
        // os argumentos começam com o indíce 0
        String name = args[0];
        String lastName = args[1];
        int age = Integer.valueOf(args[2]); // Wrappers
        double height = Double.valueOf(args[3]);

        System.out.println("E aí, meu nome é " + name + " " + lastName);
        System.out.println("Eu tenho " + age + " anos");
        System.out.println("Minha altura é de " + height + "cm");
    }
}
