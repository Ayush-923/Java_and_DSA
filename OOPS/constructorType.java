public class constructorType {
    
    public static void main(String[] args) {
        Student s1= new Student();
        s1.name = "Ayush";
        s1.roll = 923;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 91;
        s1.marks[2] = 88;
        Student s2 = new Student(s1);
        s2.password = "xyz";
        s1.marks[2] = 100;

        for(int i=0; i<3; i++)
        {
            System.out.println(s2.marks[i]);
        }
        // Student s2 = new Student("Ayush");
        // Student s3 = new Student(923);
    }
}
class Student{
    String name;
    int roll;
    String password;
    int marks[];

    //Copy Constructor
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = s1.marks;
    }


    //non-prarameterized
    Student()
    {
        marks = new int[3];
        System.out.println("Calling constructor..");
    }


    //Parameterized
    Student(String name)
    {
        marks = new int[3];
        this.name = name;
    }
    Student(int roll)
    {
        marks = new int[3];
        this.roll = roll;
    }
}
