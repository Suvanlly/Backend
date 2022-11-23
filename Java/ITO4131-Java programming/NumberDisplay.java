public class NumberDisplay
{
    private int limit;
    private int value;

    public NumberDisplay()
    {
        limit = 0;
        this.value = 0;
    }

    public NumberDisplay(int rollOverLimit)
    {
        limit = rollOverLimit;
        value = 0;
    }

    public NumberDisplay(int rollOverLimit, int value)
    {
        limit = rollOverLimit;
        this.value = value;
    }
    
    public void decrement()
    {
        value = (value - 1);//if the value is 0?
    }
    
    public int getValue()
    {
        return value;
    }

    public String getDisplayValue()
    {
        return "" + value;
    }

    public void setValue(int replacementValue)
    {
        value = replacementValue;
    }

    private void setLimit(int limit)
    {
        this.limit = limit;
    }

    public void increment()
    {
        value = (value + 1) % limit;
    }
}
