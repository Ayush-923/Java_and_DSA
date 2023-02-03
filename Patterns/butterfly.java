public class butterfly {

    public static void butterfly_patter(int n) {

        //FIRST HALF
        for (int i = 1; i <= n; i++) 
        {
            //Initial Stars
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }

            //In-Between Spaces
            for(int j = 1; j<= 2*(n-i); j++)
            {
                System.out.print(" ");
            }

            //Last Stars
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }

        System.out.println();
        }

        //2ND HALF
        for (int i=n; i>=1; i--) 
        {

            //Initial Stars
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }

            //In-Between Spaces
            for(int j = 1; j<= 2*(n-i); j++)
            {
                System.out.print(" ");
            }

            //Last Stars
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }

        System.out.println();
        }
        
    }
    public static void main(String[] args) {
        butterfly_patter(20);
    }
}
