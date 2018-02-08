public class ThreeNplus1
{

    public static void main(String[] args)
    {
        int count = 0;
        for (int i=100; i>1; i--, count = 0)
        {
            for(int n=i; n>1; count++)
            {
                if( n%2==0 )
                {
                    n=n/2;
                }
                else
                {
                    n=n*3+1;
                }
                System.out.print(n + " ");
            }
            System.out.println();
            System.out.println("It took " + count + " steps to get to 1 for " + i + ".");
        }
    }
}
