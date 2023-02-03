import java.util.Scanner;

public class StringCreation {

    public static void printLetters(String str)
    {
        for(int i=0; i<str.length(); i++)
        {
            System.out.print(str.charAt(i)+" ");
        }
    }

    public static void main(String[] args) {
        
        char arr[] = {'a', 'b', 'c' ,'d'};
        String str = "abcd";
        String str1 = new String("xyz");
        //STRINGS ARE IMMUTABLE

        Scanner sc = new Scanner(System.in);
        String name;
        //SC.NEXT ONLY TAKE ONE WORD FROM THE STRING
        // name = sc.next();

        //SC.NEXTLINE TAKES THE WHOLE LINE INTO CONSIDARATION 
        // name = sc.nextLine();
        // System.out.println(name);

        // //.LENGTH() IS USED TO FIND THE LENGTH OF STRING
        // System.out.println(name.length());

        //CONCATINATION
        String firstname = "Ayush";
        String lastname = "Gupta";
        String fullname = firstname + " " + lastname;
        // System.out.println("My full name is: "+fullname);

        //Charat function
        // System.out.println(fullname.charAt(0));
        printLetters(fullname);
    }
}