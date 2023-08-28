package secondWeek;

public class Operators {

    public static void main (String[] args) {

        String completeName = "Carro" + " " + "Skyline\n";
        System.out.print(completeName);

        int number = 1000;
            number = number + 100;
        // outra maneira de acresentar um número é digitar numero++ que aí adiciona o seu número que está declarado mais 1.
        System.out.print(number);

        boolean variable = true;

        variable = !variable;

        System.out.print(variable);

        /*
        int a, b;

        a = 5;
        b = 20;
        String result = "";
          if(a==b)
              result = "Verdadeiro";
          else
              result = "Falso";
          */
        //Aqui em cima é uma maneira de se fazer

        int a, b;

        a = 11;
        b = 12;

        String result = a == b ? "Verdadeiro" : "Falso";
        //Aqui em cima é o operador ternário é um jeito abreviado de se fazer
        System.out.print(result);

    }
}

