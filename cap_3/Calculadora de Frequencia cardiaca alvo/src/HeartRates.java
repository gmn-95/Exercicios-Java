import java.util.Calendar;
import java.util.Date;

public class HeartRates {
    private String name;
    private String lastName;
    private int    day;
    private int    month;
    private int    year;

    public HeartRates() {
    }

    public HeartRates(String name, String lastName, int day, int month, int year) {
        this.name       = name;
        this.lastName   = lastName;
        this.day        = day;
        this.month      = month;
        this.year       = year;
    }

    // retorna a idade em anos
    public int ageInYears(){
        Calendar cal = Calendar.getInstance();
        return cal.get(Calendar.YEAR) - year;
    }

    // retorna a frequência cardíaca máxima
    public int maximumHeartRate(){
        return 220 - ageInYears();
    }

    // retorna a frequência cardíaca alvo
    public double targetHeartRate(){
        return  maximumHeartRate() * 0.85;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
