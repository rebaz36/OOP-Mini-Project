// Class Person is an Abstract Class
public abstract class Person
{
    // Variable Declaration For Class Person
    private     String  Name;
    private     int     Age;
    private     String  PhoneNo;
    private     int     ID;

    // Getters and Setter Methods For Variables In Class Person
    public String getName()
    {
        return Name;
    }
    public void setName(String name)
    {
        Name = name;
    }

    public int getAge()
    {
        return Age;
    }
    public void setAge(int age)
    {
        Age = age;
    }

    public String getPhoneNo()
    {
        return PhoneNo;
    }
    public void setPhoneNo(String phoneNo)
    {
        PhoneNo = phoneNo;
    }

    public int getID()
    {
        return ID;
    }
    public void setID(int ID)
    {
        this.ID = ID;
    }

    public abstract void Print();
}