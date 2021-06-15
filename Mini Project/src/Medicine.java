// Class Medicine Declaration
public class Medicine
{
    // Variable Declaration
    String MedicineName;
    protected int stock;
    String note;
    double price;

    // Constructor For Class Medicine
    public Medicine(String m, double p, int num, String note)
    {
        MedicineName = m;
        price =p;
        stock = num;
        this.note = note;
    }

    // Returning Name Method
    String returnname()
    {
        return MedicineName;
    }
}