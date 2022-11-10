import java.time.LocalDate;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
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

    @Override
    public String toString() {
        String dayZero = "";
        String monthZero = "";
        String rezult = null;
        if (day > 0 && day < 31){
            if(month > 0 && month < 12){
                if (day <= 9){
                    dayZero = "0";
                }
                if(month <= 9){
                    monthZero = "0";
                }
                rezult = dayZero + day + "/" + monthZero + month + "/" + year;
            }else {
                rezult = "Invalid date!";
            }
        }else {
            rezult = "Invalid date!";
        }
        return rezult;
    }
}
