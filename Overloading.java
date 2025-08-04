public class Overloading
{
    static void printArray(int[] arr)
    {
        for (int i: arr) System.out.print(i+" ");
        System.out.println();
    }
    static void printArray(double[] arr)
    {
        for (double i: arr) System.out.print(i+" ");
        System.out.println();
    }
    static void printArray(char[] arr)
    {
        for (char i: arr) System.out.print(i+" ");
        System.out.println();
    }
    public static void main(String[] args)
     {
        int[] intArr = {1,2,3,4,5};
        char[] charArr = {'a','b','c'};
        double[] doubArr = {1d, 2d, 3d};
        printArray(intArr);
        printArray(charArr);
        printArray(doubArr);
    }
}