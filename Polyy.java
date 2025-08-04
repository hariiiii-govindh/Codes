class Shape{void area(){System.out.println("Shape");}}
class Circle extends Shape{void area(){System.out.println("Circle");}}

class Polyy
{
        static void old(String name,int y)
        {
           System.out.println("hey "+name+" , you're "+y+" years old.");
        }
        static void old(String name,int y, int z)
        {
            System.out.println("hey "+name+" , you're between "+y+" and "+z+" years old.");
        }
        static int mul(int x,int y)
        {
            return x*y;
        }
        static double mul(double x,double y,double z)
        {
            return x*y*z;
        }
        public static void main(String[] args)
        {
            old("krishna", 6);
            old("hari hara", 6, 7);
            System.out.println(mul(5000, 500));
            System.out.println(mul(55.0, 555.0,600.0));
            Shape obj = new Circle();
            obj.area();
        }
}