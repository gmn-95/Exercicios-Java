/*
* Para mostrar que os números produzidos por nextInt ocorrem com
* probabilidade aproximadamente igual, vamos simular
* 6.000.000 lançamentos de um dado com o aplicativo da Figura 6.7.
* Todo número inteiro de 1 a 6 deve aparecer cerca de 1.000.000 vezes.
* */

import java.security.SecureRandom;

public class RollDie {
    public static void main(String[] args) {

        SecureRandom randomNumbers = new SecureRandom();

        int frequancy1 = 0;
        int frequancy2 = 0;
        int frequancy3 = 0;
        int frequancy4 = 0;
        int frequancy5 = 0;
        int frequancy6 = 0;

        // soma 6.000.000 lançamentos de um dado
        for(int roll = 1; roll <= 6000000; roll++){

            // número entre 1 e 6
            int face = 1 + randomNumbers.nextInt(6);

            // usa o valor 1–6 para as faces a fim de determinar qual contador incrementar
            switch (face){
                case 1:
                    ++frequancy1;
                    break;

                case 2:
                    ++frequancy2;
                    break;

                case 3:
                    ++frequancy3;
                    break;

                case 4:
                    ++frequancy4;
                    break;

                case 5:
                    ++frequancy5;
                    break;

                case 6:
                    ++frequancy6;
                    break;
            }
        }

        System.out.printf("Face\tFrequancy\n");
        System.out.printf("1\t\t%d%n2\t\t%d%n3\t\t4%d%n4\t\t5%d%n5\t\t%d%n6\t\t%d%n", frequancy1, frequancy2,
                frequancy3, frequancy4, frequancy5, frequancy6);

    }
}
