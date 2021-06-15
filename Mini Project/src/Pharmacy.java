// Importing Libraries
import java.util.ArrayList;

// Class Pharmacy Declaration
public class Pharmacy
{
    // ArrayList Declaration
    ArrayList <Medicine> medicine = new ArrayList<Medicine>();

    // Adding Medicine
    public void addMedicine(Medicine m)
    {
        medicine.add(m);
    }

    // Removing Medicine
    public void  removeMedicine( Medicine m)
    {
        medicine.remove(m);
    }

    // Getting Medicine
    public ArrayList<Medicine> getmedicine()
    {
        return medicine;
    }

    // Selling The Medicine to the Patient
    public void sell(Medicine m)
    {
        m.stock --;

        if(m.stock==0)
        {
            removeMedicine(m);
        }
    }
}