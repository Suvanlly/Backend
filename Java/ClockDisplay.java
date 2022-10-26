public class ClockDisplay
{
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private NumberDisplay seconds;
    private String displayString;

    public ClockDisplay()
    {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        seconds = new NumberDisplay(60);
        updateDisplay();
    }

    public ClockDisplay(int second)
    {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        seconds = new NumberDisplay(60);
        setClock(second);
    }

    public ClockDisplay(int hh, int mm, int sec)
    {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        seconds = new NumberDisplay(60);
        //hours = new NumberDisplay(24, hh);
        //minutes = new NumberDisplay(60, mm);
        //seconds = new NumberDisplay(60, sec);
        setTime(hh,mm,sec);
        //updateDisplay();
    }

    public String getTime()
    {
        return displayString;
    }

    public NumberDisplay getHours()
    {
        return hours;
    }

    public NumberDisplay getMinutes()
    {
        return minutes;
    }

    public NumberDisplay getSeconds()
    {
        return seconds;
    }

    public static void main(String[] args)
    {
        ClockDisplay objClock1 = new ClockDisplay();
        System.out.println("Time for Obj Clock1: " + objClock1.getTime());

        ClockDisplay objClock2 = new ClockDisplay(12,23,45);
        objClock2.timeTick();

        ClockDisplay objClock3 = new ClockDisplay(10000);
        System.out.println("Time for Obj Clock3: " + objClock3.getTime());
        
        ClockDisplay objClock4 = new ClockDisplay(10001);
        System.out.println("Time for Obj Clock4: " + objClock4.getTime());

        ClockDisplay objClock5 = (objClock4.subtractClock(objClock3));
        System.out.println("Time Difference:" + objClock5.getTime());
        
    }

    public void setTime(int hh, int mm, int sec)
    {
        hours.setValue(hh);
        minutes.setValue(mm);
        seconds.setValue(sec);
        updateDisplay();
    }

    public void setHours(NumberDisplay hours)
    {
        this.hours = hours;
    }

    public void setMinutes(NumberDisplay minutes)
    {
        this.minutes = minutes;
    }

    public void setSeconds(NumberDisplay seconds)
    {
        this.seconds = seconds;
    }

    public void setClock(int second)
    {
        hours.setValue(second / 3600);
        minutes.setValue((second / 60) % 60);
        seconds.setValue(second % 60);
        updateDisplay();
    }

    public ClockDisplay subtractClock(ClockDisplay clock)
    {
        return new ClockDisplay((this.getHours().getValue() - clock.getHours().getValue()),
        (this.getMinutes().getValue() - clock.getMinutes().getValue()),
        (this.getSeconds().getValue() - clock.getSeconds().getValue()));
    }

    public void tickDown()
    {
        System.out.println("Before Time being clicked:" + getTime());
        seconds.decrement();
        updateDisplay();
        System.out.println("After Time increment performed:" + getTime());
    }

    public void timeTick()
    {
        System.out.println("Before Time being clicked:" + getTime());
        seconds.increment();
        updateDisplay();
        System.out.println("After Time increment performed:" + getTime());
    }

    public void updateDisplay()
    {
        displayString = hours.getValue() + ":" + minutes.getValue() + ":" + seconds.getValue();
    }
    
}
