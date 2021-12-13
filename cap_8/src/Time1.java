public class Time1 {

    private int hour;
    private int minute;
    private int second;

    // configura um novo valor de tempo usando hora universal; lança uma
    // exceção se a hora, minuto ou segundo for inválido
    public void setTime(int hour, int minute, int second){

        // valida hora, minuto e segundo
        if(hour < 0 || hour >= 24 || minute < 0 || minute >= 60 || second < 0 || second >= 60){
            throw new IllegalArgumentException("hora, minuto e/ou segundo fora dos parametros");
        }

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // converte em String no formato de data/hora universal (HH:MM:SS)
    public String toUniversalString(){
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    // converte em String no formato padrão de data/hora (H:MM:SS AM ou PM)
    public String toString(){
        return String.format("%d:%02d:%02d %s",
                ((hour == 0 || hour == 12) ? 12 : hour % 12),
                minute, second, (hour < 12 ? "AM" : "PM"));
    }

}
