// Importing Libraries
import java.util.*;

// Class Staff Declaration inheriting Class Person
public class Staff extends Person
{
    // Constructor For Staff
    public Staff(int Sid, int Sage, String Sname, String SphoneNo)
    {
        setID(Sid);
        setName(Sname);
        setAge(Sage);
        setPhoneNo(SphoneNo);;
    }

    // Printing Staff Information
    public void Print()
    {
        System.out.println("Name: " + getName());
        System.out.println("Phone: " + getPhoneNo());
        System.out.println("Age: " + getAge());
        System.out.println("ID: " + getID());
    }

    // Setting appointment for the patient
    public void setappointments(Doctor doc, Patient p)
    {
        Scanner input = new Scanner(System.in);
        int answer = 0;
        doc.availabledays();
        System.out.println("these are when the doctor is available");
        System.out.println("Please choose a day");
        answer = input.nextInt();
        input.nextLine();
        doc.Unavailable(answer-1);
    }
}