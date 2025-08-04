public class Hospital {
    
    int appointnum;
    String name;
    String branch;
    String doctor;
    long number;
    
    void checking(String name, int appointnum)
    {
        System.out.println(name + " whose appintment number is "+appointnum+" is done with checkup.");
    }
    void displayrankeddoctors(String doctor)
    {
        System.out.println(doctor + "is Highly Ranked Doctor");
    }
    void givingprescription(String name)
    {
        System.out.println(name + " is giving prescriptions.");
    }
    void operation(String name, int appintment)
    {
        System.out.println(name + " whose number is "+appintment+" is ready for the Operation.");
    }
    void holding(String name, int jnum)
    {
        System.out.println(name + " whose number  is "+appointnum+" is keeping his appointment on hold.");
    }
    public static void main(String[] args) {
        Hospital obj3 = new Hospital();
        
        obj3.checking("Rohit",45);
        obj3.displayrankeddoctors("Mitchel");
        obj3.givingprescription("Mitchel");
        obj3.operation("Glenn",6);
        obj3.holding("Rahul", 1);
    }
}





