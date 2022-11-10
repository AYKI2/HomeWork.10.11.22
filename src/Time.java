public class Time {
    private int hour;
    private int minute;
    private int seconds;

    public Time(int hour, int minute, int seconds) {
        if(hour < 24 && hour >= 0) {
            this.hour = hour;
        }else {
            System.out.println("Invalid time!");
            this.hour = 0;
        }
        if(minute < 60 && minute >= 0) {
            this.minute = minute;
        }else {
            System.out.println("Invalid time!");
            this.minute = 0;
        }if(seconds < 60 && seconds >= 0) {
            this.seconds = seconds;
        }else {
            System.out.println("Invalid time!");
            this.seconds = 0;
        }
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public void nextSecond() {
        if (seconds < 60) {
            seconds++;
            if (seconds == 60) {
                minute++;
                seconds = 0;
                if (minute == 60) {
                    hour++;
                    minute = 0;
                    if (hour == 24){
                        hour = 0;
                    }
                }
            }
        }
    }
    public void previousSecond() {
        if (seconds >= 0) {
            seconds--;
            if (seconds == -1) {
                minute--;
                seconds = 59;
                if (minute == -1) {
                    hour--;
                    minute = 59;
                    if(hour == -1){
                        hour = 23;
                    }
                }
            }
        }
    }

    public void specificPlusSecond(int number) {
        int sum = number + seconds;
        if (sum >= 0 && sum <= 60) {
            if (seconds < 60) {
                seconds = seconds + number;
                if (seconds == 60) {
                    minute++;
                    seconds = 0;
                    if (minute == 60) {
                        hour++;
                        minute = 0;
                        if (hour == 24) {
                            hour = 0;
                        }
                    }
                }
            }
        }else {
            System.out.println("Invalid time");
        }
    }
    public void specificMinusSecond(int number) {
        int sum = seconds - number;
        if (sum >= -1 && sum <= 60) {
            if (seconds >= 0) {
                seconds = seconds - number;
                if (seconds == -1) {
                    minute--;
                    seconds = 59;
                    if (minute == -1) {
                        hour--;
                        minute = 59;
                        if(hour == -1){
                            hour = 23;
                        }
                    }
                }
            }
        }else {
            System.out.println("Invalid time");
        }
    }

    @Override
    public String toString() {
        String hourZero = "";
        String minuteZero = "";
        String secodZero = "";
        String rezult = null;
        if(hour >= 0 && hour < 24) {
            if (minute >= 0 && minute < 60) {
                if (seconds >= 0 && seconds < 60) {
                    if(hour <= 9){
                        hourZero = "0";
                    }
                    if (seconds <= 9) {
                        secodZero = "0";
                    }
                    if (minute <= 9) {
                        minuteZero = "0";
                    }
                    rezult = hourZero + hour + ":" + minuteZero + minute + ":" + secodZero + seconds;
                } else {
                    rezult = "Invalid time!";
                }
            } else {
                rezult = "Invalid time!";
            }
        }else {
            rezult = "Invalid time!";
        }
        return rezult;
    }
}
