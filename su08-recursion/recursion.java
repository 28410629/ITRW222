public class recursion
{
    public static void main(String[] args)
    {
        System.out.println("TEST:");
        System.out.println("Factorial 10: "+ nFactorial(10));
        System.out.println("5 to the power 6: "+ xToN(5,6));
        System.out.println("Fibonacci 10: "+ fibin(10));
        System.out.println("String reverse: 'recursion': ");
        stringReverse("recursion", 9);
        System.out.println();
    }

    public static long nFactorial(long n)
    {
        if(n==0)
            return 1;
        
        return nFactorial(n-1)*n;
    }

    public static double xToN(double x, long n)
    {
        if(n==0)
            return 1;
        
        return xToN(x,n-1)*x;
    }

    public static long fibin(int n)
    {
        if(n==0)
            return 0;

        if(n==1 || n==2)
            return 1;

        return fibin(n-1) + fibin(n-2);
    }

    public static void stringReverse(String s, int n) //n = length
    {
        if(n==0)
            return;

        System.out.print(s.charAt(n-1));
        stringReverse(s, n-1);
    }

}