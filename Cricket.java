public class Cricket {
    
    int jnum;
    String name;
    String team;
    int ranking;
    int ht;
    
    void batting(String name, int jnum)
    {
        System.out.println(name + " whose Jersey number is "+jnum+" is Batting Quite Good.");
    }
    void bowling(String name, int ranking)
    {
        System.out.println(name + " ranked "+ranking+" is bolwing with Good Pace.");
    }
    void fielding(String name, int jnum)
    {
        System.out.println(name + " whose Jersey number is "+jnum+" is on the field.");
    }
    void catching(String name, int ht)
    {
        System.out.println(name + " whose height is "+ht+" is catching the Ball.");
    }
    void keeping(String name, int jnum)
    {
        System.out.println(name + " whose Jersey number is "+jnum+" is keeping Quite Good.");
    }
    public static void main(String[] args) {
        Cricket obj1 = new Cricket();
        
        obj1.batting("Rohit Sharma",45);
        obj1.bowling("Mitchel Starc",1);
        obj1.fielding("Mitchel Starc", 13);
        obj1.catching("Glenn Philips",6);
        obj1.keeping("KL Rahul", 1);
    }
}





