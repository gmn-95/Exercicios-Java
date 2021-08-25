public class Date1 {
    private int month;
    private int day;
    private int year;

    public Date1(int day, int month, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public void displayDate(){
        System.out.println(day + "/" + month + "/" + year);
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
