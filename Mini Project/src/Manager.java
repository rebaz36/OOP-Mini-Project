// Importing Libraries
import java.util.ArrayList;
import java.util.Vector;
import java.util.Scanner;

// Class Manager Declaration Inheriting Class Person
public class Manager extends Person
{
    // ArrayList Declaration
    ArrayList <Staff> staff = new ArrayList<Staff>();

    // Vector Declaration
    Vector <Doctor>  doctor = new Vector<Doctor>();

    // Constructor
    Manager(int Mid, int Mage, String Mname, String MphoneNo)
    {
        setID(Mid);
        setName(Mname);
        setAge(Mage);
        setPhoneNo(MphoneNo);;
    }

    // Method Type of Vector To get Vector
    public Vector<Doctor> getdoctor()
    {
        return doctor;
    }

    // Method Type of ArrayList to Get ArrayList
    public ArrayList<Staff> getstaff()
    {
        return staff;
    }
    // Adding Staff Method
    public void addStaff(Staff s)
    {
        staff.add(s);
    }
    // Adding Doctor Method
    public void addDoc(Doctor d)
    {
        doctor.add(d);
    }
    // Firing Staff Method
    public void fireStaff(int chosen)
    {
        staff.remove(chosen);
    }
    // Printing Doctor Method
    public void printDoctors()
    {
        for(int i=0; i < doctor.size(); i++)
        {
            System.out.println(i+1);
            System.out.println("Name: " + doctor.get(i).getName());
            System.out.println("Phone: " + doctor.get(i).getPhoneNo());
            System.out.println("Age: " + doctor.get(i).getAge());
            System.out.println("ID: " + doctor.get(i).getID());
            System.out.println("-------------------------------------");
        }
    }

    // Printing Staff Method
    public void printStaff()
    {
        for(int i=0; i < staff.size(); i++)
        {
            System.out.println(i+1);
            System.out.println("Name: " + staff.get(i).getName());
            System.out.println("Phone: " + staff.get(i).getPhoneNo());
            System.out.println("Age: " + staff.get(i).getAge());
            System.out.println("ID: " + staff.get(i).getID());
            System.out.println("-------------------------------------");
        }
    }

    // Editing Schedule of Doctor Method
    public void editschedule(int dindex)
    {
        int ddindex =0;
        String note ="";
        Scanner f = new Scanner(System.in);
        System.out.println("which days do you want to edit?");

        // Loop to Go Through The Days
        for(int i =0; i< doctor.get(dindex).schedule.length ; i++)
        {
            note = "Not Available";

            if(doctor.get(dindex).schedule[i].available)
            {
                note = "Available";
            }

            System.out.println((i + 1) + "-");
            System.out.println(doctor.get(dindex).schedule[i].getDate() + " available: " + note);
            System.out.println("------------------------------------------");
        }

        ddindex = f.nextInt();
        f.nextLine();

        doctor.get(dindex).schedule[ddindex-1].available = !doctor.get(dindex).schedule[ddindex-1].available;
        System.out.println("The availabilty was toggled successfully");
    }

    // Firing Doctor Method
    public void fireDoctor(int chosen)
    {
        doctor.remove(chosen);
    }

    // Printing Manager Information
    public void Print()
    {
        System.out.println("Hello " + getName() + "these are your information");
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Phone Number: " + getPhoneNo());
        System.out.println("ID: " + getID());
    }
}