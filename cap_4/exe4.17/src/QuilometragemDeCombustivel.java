import java.util.Locale;
import java.util.Scanner;

public class QuilometragemDeCombustivel {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Viagens viagem = new Viagens();

        char resp;

        do{
            System.out.print("Digite os quilometros dirigidos: ");
            int quilometros = sc.nextInt();

            System.out.print("Digite os litros de gasolina consumidos: ");
            int litrosConsumidos = sc.nextInt();

            System.out.println();

            double consumo = (double) viagem.consumo(quilometros, litrosConsumidos);
            viagem.setQuilometragemTotal(quilometros);
            viagem.setTotalLitros(litrosConsumidos);

            System.out.println("Consumo em quilômetros/litro: " + consumo);
            System.out.println("Quilometragem total: " + viagem.getQuilometragemTotal());
            System.out.println("Total de litros de combustível consumidos: " + viagem.getTotalLitros());
            System.out.println();

            System.out.print("Deseja continuar - s/n? ");
            sc.nextLine();
            resp = sc.nextLine().charAt(0);


            System.out.println();

        }while (resp == 's' || resp == 'S');

        sc.close();
    }
}
