public class SolidRhombus {
    
    public static void solid_rhombus(int n) {
        //Outer Loop
        for (int i = 1; i <= n; i++) {


            //loop for spaces
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }



            //Loop for Stars
            for(int j=1; j<=n; j++)
            {
                System.out.print("*");
            }



            System.out.println();

        }
        
    }
    public static void main(String[] args) {
        solid_rhombus(4);
    }
    
}