public class MultiLevelnher {
    public static void main(String[] args) {
        dog dobby = new dog();
        dobby.eat();
        dobby.legs = 4;
        System.out.println(dobby.legs);

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
    int legs;
}

//DERIVED CLAS
class dog extends Mammal{
    String breed;
}