class School {
    
    String roll;
    String name;
    String Class;
    int ranking;
    int ht;
    
    void displaybestatsocial(String name, int roll)
    {
        System.out.println(name + " whose roll number is "+roll+" is Quite Good at Social.");
    }
    void displaybestatscience(String name, int ranking)
    {
        System.out.println(name + " ranked "+ranking+" is Good at Science.");
    }
    void displaybestatmaths(String name, int roll)
    {
        System.out.println(name + " whose roll number is "+roll+" is at solving Mathematics.");
    }
    void displaybestatgames(String name, int ht)
    {
        System.out.println(name + " whose height is "+ht+" is goot at games.");
    }
    void displaybestatphysicalexams(String name, int ht)
    {
        System.out.println(name + " whose height is "+ht+" is goot at physicalexam.");
    }
   
    public static void main(String[] args) {
        School obj2 = new School();
       

        
        obj2.displaybestatsocial("Rohit Sharma",45);
        obj2.displaybestatscience("Mitchel Starc",1);
        obj2.displaybestatmaths("Mitchel Starc", 13);
        obj2.displaybestatgames("Glenn Philips",5);
        obj2.displaybestatphysicalexams("Glenn Philips",5);
       
    }
}





