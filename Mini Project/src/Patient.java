// Class Patient Declaration inheriting Class Person
public class Patient extends Person
{
    // Declaring Protected Variables
    protected String prescription;

    // Constructor for Class Patient
    public Patient(int Pid, int Page, String Pname, String PphoneNo)
    {
        setID(Pid);
        setName(Pname);
        setAge(Page);
        setPhoneNo(PphoneNo);
    }

    // Printing Patient Information Method
    public void Print()
    {
        System.out.println("Name: " + getName());
        System.out.println("Phone: " + getPhoneNo());
        System.out.println("Age: " + getAge());
        System.out.println("ID: " + getID());
    }
}