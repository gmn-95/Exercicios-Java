import java.util.Calendar;

public class HealthProfile {
    private String name;
    private String lastName;
    private int    day;
    private int    month;
    private int    year;
    private double height; // altura
    private double weight; // peso

    public HealthProfile() {
    }

    public HealthProfile(String name, String lastName, int day, int month, int year, double height, double weight) {
        this.name = name;
        this.lastName = lastName;
        this.day = day;
        this.month = month;
        this.year = year;
        this.height = height;
        this.weight = weight;
    }

    public int ageInyears(){
        Calendar cal = Calendar.getInstance();
        return  cal.get(Calendar.YEAR) - year;
    }

    // retorna a frequência cardíca máxima
    public int maxmumHeartRate(){
        return 220 - ageInyears();
    }

    // retorna a frequência cardíaca alvo
    public double targetHeartRate(){
        return maxmumHeartRate() * 0.85;
    }

    // retorna o imc
    public double imc(){
        return weight / (height * height);
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        weight = weight;
    }
}
