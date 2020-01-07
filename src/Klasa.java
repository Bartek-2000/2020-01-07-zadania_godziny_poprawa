public class Klasa {
    private String sec;
    private String min;
    private String hour;

    @Override
    public String toString() {
        return hour+":"+min+":"+sec;
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

    public Klasa() {
    }

    public Klasa(String sec, String min, String hour) {
        this.sec = sec;
        this.min = min;
        this.hour = hour;
    }
}
