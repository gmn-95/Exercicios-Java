import java.security.SecureRandom;

public class RandomIntegers {
    public static void main(String[] args) {
        // o objeto randomNumbers produzirá números aleatórios seguros
        SecureRandom randomNumbers = new SecureRandom();

        for(int cont = 1; cont <= 20; cont++){
            // seleciona o inteiro aleatório entre 1 e 6
            int face = 1 + randomNumbers.nextInt(6);

            System.out.printf("%d  ", face);

            // se o contador for divisível por 5, inicia uma nova linha de saída
            if(cont % 5 == 0){
                System.out.println();
            }
        }

    }
}
