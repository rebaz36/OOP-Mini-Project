// Importing Libraries
import java.util.ArrayList;
import java.util.Scanner;

// Class Doctor Declaration Inheriting Class Person
public class Doctor extends Person
{
    // composition relationship
    protected Schedule [] schedule =  new Schedule[7];

    // constructor
    public Doctor(String n, int age, String phone, int i )
    {
        setAge(age);
        setName(n);
        setID(i);
        setPhoneNo(phone);
    }

    // setting object Schedule
    public void setschedule(Schedule [] s)
    {
        schedule = s;
    }

    // printing available days of Doctors
    public void availabledays()
    {
        for(int i =0; i< schedule.length && schedule[i].available; i++)
        {
            System.out.println((i+1) + "-");
            System.out.println("Day: " + schedule[i].getDate());
            System.out.println("------------------------------------------");
        }
    }

    // printing Doctor Informations
    public void Print()
    {
        System.out.println("Name: " + getName());
        System.out.println("Phone: " + getPhoneNo());
        System.out.println("Age: " + getAge());
        System.out.println("ID: " + getID());
    }

    // setting schedules as unavailable
    public void Unavailable(int index)
    {
        schedule[index].available = false;
    }
}