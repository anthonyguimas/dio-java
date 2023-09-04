package thirdWeek;

public class coments {

    public static void main(String[] args) {
        // comentário em uma única linha

        /*
        * Ahhhhh
        * Uhhhhh
        * Ehhhhh
        * Hahaha
         */
    // logo abaixo é um tipo de comentário recomendado para escrever documentações

    }
/** teste de como escrever um comentário em forma de documentação
 */
    public void metodo(){

    }
        /**
         * Este método foi elaborado as pressas
         * por isso eu abrevei o nome das variáveis
         * mas olha, ele tem a finalidade de somar ou  multiplicar
         * dois números

         */
    public int somaMultiplica (int n, int x, String m){
        int r = 0; // r é igual ao resultado
            if (m == "M"){ // M= multiplicação
                r = n * x;
            }else{
                // se não soma mesmo
                r = n + x;
            }
            return r;
}
}
