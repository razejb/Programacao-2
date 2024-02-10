public class IntEqualityPrinter {

    public static void printEqual(int x, int y, int z)
    {
        if(x > -1 && y > -1 && z > -1)
        {
            if((x == y) && (x == z) && (y == z))
            {
                System.out.println("All numbers are equal");
            }
            else if((x != y) && (x != z) && (y != z))
            {
                System.out.println("All numbers are different");
            }
            else
            {
                System.out.println("Neither all are equal or different");
            }
        }
        else
        {
            System.out.println("Invalid Value");
        }
    }
}