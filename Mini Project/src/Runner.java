// Importing Libraries
import java.util.*;

// Class Runner Declaration
public class Runner
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in) ;

        boolean loop = true;
        int answer, answer1, answer2, answer3=20, last;
        String name, phone;
        int age, id, patient_id =100;

        Patient patient = new Patient(patient_id, 12, "Mhamad Raad", "07701844913");

        patient_id++;

        Doctor d1 = new Doctor("Raman Bahadin", 29, "07704726161",0001);
        Doctor d2 = new Doctor("Zhilwan Baxtyar", 28, "07729592774", 0002);
        Doctor d3 = new Doctor("Renwar Baxtyar", 30, "07736988576", 0003);

        Manager manager = new Manager(0000, 25, "Rebaz Farid", "07500495");

        Staff s1 = new Staff(0004, 20, "Siroz Taib", "07517286335");
        Staff s2 = new Staff(0004, 20, "chenar Taib", "07517286225");
        Staff s3 = new Staff(0004, 20, "mala Ali", "07517212335");

        manager.addStaff(s1);
        manager.addStaff(s2);
        manager.addStaff(s3);

        manager.addDoc(d1);
        manager.addDoc(d2);
        manager.addDoc(d3);

        Schedule [] sd = new Schedule[]
                {
                        new Schedule("Sunday", true) , new Schedule("Monday", true),
                        new Schedule("Tuesday", false), new Schedule("Wednesday", false),
                        new Schedule("Thursday", false), new Schedule("Friday", false),
                        new Schedule("Saturday", false)
                };

        Schedule [] sd1 = new Schedule[]
                {
                        new Schedule("Sunday", false) , new Schedule("Monday", false),
                        new Schedule("Tuesday", true), new Schedule("Wednesday", true),
                        new Schedule("Thursday", false), new Schedule("Friday", false),
                        new Schedule("Saturday", false)};

        Schedule [] sd2 = new Schedule[]
                {
                        new Schedule("Sunday", false) , new Schedule("Monday", false),
                        new Schedule("Tuesday", false), new Schedule("Wednesday", false),
                        new Schedule("Thursday", true), new Schedule("Friday", true),
                        new Schedule("Saturday", true)
                };

        manager.getdoctor().get(0).setschedule(sd);
        manager.getdoctor().get(1).setschedule(sd1);
        manager.getdoctor().get(2).setschedule(sd2);

        Medicine m1 = new Medicine("Panadol", 5,10,"2 time(s) a day");
        Medicine m2 = new Medicine("Asprin", 2,5,"1 time(s) a day");
        Medicine m3 = new Medicine("Velivet", 5,2,"3 time(s) a day");

        Pharmacy pharmacy = new Pharmacy();

        pharmacy.addMedicine(m1);
        pharmacy.addMedicine(m2);
        pharmacy.addMedicine(m3);

        System.out.println("1- Manager");
        System.out.println("2- Patient");
        answer = input.nextInt();


        if(answer == 1)
        {
            manager.Print();

            while (loop)
            {
                System.out.println("What would you like to do today?");
                System.out.println("1- Print Doctors");
                System.out.println("2- Print Staff");
                System.out.println("3- Fire Staff");
                System.out.println("4- Fire Doctor");
                System.out.println("5- Hire Staff");
                System.out.println("6- Hire Doctors ");
                System.out.println("7- Edit Doctor Schedules");
                System.out.println("8- Exit");
                answer1 = input.nextInt();
                input.nextLine();
                if (answer1 == 1)
                {
                    manager.printDoctors();
                }

                else if (answer1 == 2)
                {
                    manager.printStaff();
                }

                else if (answer1 == 3)
                {
                    manager.printDoctors();
                    System.out.println("Which one would you like to fire?");
                    answer2 = input.nextInt();
                    manager.fireDoctor(answer2-1);
                }

                else if (answer1 == 4)
                {
                    manager.printStaff();
                    System.out.println("Which one would you like to fire?");
                    answer2 = input.nextInt();
                    manager.fireStaff(answer2-1);
                }

                else if (answer1 == 5)
                {
                    System.out.println("input the name of the new Staff:");
                    name = input.nextLine();
                    System.out.println("Input phone number:");
                    phone = input.nextLine();
                    System.out.println("Input The age: ");
                    age = input.nextInt();
                    input.nextLine();
                    System.out.println("Input The ID: ");
                    id = input.nextInt();
                    input.nextLine();
                    manager.addDoc(new Doctor(name, age, phone, id));
                }

                else if (answer1 == 6)
                {
                    System.out.println("input the name of the new Doctor:");
                    name = input.nextLine();
                    System.out.println("Input phone number:");
                    phone = input.nextLine();
                    System.out.println("Input The age: ");
                    age = input.nextInt();
                    input.nextLine();
                    System.out.println("Input The ID: ");
                    id = input.nextInt();
                    input.nextLine();
                    manager.addStaff(new Staff(id, age, name, phone));
                }

                else if(answer1 == 7)
                {
                    System.out.println("Which doctor do you want to edit their schedule? ");
                    manager.printDoctors();
                    last = input.nextInt();
                    input.nextLine();
                    manager.editschedule(last-1);
                }

                else if(answer1 == 8)
                {
                    loop = false;
                }
                //while
            }
            //if
        }

        if(answer == 2)
        {
            System.out.println("Hello patient Please choose a staff member to serve your needs");
            manager.printStaff();
            answer1 = input.nextInt();
            input.nextLine();

            System.out.println("Hello dear i am " + manager.getstaff().get((answer1-1)).getName());
            System.out.println("Could you fill this questionnaire");
            System.out.println("Name: ");
            name = input.nextLine();
            System.out.println("Age: ");
            age = input.nextInt();
            input.nextLine();
            System.out.println("Phone number: ");
            phone = input.nextLine();

            while(loop)
            {
                System.out.println("thank you, who do you want to have an appointment with?");
                manager.printDoctors();
                answer2 = input.nextInt();
                input.nextLine();
                System.out.println("This is the available days for " + manager.getdoctor().get((answer2 - 1)).getName());
                manager.getdoctor().get((answer2 - 1)).availabledays();
                System.out.println("would you like to choose a different doctor with different schedules?");
                System.out.println("1- Yes");
                System.out.println("2- No");
                answer = input.nextInt();
                if(answer == 2)
                {
                    loop = false;

                    while(answer3 > 7)
                    {
                        System.out.println("please choose one of the days: ");
                        manager.getdoctor().get((answer2 - 1)).availabledays();
                        answer3 = input.nextInt();
                        input.nextLine();

                        if (answer3 > 7)
                        {
                            System.out.println("Invalid input, try again");
                        }

                        else if(answer3 < 7)
                        {

                            if (manager.getdoctor().get(answer2 - 1).schedule[answer3 - 1].available)
                            {
                                Appointment appointment = new Appointment(manager);
                                Patient p = new Patient(patient_id, age, name, phone);

                                String pr;
                                appointment.meeting(answer2 - 1, answer1 - 1, p, manager.getdoctor().get(answer2 - 1).schedule[answer3 - 1]);
                                manager.getdoctor().get((answer2 - 1)).Unavailable(answer3 - 1);

                                System.out.println("Doctor please write a Prescription: ");
                                pr =input.nextLine();

                                p.prescription = pr;

                                for (int i =0; i<pharmacy.getmedicine().size();i++)
                                {

                                    if (p.prescription == pharmacy.getmedicine().get(i).returnname())
                                    {
                                        System.out.println("The item you need is available at the Pharmacy");
                                        System.out.println("would you like to purchase it?");
                                        System.out.println("1- Yes");
                                        System.out.println("2- No");
                                        answer = input.nextInt();
                                        input.nextLine();

                                        if(answer == 1)
                                        {
                                            pharmacy.sell(pharmacy.getmedicine().get(i));
                                        }
                                    }
                                }
                            }

                            else if(!manager.getdoctor().get(answer2 - 1).schedule[answer3 - 1].available)
                            {
                                answer3 =0;
                            }
                        }
                    }
                }
            }
        }

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Merci");
    }
}