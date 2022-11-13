package object;

/**
 * клас, що відповідає за час
 */
public class Time {
    int hours;
    int minutes;
    String strTime;

    Time(String time){

        this.hours = Integer.parseInt(""+time.charAt(0)+time.charAt(1));
        this.minutes = Integer.parseInt(""+time.charAt(3)+time.charAt(4));
        this.strTime=time;
    }

    @Override
    public String toString() {
        return hours + ":" + minutes;
    }
    /**
     * повернення рядка часу
     * @return strTime
     */
    public String getStrTime() {
        return strTime;
    }
}
