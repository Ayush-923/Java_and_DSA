public class staticKeyword {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "DVP";

        Student s2 = new Student();
        System.out.println(s2.schoolName);

        Student s3 = new Student();
        System.out.println(s3.schoolName);
    }
}

class Student{
    static int returnPercentage(int maths, int phy, int chem) {
        return(maths + phy + chem) / 3;
    }

    String name;
    int roll;

    static String schoolName;

    void getName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
}
