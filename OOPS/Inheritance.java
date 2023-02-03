public class Inheritance {
    public static void main(String[] args) {
        fish whale = new fish();
        whale.eat();
    }
}

class Animal{
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breaths");
    }
}

class fish extends Animal{
    int fins;

    void swim() {
        System.out.println("swims in water.");
    }
}
