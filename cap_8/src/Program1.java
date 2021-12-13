

public class Program1 {
    public static void main(String[] args) {

        Time1 time = new Time1();

        displayTime("Depois que o objeto de tempo é criado", time);
        System.out.println();

        // altera a data/hora e gera saída da data/hora atualizada
        time.setTime(13, 27, 6);
        displayTime("After calling setTime", time);
        System.out.println();

        try{
            time.setTime(99, 99, 99);
        }
        catch (IllegalArgumentException e){
            System.out.printf("Exception: %s%n%n", e.getMessage());
        }

        displayTime("After calling setTime", time);

    }

    private static void displayTime(String header, Time1 t){
        System.out.printf("%s%nUniversal time: %s%nStandard time: %s%n",
                header, t.toUniversalString(), t.toString());
    }
}
