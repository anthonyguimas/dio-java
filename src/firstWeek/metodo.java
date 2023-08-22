package firstWeek;

public class metodo {
        public static void main (String [] args){

        String firstName = "Anthony";
        String lastName = "Guimarães";

        String completeName = completeName(firstName, lastName);
        System.out.println(completeName);

        }
        // Métodos

        public static String completeName (String firstName, String lastName) {
            return firstName.concat(" ").concat(lastName);
        }
}
