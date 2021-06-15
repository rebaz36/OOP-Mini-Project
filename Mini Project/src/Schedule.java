// Class Schedule Declaration
public class Schedule
{
    // Private Variable Declaration
    private String day;

    // Protected Boolean Variable
    protected boolean available;

    // Function to get GetDate
    public String getDate()
    {
        return day;
    }

    // Schedule Function to set days and availability
    public Schedule(String day, boolean a)
    {
        available = a;
        this.day = day;
    }
}