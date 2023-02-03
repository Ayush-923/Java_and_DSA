public class hieraricalInheritance {
    public static void main(String[] args) {
        
    }
}
//BASE CLASS
class Animal{
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breaths");
    }
}

//Derived class
class Mammal extends Animal{
    void walk(){
        System.out.println("walk");
    }
}

//Derived class
class fish extends Animal{
    void swim(){
        System.out.println("swim");
    }
}


//Derived class
class birds extends Animal{
    void fly(){
        System.out.println("fly");
    }
}