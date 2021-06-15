import java.util.ArrayList;
public class Appointment
{
    // RelationShip Type ???
    Manager manager;

    // Constructor to assign Manager object
    public Appointment(Manager m)
    {
        manager = m;
    }

    // meeting function to print doctor Appointments
    public void meeting(int dindex, int sindex, Patient patient, Schedule schedule)
    {
        System.out.println("Doctor: ");
        manager.getdoctor().get(dindex).Print();
        System.out.println("Meeting prepared by:");
        manager.getstaff().get(sindex).Print();
        System.out.println("Patient: ");
        patient.Print();
    }
}