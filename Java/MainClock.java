class MainClock
{
    public static void main(String[] args)
    {
        Clock objClock = new Clock(23,59,59);
        objClock.showTime();
        objClock.setMinutes(75);
        objClock.showTime();
    }
}
