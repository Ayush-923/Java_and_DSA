public class Abstract {
    public static void main(String[] args) {
        // Horse h = new Horse();
        // h.eat();
        // h.walk();

        // Chiken c = new Chiken();
        // c.eat();
        // c.walk();

        Mustang myHorse = new Mustang();
        //Animal -> horse -> Mustang
    }
}

abstract class Animal{
    String color;

    Animal() {
        System.out.println("Animal constructored called..");
    }

    void eat(){
        System.out.println();
        System.out.println("animal eats");
    }

    abstract void walk();
}

class Horse extends Animal{

    Horse()
    {
        System.out.println("Hourse constructur called... ");
    }
    void changeColor() {
        color = "dark brown";
    }
    void walk(){
        System.out.println("Walks on four legs");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang class is called !!");
    }
}

class Chiken extends Animal{
    void walk(){
        System.out.println("walks on 2 legs");
    }
}
