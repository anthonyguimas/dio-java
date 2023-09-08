package thirdWeek;

public class ConditionalTernary {
    public static void main(String[] args) {

        int media = 10;
        String result = media >= 7 ? "Parábens você foi aprovado" : media >= 5 && media < 7 ? "Você está de recuperação" : "Você foi reprovado";
        System.out.println(result);
    }
}
