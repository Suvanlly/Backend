public class Clock
{
    private int hour;
    private int minutes;
    private int seconds;

    public Clock()
    {
        hour = 0;
        minutes = 0;
        seconds = 0;
    }

    public Clock(int newHour)
    {
        hour = newHour;
        minutes = 0;
        seconds = 0;
    }

    public Clock(int newHour, int newMinutes, int newSeconds)
    {
        hour = newHour;
        minutes = newMinutes;
        seconds = newSeconds;
    }

    public void display()
    {
        System.out.println("Hour: " + hour + ", Minutes: " + minutes + ", Seconds: " + seconds);
    }

    public int getHour()
    {
        return hour;
    }

    public int getMinutes()
    {
        return minutes;
    }

    public int getSeconds()
    {
        return seconds;
    }

    public static void main(String[] args)
    {
        Clock objClock = new Clock();
        objClock.showTime();
    }

    public void setHour(int newHour)
    {
        hour = newHour;
    }

    public void setMinutes(int newMinutes)
    {
        minutes = newMinutes % 60;
    }

    public void setSeconds(int newSeconds)
    {
        seconds = newSeconds;
    }

    public void showTime()
    {
        System.out.println(hour + ":" + minutes + ":" + seconds);
    }
}
