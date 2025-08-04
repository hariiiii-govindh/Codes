 class Cricket
 {
    String name;
    int jerseynum;
    String team;
    Cricket(String name,int jerseynum,String team)
        {
            this.name = name;
            this.jerseynum = jerseynum;
            this.team = team;
            System.out.println("I'm "+this.name+",my jersey number is "+this.jerseynum+" and plays for "+this.team+".");
    
        }    
 }
public class Code
{
    public static void main(String args[]) 
    {
        Cricket c = new Cricket("Mitchel Starc",43,"Australia");
    }
}















