public class Klasa {
    private String sec;
    private String min;
    private String hour;
    private String time;

    @Override
    public String toString() {
        return hour + ":" + min + ":" + sec;
    }

    public String getSec() {
        return sec;
    }

    public void setSec(String sec) {
        this.sec = sec;
    }

    public String getMin() {
        return min;
    }

    public void setMin(String min) {
        this.min = min;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Klasa() {
    }

    public Klasa(String sec, String min, String hour, String time) {
        this.sec = sec;
        this.min = min;
        this.hour = hour;
        this.time = time;
    }
}
