public class Overridding {
    public static void main(String[] args) {
        Fruit orange = new Orange();
        Fruit apple = new Apple();
        orange.eat();
        apple.eat();
    }
    //middlewareTech YOUTUBE CHANNEL
}
 
class Fruit{
    String name;
    String taste;
    double size;
    void eat()
    {
        System.out.println("Fruit");
    }
}
 
class Apple extends Fruit{
    String name = "Apple";
    String taste = "Sweet";
    void eat(){
        System.out.println(name+"/"+"Sweet");
    }
}
class Orange extends Fruit{
    String name = "Orange";
    String taste = "Sweetish Sour";
    void eat(){
        System.out.println(name+"/"+"Sweetish Sour");
    }
}