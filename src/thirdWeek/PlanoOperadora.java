package thirdWeek;

public class PlanoOperadora {
    public static void main(String[] args) {

        String plano = "Turbo"; //Basic /Midia /Turbo

        System.out.println(plano);

        if(plano == "Basic")
            System.out.println("100 minutos de ligação");
            else if(plano == "Midia"){
                System.out.println("100 minutos de ligação + Whats e Instagram grátis");
            } else if (plano == "Turbo") {
                System.out.println("100 minutos de ligação + Whats e Instagram grátis + 5gb Youtube");
        } else {
                System.out.println("Você escolheu nenhum plano disponível");
        }
    }
}

