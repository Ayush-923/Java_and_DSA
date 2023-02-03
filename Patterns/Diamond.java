public class Diamond {
    
    public static void diamond_patter(int n) {
        //1st half code
        for(int i=1; i<=n; i++)
        {
            //Space
            for(int j=1; j<=(n-i); j++)
            {
                System.out.print(" ");
            }

            //Star
            for(int j=1; j<=(2*i - 1); j++)
            {
                System.out.print("*");
            }

            //Space
            for(int j=1; j<=(n-i); j++)
            {
                System.out.print(" ");
            }
        System.out.println();
        }



        //2nd half code
        for(int i=n; i>=1; i--)
        {
            //Space
            for(int j=1; j<=(n-i); j++)
            {
                System.out.print(" ");
            }

            //Star
            for(int j=1; j<=(2*i - 1); j++)
            {
                System.out.print("*");
            }

            //Space
            for(int j=1; j<=(n-i); j++)
            {
                System.out.print(" ");
            }
        System.out.println();
        }
        
    }

    public static void main(String[] args) {
        diamond_patter(6);
    }
}
