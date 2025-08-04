import java.util.Arrays;

public class Display
{
    int id;
    int size;
    double price;
    String color;
    Display()
    {
        System.out.println("This is Default Constructor.");
    }
    Display(int id,int size,double price,String color)
    {
        this.id = id;
        this.size = size;
        this.price = price;
        this.color = color;
        System.out.println(this.id+" "+this.size+" "+this.price+" "+this.color);
    }
}
public class Cloth
{
    public static void main(String[] args) {
        Display d1 = new Display(1,5,5000.00,"blue");
        Display d2 = new Display();
    }
}









