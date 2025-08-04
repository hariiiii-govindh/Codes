import java.util.*;
interface Compartment
{
    abstract void notice();
}
class Firstclass implements Compartment
{
    @Override
    public void notice()
    {
        System.out.println("FirstClass");
    }
}
class Ladies implements Compartment
{
    @Override
    public void notice()
    {
        System.out.println("Ladies");
    }
}
class General implements Compartment
{
    @Override
    public void notice()
    {
        System.out.println("General");
    }
}
class Luggage implements Compartment
{
    @Override
    public void notice()
    {
        System.out.println("luggage");
    }
}
class Testcompartment
{
    public static void main(String[] args)
    {
        Compartment[] arr = new Compartment[10];
        Random random = new Random();
        int i=10;
        while(i>0)
        {
            int rnum = random.nextInt(4)+1;
            switch (rnum)
            {
                case 1:
                    arr[i] = new Firstclass();
                    break;
                case 2:
                    arr[i] = new Ladies();
                    break;
                case 3:
                    arr[i] = new General();
                    break;
                case 4:
                    arr[i] = new Luggage();
                    break;
            }
        }
        for(int i=0;i<10;i++)
        {
            arr[i].notice();
        }

    }
}


